package com.entity.vo;

import com.entity.JiangxuejinShenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 奖学金申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiangxuejin_shenqing")
public class JiangxuejinShenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 奖学金申请编号
     */

    @TableField(value = "jiangxuejin_shenqing_uuid_number")
    private String jiangxuejinShenqingUuidNumber;


    /**
     * 申请标题
     */

    @TableField(value = "jiangxuejin_shenqing_name")
    private String jiangxuejinShenqingName;


    /**
     * 奖学金申请类型
     */

    @TableField(value = "jiangxuejin_shenqing_types")
    private Integer jiangxuejinShenqingTypes;


    /**
     * 申请金额
     */

    @TableField(value = "jiangxuejin_shenqing_jine")
    private Double jiangxuejinShenqingJine;


    /**
     * 申请理由
     */

    @TableField(value = "jiangxuejin_shenqing_content")
    private String jiangxuejinShenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "jiangxuejin_shenqing_yesno_types")
    private Integer jiangxuejinShenqingYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "jiangxuejin_shenqing_yesno_text")
    private String jiangxuejinShenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiangxuejin_shenqing_shenhe_time")
    private Date jiangxuejinShenqingShenheTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：奖学金申请编号
	 */
    public String getJiangxuejinShenqingUuidNumber() {
        return jiangxuejinShenqingUuidNumber;
    }


    /**
	 * 获取：奖学金申请编号
	 */

    public void setJiangxuejinShenqingUuidNumber(String jiangxuejinShenqingUuidNumber) {
        this.jiangxuejinShenqingUuidNumber = jiangxuejinShenqingUuidNumber;
    }
    /**
	 * 设置：申请标题
	 */
    public String getJiangxuejinShenqingName() {
        return jiangxuejinShenqingName;
    }


    /**
	 * 获取：申请标题
	 */

    public void setJiangxuejinShenqingName(String jiangxuejinShenqingName) {
        this.jiangxuejinShenqingName = jiangxuejinShenqingName;
    }
    /**
	 * 设置：奖学金申请类型
	 */
    public Integer getJiangxuejinShenqingTypes() {
        return jiangxuejinShenqingTypes;
    }


    /**
	 * 获取：奖学金申请类型
	 */

    public void setJiangxuejinShenqingTypes(Integer jiangxuejinShenqingTypes) {
        this.jiangxuejinShenqingTypes = jiangxuejinShenqingTypes;
    }
    /**
	 * 设置：申请金额
	 */
    public Double getJiangxuejinShenqingJine() {
        return jiangxuejinShenqingJine;
    }


    /**
	 * 获取：申请金额
	 */

    public void setJiangxuejinShenqingJine(Double jiangxuejinShenqingJine) {
        this.jiangxuejinShenqingJine = jiangxuejinShenqingJine;
    }
    /**
	 * 设置：申请理由
	 */
    public String getJiangxuejinShenqingContent() {
        return jiangxuejinShenqingContent;
    }


    /**
	 * 获取：申请理由
	 */

    public void setJiangxuejinShenqingContent(String jiangxuejinShenqingContent) {
        this.jiangxuejinShenqingContent = jiangxuejinShenqingContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getJiangxuejinShenqingYesnoTypes() {
        return jiangxuejinShenqingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setJiangxuejinShenqingYesnoTypes(Integer jiangxuejinShenqingYesnoTypes) {
        this.jiangxuejinShenqingYesnoTypes = jiangxuejinShenqingYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getJiangxuejinShenqingYesnoText() {
        return jiangxuejinShenqingYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setJiangxuejinShenqingYesnoText(String jiangxuejinShenqingYesnoText) {
        this.jiangxuejinShenqingYesnoText = jiangxuejinShenqingYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getJiangxuejinShenqingShenheTime() {
        return jiangxuejinShenqingShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setJiangxuejinShenqingShenheTime(Date jiangxuejinShenqingShenheTime) {
        this.jiangxuejinShenqingShenheTime = jiangxuejinShenqingShenheTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
