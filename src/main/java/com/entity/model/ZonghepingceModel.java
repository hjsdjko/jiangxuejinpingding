package com.entity.model;

import com.entity.ZonghepingceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 综合评测
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZonghepingceModel implements Serializable {
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
     * 综合评测编号
     */
    private String zonghepingceUuidNumber;


    /**
     * 学年
     */
    private Integer xuenianTypes;


    /**
     * 学期
     */
    private Integer xueqiTypes;


    /**
     * 成绩计算得分
     */
    private Double zonghepingceChengjiDefen;


    /**
     * 活动计算得分
     */
    private Double zonghepingceHuodongDefen;


    /**
     * 最终得分
     */
    private Double zonghepingceZuizhongDefen;


    /**
     * 备注
     */
    private String zonghepingceContent;


    /**
     * 评测时间
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
	 * 获取：综合评测编号
	 */
    public String getZonghepingceUuidNumber() {
        return zonghepingceUuidNumber;
    }


    /**
	 * 设置：综合评测编号
	 */
    public void setZonghepingceUuidNumber(String zonghepingceUuidNumber) {
        this.zonghepingceUuidNumber = zonghepingceUuidNumber;
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
	 * 获取：成绩计算得分
	 */
    public Double getZonghepingceChengjiDefen() {
        return zonghepingceChengjiDefen;
    }


    /**
	 * 设置：成绩计算得分
	 */
    public void setZonghepingceChengjiDefen(Double zonghepingceChengjiDefen) {
        this.zonghepingceChengjiDefen = zonghepingceChengjiDefen;
    }
    /**
	 * 获取：活动计算得分
	 */
    public Double getZonghepingceHuodongDefen() {
        return zonghepingceHuodongDefen;
    }


    /**
	 * 设置：活动计算得分
	 */
    public void setZonghepingceHuodongDefen(Double zonghepingceHuodongDefen) {
        this.zonghepingceHuodongDefen = zonghepingceHuodongDefen;
    }
    /**
	 * 获取：最终得分
	 */
    public Double getZonghepingceZuizhongDefen() {
        return zonghepingceZuizhongDefen;
    }


    /**
	 * 设置：最终得分
	 */
    public void setZonghepingceZuizhongDefen(Double zonghepingceZuizhongDefen) {
        this.zonghepingceZuizhongDefen = zonghepingceZuizhongDefen;
    }
    /**
	 * 获取：备注
	 */
    public String getZonghepingceContent() {
        return zonghepingceContent;
    }


    /**
	 * 设置：备注
	 */
    public void setZonghepingceContent(String zonghepingceContent) {
        this.zonghepingceContent = zonghepingceContent;
    }
    /**
	 * 获取：评测时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：评测时间
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
