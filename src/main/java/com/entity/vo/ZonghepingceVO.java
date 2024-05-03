package com.entity.vo;

import com.entity.ZonghepingceEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 综合评测
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zonghepingce")
public class ZonghepingceVO implements Serializable {
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
     * 综合评测编号
     */

    @TableField(value = "zonghepingce_uuid_number")
    private String zonghepingceUuidNumber;


    /**
     * 学年
     */

    @TableField(value = "xuenian_types")
    private Integer xuenianTypes;


    /**
     * 学期
     */

    @TableField(value = "xueqi_types")
    private Integer xueqiTypes;


    /**
     * 成绩计算得分
     */

    @TableField(value = "zonghepingce_chengji_defen")
    private Double zonghepingceChengjiDefen;


    /**
     * 活动计算得分
     */

    @TableField(value = "zonghepingce_huodong_defen")
    private Double zonghepingceHuodongDefen;


    /**
     * 最终得分
     */

    @TableField(value = "zonghepingce_zuizhong_defen")
    private Double zonghepingceZuizhongDefen;


    /**
     * 备注
     */

    @TableField(value = "zonghepingce_content")
    private String zonghepingceContent;


    /**
     * 评测时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：综合评测编号
	 */
    public String getZonghepingceUuidNumber() {
        return zonghepingceUuidNumber;
    }


    /**
	 * 获取：综合评测编号
	 */

    public void setZonghepingceUuidNumber(String zonghepingceUuidNumber) {
        this.zonghepingceUuidNumber = zonghepingceUuidNumber;
    }
    /**
	 * 设置：学年
	 */
    public Integer getXuenianTypes() {
        return xuenianTypes;
    }


    /**
	 * 获取：学年
	 */

    public void setXuenianTypes(Integer xuenianTypes) {
        this.xuenianTypes = xuenianTypes;
    }
    /**
	 * 设置：学期
	 */
    public Integer getXueqiTypes() {
        return xueqiTypes;
    }


    /**
	 * 获取：学期
	 */

    public void setXueqiTypes(Integer xueqiTypes) {
        this.xueqiTypes = xueqiTypes;
    }
    /**
	 * 设置：成绩计算得分
	 */
    public Double getZonghepingceChengjiDefen() {
        return zonghepingceChengjiDefen;
    }


    /**
	 * 获取：成绩计算得分
	 */

    public void setZonghepingceChengjiDefen(Double zonghepingceChengjiDefen) {
        this.zonghepingceChengjiDefen = zonghepingceChengjiDefen;
    }
    /**
	 * 设置：活动计算得分
	 */
    public Double getZonghepingceHuodongDefen() {
        return zonghepingceHuodongDefen;
    }


    /**
	 * 获取：活动计算得分
	 */

    public void setZonghepingceHuodongDefen(Double zonghepingceHuodongDefen) {
        this.zonghepingceHuodongDefen = zonghepingceHuodongDefen;
    }
    /**
	 * 设置：最终得分
	 */
    public Double getZonghepingceZuizhongDefen() {
        return zonghepingceZuizhongDefen;
    }


    /**
	 * 获取：最终得分
	 */

    public void setZonghepingceZuizhongDefen(Double zonghepingceZuizhongDefen) {
        this.zonghepingceZuizhongDefen = zonghepingceZuizhongDefen;
    }
    /**
	 * 设置：备注
	 */
    public String getZonghepingceContent() {
        return zonghepingceContent;
    }


    /**
	 * 获取：备注
	 */

    public void setZonghepingceContent(String zonghepingceContent) {
        this.zonghepingceContent = zonghepingceContent;
    }
    /**
	 * 设置：评测时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：评测时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
