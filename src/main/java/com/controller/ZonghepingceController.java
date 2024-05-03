
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 综合评测
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zonghepingce")
public class ZonghepingceController {
    private static final Logger logger = LoggerFactory.getLogger(ZonghepingceController.class);

    private static final String TABLE_NAME = "zonghepingce";

    @Autowired
    private ZonghepingceService zonghepingceService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChengjiService chengjiService;//学生成绩
    @Autowired
    private DictionaryService dictionaryService;//字典表
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private HuodongService huodongService;//活动
    @Autowired
    private JiangxuejinShenqingService jiangxuejinShenqingService;//奖学金申请
    @Autowired
    private LaoshiService laoshiService;//老师
    @Autowired
    private NewsService newsService;//政策信息
    @Autowired
    private XueshengService xueshengService;//学生
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = zonghepingceService.queryPage(params);

        //字典表数据转换
        List<ZonghepingceView> list =(List<ZonghepingceView>)page.getList();
        for(ZonghepingceView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZonghepingceEntity zonghepingce = zonghepingceService.selectById(id);
        if(zonghepingce !=null){
            //entity转view
            ZonghepingceView view = new ZonghepingceView();
            BeanUtils.copyProperties( zonghepingce , view );//把实体数据重构到view中
            //级联表 学生
            //级联表
            XueshengEntity xuesheng = xueshengService.selectById(zonghepingce.getXueshengId());
            if(xuesheng != null){
            BeanUtils.copyProperties( xuesheng , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "xueshengId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setXueshengId(xuesheng.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZonghepingceEntity zonghepingce, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zonghepingce:{}",this.getClass().getName(),zonghepingce.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("学生".equals(role))
            zonghepingce.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ZonghepingceEntity> queryWrapper = new EntityWrapper<ZonghepingceEntity>()
            .eq("xuesheng_id", zonghepingce.getXueshengId())
            .eq("xuenian_types", zonghepingce.getXuenianTypes())
            .eq("xueqi_types", zonghepingce.getXueqiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZonghepingceEntity zonghepingceEntity = zonghepingceService.selectOne(queryWrapper);
        if(zonghepingceEntity==null){

            ChengjiEntity chengjiEntity = chengjiService.selectOne(new EntityWrapper<ChengjiEntity>()
                    .eq("xuesheng_id", zonghepingce.getXueshengId())
                    .eq("xuenian_types", zonghepingce.getXuenianTypes())
                    .eq("xueqi_types", zonghepingce.getXueqiTypes())
            );
            if(chengjiEntity != null){
                zonghepingce.setZonghepingceChengjiDefen(chengjiEntity.getChengjiDefen());
            }else{
                zonghepingce.setZonghepingceChengjiDefen(0.0);
            }

            List<DictionaryEntity> huodongDejiangList = dictionaryService.selectList(new EntityWrapper<DictionaryEntity>()
                    .eq("dic_code", "huodong_dejiang_types")
                    .eq("dic_name", "活动得奖")
            );
            HashMap<Integer, Double> dejiangMap = new HashMap<>();
            if(huodongDejiangList != null){
                for(DictionaryEntity d:huodongDejiangList){
                    dejiangMap.put(d.getCodeIndex(),Double.valueOf(d.getBeizhu()));
                }
            }

            List<HuodongEntity> huodongEntityList = huodongService.selectList(new EntityWrapper<HuodongEntity>()
                    .eq("xuesheng_id", zonghepingce.getXueshengId())
                    .eq("xuenian_types", zonghepingce.getXuenianTypes())
                    .eq("xueqi_types", zonghepingce.getXueqiTypes())
            );
            Double zongfen=0.0;
            for(HuodongEntity h:huodongEntityList){
                zongfen=zongfen+dejiangMap.get(h.getHuodongDejiangTypes());
            }

            zonghepingce.setZonghepingceHuodongDefen(zongfen);

            zonghepingce.setZonghepingceZuizhongDefen(zonghepingce.getZonghepingceChengjiDefen()*0.7+zonghepingce.getZonghepingceHuodongDefen()*0.3);
            zonghepingce.setInsertTime(new Date());
            zonghepingce.setCreateTime(new Date());
            zonghepingceService.insert(zonghepingce);
            return R.ok();
        }else {
            return R.error(511,"该学生该学年该学期已有综合评测");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZonghepingceEntity zonghepingce, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,zonghepingce:{}",this.getClass().getName(),zonghepingce.toString());
        ZonghepingceEntity oldZonghepingceEntity = zonghepingceService.selectById(zonghepingce.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("学生".equals(role))
//            zonghepingce.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(zonghepingce.getZonghepingceContent()) || "null".equals(zonghepingce.getZonghepingceContent())){
                zonghepingce.setZonghepingceContent(null);
        }



        ChengjiEntity chengjiEntity = chengjiService.selectOne(new EntityWrapper<ChengjiEntity>()
                .eq("xuesheng_id", zonghepingce.getXueshengId())
                .eq("xuenian_types", zonghepingce.getXuenianTypes())
                .eq("xueqi_types", zonghepingce.getXueqiTypes())
        );
        if(chengjiEntity != null){
            zonghepingce.setZonghepingceChengjiDefen(chengjiEntity.getChengjiDefen());
        }else{
            zonghepingce.setZonghepingceChengjiDefen(0.0);
        }

        List<DictionaryEntity> huodongDejiangList = dictionaryService.selectList(new EntityWrapper<DictionaryEntity>()
                .eq("dic_code", "huodong_dejiang_types")
                .eq("dic_name", "活动得奖")
        );
        HashMap<Integer, Double> dejiangMap = new HashMap<>();
        if(huodongDejiangList != null){
            for(DictionaryEntity d:huodongDejiangList){
                dejiangMap.put(d.getCodeIndex(),Double.valueOf(d.getBeizhu()));
            }
        }

        List<HuodongEntity> huodongEntityList = huodongService.selectList(new EntityWrapper<HuodongEntity>()
                .eq("xuesheng_id", zonghepingce.getXueshengId())
                .eq("xuenian_types", zonghepingce.getXuenianTypes())
                .eq("xueqi_types", zonghepingce.getXueqiTypes())
        );
        Double zongfen=0.0;
        for(HuodongEntity h:huodongEntityList){
            zongfen=zongfen+dejiangMap.get(h.getHuodongDejiangTypes());
        }

        zonghepingce.setZonghepingceHuodongDefen(zongfen);

        zonghepingce.setZonghepingceZuizhongDefen(zonghepingce.getZonghepingceChengjiDefen()*0.7+zonghepingce.getZonghepingceHuodongDefen()*0.3);


        zonghepingceService.updateById(zonghepingce);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ZonghepingceEntity> oldZonghepingceList =zonghepingceService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        zonghepingceService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer xueshengId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<ZonghepingceEntity> zonghepingceList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ZonghepingceEntity zonghepingceEntity = new ZonghepingceEntity();
//                            zonghepingceEntity.setXueshengId(Integer.valueOf(data.get(0)));   //学生 要改的
//                            zonghepingceEntity.setZonghepingceUuidNumber(data.get(0));                    //综合评测编号 要改的
//                            zonghepingceEntity.setXuenianTypes(Integer.valueOf(data.get(0)));   //学年 要改的
//                            zonghepingceEntity.setXueqiTypes(Integer.valueOf(data.get(0)));   //学期 要改的
//                            zonghepingceEntity.setZonghepingceChengjiDefen(data.get(0));                    //成绩计算得分 要改的
//                            zonghepingceEntity.setZonghepingceHuodongDefen(data.get(0));                    //活动计算得分 要改的
//                            zonghepingceEntity.setZonghepingceZuizhongDefen(data.get(0));                    //最终得分 要改的
//                            zonghepingceEntity.setZonghepingceContent("");//详情和图片
//                            zonghepingceEntity.setInsertTime(date);//时间
//                            zonghepingceEntity.setCreateTime(date);//时间
                            zonghepingceList.add(zonghepingceEntity);


                            //把要查询是否重复的字段放入map中
                                //综合评测编号
                                if(seachFields.containsKey("zonghepingceUuidNumber")){
                                    List<String> zonghepingceUuidNumber = seachFields.get("zonghepingceUuidNumber");
                                    zonghepingceUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> zonghepingceUuidNumber = new ArrayList<>();
                                    zonghepingceUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("zonghepingceUuidNumber",zonghepingceUuidNumber);
                                }
                        }

                        //查询是否重复
                         //综合评测编号
                        List<ZonghepingceEntity> zonghepingceEntities_zonghepingceUuidNumber = zonghepingceService.selectList(new EntityWrapper<ZonghepingceEntity>().in("zonghepingce_uuid_number", seachFields.get("zonghepingceUuidNumber")));
                        if(zonghepingceEntities_zonghepingceUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ZonghepingceEntity s:zonghepingceEntities_zonghepingceUuidNumber){
                                repeatFields.add(s.getZonghepingceUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [综合评测编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        zonghepingceService.insertBatch(zonghepingceList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




}

