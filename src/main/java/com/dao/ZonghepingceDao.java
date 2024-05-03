package com.dao;

import com.entity.ZonghepingceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghepingceView;

/**
 * 综合评测 Dao 接口
 *
 * @author 
 */
public interface ZonghepingceDao extends BaseMapper<ZonghepingceEntity> {

   List<ZonghepingceView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
