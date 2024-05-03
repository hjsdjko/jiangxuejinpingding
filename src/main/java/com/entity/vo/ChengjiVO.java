package com.entity.vo;

import com.entity.ChengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生成绩
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chengji")
public class ChengjiVO implements Serializable {
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
     * 学生成绩编号
     */

    @TableField(value = "chengji_uuid_number")
    private String chengjiUuidNumber;


    /**
     * 学生成绩名称
     */

    @TableField(value = "chengji_name")
    private String chengjiName;


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
     * 附件
     */

    @TableField(value = "chengji_file")
    private String chengjiFile;


    /**
     * 成绩
     */

    @TableField(value = "chengji_defen")
    private Double chengjiDefen;


    /**
     * 备注
     */

    @TableField(value = "chengji_content")
    private String chengjiContent;


    /**
     * 上传时间
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
	 * 设置：学生成绩编号
	 */
    public String getChengjiUuidNumber() {
        return chengjiUuidNumber;
    }


    /**
	 * 获取：学生成绩编号
	 */

    public void setChengjiUuidNumber(String chengjiUuidNumber) {
        this.chengjiUuidNumber = chengjiUuidNumber;
    }
    /**
	 * 设置：学生成绩名称
	 */
    public String getChengjiName() {
        return chengjiName;
    }


    /**
	 * 获取：学生成绩名称
	 */

    public void setChengjiName(String chengjiName) {
        this.chengjiName = chengjiName;
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
	 * 设置：附件
	 */
    public String getChengjiFile() {
        return chengjiFile;
    }


    /**
	 * 获取：附件
	 */

    public void setChengjiFile(String chengjiFile) {
        this.chengjiFile = chengjiFile;
    }
    /**
	 * 设置：成绩
	 */
    public Double getChengjiDefen() {
        return chengjiDefen;
    }


    /**
	 * 获取：成绩
	 */

    public void setChengjiDefen(Double chengjiDefen) {
        this.chengjiDefen = chengjiDefen;
    }
    /**
	 * 设置：备注
	 */
    public String getChengjiContent() {
        return chengjiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setChengjiContent(String chengjiContent) {
        this.chengjiContent = chengjiContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
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
