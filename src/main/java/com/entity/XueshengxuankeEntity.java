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
 * 学生选课
 *
 * @author 
 * @email
 */
@TableName("xueshengxuanke")
public class XueshengxuankeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengxuankeEntity() {

	}

	public XueshengxuankeEntity(T t) {
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
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 课程
     */
    @ColumnInfo(comment="课程",type="int(11)")
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 选课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="选课时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "xueshengxuanke_yesno_types")

    private Integer xueshengxuankeYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="text")
    @TableField(value = "xueshengxuanke_yesno_text")

    private String xueshengxuankeYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "xueshengxuanke_shenhe_time")

    private Date xueshengxuankeShenheTime;


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
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }
    /**
	 * 设置：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：选课时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：选课时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getXueshengxuankeYesnoTypes() {
        return xueshengxuankeYesnoTypes;
    }
    /**
	 * 设置：申请状态
	 */

    public void setXueshengxuankeYesnoTypes(Integer xueshengxuankeYesnoTypes) {
        this.xueshengxuankeYesnoTypes = xueshengxuankeYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getXueshengxuankeYesnoText() {
        return xueshengxuankeYesnoText;
    }
    /**
	 * 设置：审核意见
	 */

    public void setXueshengxuankeYesnoText(String xueshengxuankeYesnoText) {
        this.xueshengxuankeYesnoText = xueshengxuankeYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getXueshengxuankeShenheTime() {
        return xueshengxuankeShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setXueshengxuankeShenheTime(Date xueshengxuankeShenheTime) {
        this.xueshengxuankeShenheTime = xueshengxuankeShenheTime;
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
        return "Xueshengxuanke{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", kechengId=" + kechengId +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", xueshengxuankeYesnoTypes=" + xueshengxuankeYesnoTypes +
            ", xueshengxuankeYesnoText=" + xueshengxuankeYesnoText +
            ", xueshengxuankeShenheTime=" + DateUtil.convertString(xueshengxuankeShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
