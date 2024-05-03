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
 * 奖学金申请
 *
 * @author 
 * @email
 */
@TableName("jiangxuejin_shenqing")
public class JiangxuejinShenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiangxuejinShenqingEntity() {

	}

	public JiangxuejinShenqingEntity(T t) {
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
     * 奖学金申请编号
     */
    @ColumnInfo(comment="奖学金申请编号",type="varchar(200)")
    @TableField(value = "jiangxuejin_shenqing_uuid_number")

    private String jiangxuejinShenqingUuidNumber;


    /**
     * 申请标题
     */
    @ColumnInfo(comment="申请标题",type="varchar(200)")
    @TableField(value = "jiangxuejin_shenqing_name")

    private String jiangxuejinShenqingName;


    /**
     * 奖学金申请类型
     */
    @ColumnInfo(comment="奖学金申请类型",type="int(11)")
    @TableField(value = "jiangxuejin_shenqing_types")

    private Integer jiangxuejinShenqingTypes;


    /**
     * 申请金额
     */
    @ColumnInfo(comment="申请金额",type="decimal(10,2)")
    @TableField(value = "jiangxuejin_shenqing_jine")

    private Double jiangxuejinShenqingJine;


    /**
     * 申请理由
     */
    @ColumnInfo(comment="申请理由",type="longtext")
    @TableField(value = "jiangxuejin_shenqing_content")

    private String jiangxuejinShenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "jiangxuejin_shenqing_yesno_types")

    private Integer jiangxuejinShenqingYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="longtext")
    @TableField(value = "jiangxuejin_shenqing_yesno_text")

    private String jiangxuejinShenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "jiangxuejin_shenqing_shenhe_time")

    private Date jiangxuejinShenqingShenheTime;


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
	 * 获取：奖学金申请编号
	 */
    public String getJiangxuejinShenqingUuidNumber() {
        return jiangxuejinShenqingUuidNumber;
    }
    /**
	 * 设置：奖学金申请编号
	 */

    public void setJiangxuejinShenqingUuidNumber(String jiangxuejinShenqingUuidNumber) {
        this.jiangxuejinShenqingUuidNumber = jiangxuejinShenqingUuidNumber;
    }
    /**
	 * 获取：申请标题
	 */
    public String getJiangxuejinShenqingName() {
        return jiangxuejinShenqingName;
    }
    /**
	 * 设置：申请标题
	 */

    public void setJiangxuejinShenqingName(String jiangxuejinShenqingName) {
        this.jiangxuejinShenqingName = jiangxuejinShenqingName;
    }
    /**
	 * 获取：奖学金申请类型
	 */
    public Integer getJiangxuejinShenqingTypes() {
        return jiangxuejinShenqingTypes;
    }
    /**
	 * 设置：奖学金申请类型
	 */

    public void setJiangxuejinShenqingTypes(Integer jiangxuejinShenqingTypes) {
        this.jiangxuejinShenqingTypes = jiangxuejinShenqingTypes;
    }
    /**
	 * 获取：申请金额
	 */
    public Double getJiangxuejinShenqingJine() {
        return jiangxuejinShenqingJine;
    }
    /**
	 * 设置：申请金额
	 */

    public void setJiangxuejinShenqingJine(Double jiangxuejinShenqingJine) {
        this.jiangxuejinShenqingJine = jiangxuejinShenqingJine;
    }
    /**
	 * 获取：申请理由
	 */
    public String getJiangxuejinShenqingContent() {
        return jiangxuejinShenqingContent;
    }
    /**
	 * 设置：申请理由
	 */

    public void setJiangxuejinShenqingContent(String jiangxuejinShenqingContent) {
        this.jiangxuejinShenqingContent = jiangxuejinShenqingContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getJiangxuejinShenqingYesnoTypes() {
        return jiangxuejinShenqingYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setJiangxuejinShenqingYesnoTypes(Integer jiangxuejinShenqingYesnoTypes) {
        this.jiangxuejinShenqingYesnoTypes = jiangxuejinShenqingYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getJiangxuejinShenqingYesnoText() {
        return jiangxuejinShenqingYesnoText;
    }
    /**
	 * 设置：审核意见
	 */

    public void setJiangxuejinShenqingYesnoText(String jiangxuejinShenqingYesnoText) {
        this.jiangxuejinShenqingYesnoText = jiangxuejinShenqingYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJiangxuejinShenqingShenheTime() {
        return jiangxuejinShenqingShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setJiangxuejinShenqingShenheTime(Date jiangxuejinShenqingShenheTime) {
        this.jiangxuejinShenqingShenheTime = jiangxuejinShenqingShenheTime;
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
        return "JiangxuejinShenqing{" +
            ", id=" + id +
            ", xueshengId=" + xueshengId +
            ", jiangxuejinShenqingUuidNumber=" + jiangxuejinShenqingUuidNumber +
            ", jiangxuejinShenqingName=" + jiangxuejinShenqingName +
            ", jiangxuejinShenqingTypes=" + jiangxuejinShenqingTypes +
            ", jiangxuejinShenqingJine=" + jiangxuejinShenqingJine +
            ", jiangxuejinShenqingContent=" + jiangxuejinShenqingContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jiangxuejinShenqingYesnoTypes=" + jiangxuejinShenqingYesnoTypes +
            ", jiangxuejinShenqingYesnoText=" + jiangxuejinShenqingYesnoText +
            ", jiangxuejinShenqingShenheTime=" + DateUtil.convertString(jiangxuejinShenqingShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
