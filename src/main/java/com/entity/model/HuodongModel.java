package com.entity.model;

import com.entity.HuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongModel implements Serializable {
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
     * 活动编号
     */
    private String huodongUuidNumber;


    /**
     * 活动名称
     */
    private String huodongName;


    /**
     * 学年
     */
    private Integer xuenianTypes;


    /**
     * 学期
     */
    private Integer xueqiTypes;


    /**
     * 活动地点
     */
    private String huodongAddress;


    /**
     * 活动类型
     */
    private Integer huodongTypes;


    /**
     * 活动介绍
     */
    private String huodongContent;


    /**
     * 活动得奖
     */
    private Integer huodongDejiangTypes;


    /**
     * 附件
     */
    private String huodongFile;


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
