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
 * 学生成绩
 *
 * @author 
 * @email
 */
@TableName("chengji")
public class ChengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChengjiEntity() {

	}

	public ChengjiEntity(T t) {
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
     * 学生成绩编号
     */
    @ColumnInfo(comment="学生成绩编号",type="varchar(200)")
    @TableField(value = "chengji_uuid_number")

    private String chengjiUuidNumber;


    /**
     * 学生成绩名称
     */
    @ColumnInfo(comment="学生成绩名称",type="varchar(200)")
    @TableField(value = "chengji_name")

    private String chengjiName;


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
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "chengji_file")

    private String chengjiFile;


    /**
     * 成绩
     */
    @ColumnInfo(comment="成绩",type="decimal(10,2)")
    @TableField(value = "chengji_defen")

    private Double chengjiDefen;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "chengji_content")

    private String chengjiContent;


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
        return "Chengji{" +
            ", id=" + id +
            ", xueshengId=" + xueshengId +
            ", chengjiUuidNumber=" + chengjiUuidNumber +
            ", chengjiName=" + chengjiName +
            ", xuenianTypes=" + xuenianTypes +
            ", xueqiTypes=" + xueqiTypes +
            ", chengjiFile=" + chengjiFile +
            ", chengjiDefen=" + chengjiDefen +
            ", chengjiContent=" + chengjiContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
