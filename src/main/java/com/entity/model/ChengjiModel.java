package com.entity.model;

import com.entity.ChengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生成绩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChengjiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 学生成绩编号
     */
    private String chengjiUuidNumber;


    /**
     * 学生成绩名称
     */
    private String chengjiName;


    /**
     * 学年
     */
    private Integer xuenianTypes;


    /**
     * 学期
     */
    private Integer xueqiTypes;


    /**
     * 附件
     */
    private String chengjiFile;


    /**
     * 成绩
     */
    private Double chengjiDefen;


    /**
     * 备注
     */
    private String chengjiContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：学生成绩编号
	 */
    public String getChengjiUuidNumber() {
        return chengjiUuidNumber;
    }


    /**
	 * 设置：学生成绩编号
	 */
    public void setChengjiUuidNumber(String chengjiUuidNumber) {
        this.chengjiUuidNumber = chengjiUuidNumber;
    }
    /**
	 * 获取：学生成绩名称
	 */
    public String getChengjiName() {
        return chengjiName;
    }


    /**
	 * 设置：学生成绩名称
	 */
    public void setChengjiName(String chengjiName) {
        this.chengjiName = chengjiName;
    }
    /**
	 * 获取：学年
	 */
    public Integer getXuenianTypes() {
        return xuenianTypes;
    }


    /**
	 * 设置：学年
	 */
    public void setXuenianTypes(Integer xuenianTypes) {
        this.xuenianTypes = xuenianTypes;
    }
    /**
	 * 获取：学期
	 */
    public Integer getXueqiTypes() {
        return xueqiTypes;
    }


    /**
	 * 设置：学期
	 */
    public void setXueqiTypes(Integer xueqiTypes) {
        this.xueqiTypes = xueqiTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getChengjiFile() {
        return chengjiFile;
    }


    /**
	 * 设置：附件
	 */
    public void setChengjiFile(String chengjiFile) {
        this.chengjiFile = chengjiFile;
    }
    /**
	 * 获取：成绩
	 */
    public Double getChengjiDefen() {
        return chengjiDefen;
    }


    /**
	 * 设置：成绩
	 */
    public void setChengjiDefen(Double chengjiDefen) {
        this.chengjiDefen = chengjiDefen;
    }
    /**
	 * 获取：备注
	 */
    public String getChengjiContent() {
        return chengjiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setChengjiContent(String chengjiContent) {
        this.chengjiContent = chengjiContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：上传时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
