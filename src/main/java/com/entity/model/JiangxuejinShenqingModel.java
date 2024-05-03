package com.entity.model;

import com.entity.JiangxuejinShenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 奖学金申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiangxuejinShenqingModel implements Serializable {
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
     * 奖学金申请编号
     */
    private String jiangxuejinShenqingUuidNumber;


    /**
     * 申请标题
     */
    private String jiangxuejinShenqingName;


    /**
     * 奖学金申请类型
     */
    private Integer jiangxuejinShenqingTypes;


    /**
     * 申请金额
     */
    private Double jiangxuejinShenqingJine;


    /**
     * 申请理由
     */
    private String jiangxuejinShenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer jiangxuejinShenqingYesnoTypes;


    /**
     * 审核意见
     */
    private String jiangxuejinShenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiangxuejinShenqingShenheTime;


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
