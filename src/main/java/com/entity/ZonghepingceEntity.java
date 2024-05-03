package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 综合评测
 *
 * @author 
 * @email
 */
@TableName("zonghepingce")
public class ZonghepingceEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZonghepingceEntity() {

	}

	public ZonghepingceEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 综合评测编号
     */
    @ColumnInfo(comment="综合评测编号",type="varchar(200)")
    @TableField(value = "zonghepingce_uuid_number")

    private String zonghepingceUuidNumber;


    /**
     * 学年
     */
    @ColumnInfo(comment="学年",type="int(11)")
    @TableField(value = "xuenian_types")

    private Integer xuenianTypes;


    /**
     * 学期
     */
    @ColumnInfo(comment="学期",type="int(11)")
    @TableField(value = "xueqi_types")

    private Integer xueqiTypes;


    /**
     * 成绩计算得分
     */
    @ColumnInfo(comment="成绩计算得分",type="decimal(10,2)")
    @TableField(value = "zonghepingce_chengji_defen")

    private Double zonghepingceChengjiDefen;


    /**
     * 活动计算得分
     */
    @ColumnInfo(comment="活动计算得分",type="decimal(10,2)")
    @TableField(value = "zonghepingce_huodong_defen")

    private Double zonghepingceHuodongDefen;


    /**
     * 最终得分
     */
    @ColumnInfo(comment="最终得分",type="decimal(10,2)")
    @TableField(value = "zonghepingce_zuizhong_defen")

    private Double zonghepingceZuizhongDefen;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "zonghepingce_content")

    private String zonghepingceContent;


    /**
     * 评测时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="评测时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zonghepingce{" +
            ", id=" + id +
            ", xueshengId=" + xueshengId +
            ", zonghepingceUuidNumber=" + zonghepingceUuidNumber +
            ", xuenianTypes=" + xuenianTypes +
            ", xueqiTypes=" + xueqiTypes +
            ", zonghepingceChengjiDefen=" + zonghepingceChengjiDefen +
            ", zonghepingceHuodongDefen=" + zonghepingceHuodongDefen +
            ", zonghepingceZuizhongDefen=" + zonghepingceZuizhongDefen +
            ", zonghepingceContent=" + zonghepingceContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
