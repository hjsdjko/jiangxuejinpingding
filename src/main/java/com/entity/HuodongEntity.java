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
 * 活动
 *
 * @author 
 * @email
 */
@TableName("huodong")
public class HuodongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongEntity() {

	}

	public HuodongEntity(T t) {
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
     * 活动编号
     */
    @ColumnInfo(comment="活动编号",type="varchar(200)")
    @TableField(value = "huodong_uuid_number")

    private String huodongUuidNumber;


    /**
     * 活动名称
     */
    @ColumnInfo(comment="活动名称",type="varchar(200)")
    @TableField(value = "huodong_name")

    private String huodongName;


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
     * 活动地点
     */
    @ColumnInfo(comment="活动地点",type="varchar(200)")
    @TableField(value = "huodong_address")

    private String huodongAddress;


    /**
     * 活动类型
     */
    @ColumnInfo(comment="活动类型",type="int(11)")
    @TableField(value = "huodong_types")

    private Integer huodongTypes;


    /**
     * 活动介绍
     */
    @ColumnInfo(comment="活动介绍",type="longtext")
    @TableField(value = "huodong_content")

    private String huodongContent;


    /**
     * 活动得奖
     */
    @ColumnInfo(comment="活动得奖",type="int(11)")
    @TableField(value = "huodong_dejiang_types")

    private Integer huodongDejiangTypes;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "huodong_file")

    private String huodongFile;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
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
	 * 获取：活动编号
	 */
    public String getHuodongUuidNumber() {
        return huodongUuidNumber;
    }
    /**
	 * 设置：活动编号
	 */

    public void setHuodongUuidNumber(String huodongUuidNumber) {
        this.huodongUuidNumber = huodongUuidNumber;
    }
    /**
	 * 获取：活动名称
	 */
    public String getHuodongName() {
        return huodongName;
    }
    /**
	 * 设置：活动名称
	 */

    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName;
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
	 * 获取：活动地点
	 */
    public String getHuodongAddress() {
        return huodongAddress;
    }
    /**
	 * 设置：活动地点
	 */

    public void setHuodongAddress(String huodongAddress) {
        this.huodongAddress = huodongAddress;
    }
    /**
	 * 获取：活动类型
	 */
    public Integer getHuodongTypes() {
        return huodongTypes;
    }
    /**
	 * 设置：活动类型
	 */

    public void setHuodongTypes(Integer huodongTypes) {
        this.huodongTypes = huodongTypes;
    }
    /**
	 * 获取：活动介绍
	 */
    public String getHuodongContent() {
        return huodongContent;
    }
    /**
	 * 设置：活动介绍
	 */

    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent;
    }
    /**
	 * 获取：活动得奖
	 */
    public Integer getHuodongDejiangTypes() {
        return huodongDejiangTypes;
    }
    /**
	 * 设置：活动得奖
	 */

    public void setHuodongDejiangTypes(Integer huodongDejiangTypes) {
        this.huodongDejiangTypes = huodongDejiangTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getHuodongFile() {
        return huodongFile;
    }
    /**
	 * 设置：附件
	 */

    public void setHuodongFile(String huodongFile) {
        this.huodongFile = huodongFile;
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
        return "Huodong{" +
            ", id=" + id +
            ", xueshengId=" + xueshengId +
            ", huodongUuidNumber=" + huodongUuidNumber +
            ", huodongName=" + huodongName +
            ", xuenianTypes=" + xuenianTypes +
            ", xueqiTypes=" + xueqiTypes +
            ", huodongAddress=" + huodongAddress +
            ", huodongTypes=" + huodongTypes +
            ", huodongContent=" + huodongContent +
            ", huodongDejiangTypes=" + huodongDejiangTypes +
            ", huodongFile=" + huodongFile +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
