package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 食材信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
@TableName("shicaixinxi")
public class ShicaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShicaixinxiEntity() {
		
	}
	
	public ShicaixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 食材名称
	 */
					
	private String shicaimingcheng;
	
	/**
	 * 食材产地
	 */
					
	private String shicaichandi;
	
	/**
	 * 食材地点
	 */
					
	private String shicaididian;
	
	/**
	 * 食材热量
	 */
					
	private String shicaireliang;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 食材封面
	 */
					
	private String shicaifengmian;
	
	/**
	 * 食用宜忌
	 */
					
	private String shiyongyiji;
	
	/**
	 * 选购技巧
	 */
					
	private String xuangoujiqiao;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：食材名称
	 */
	public void setShicaimingcheng(String shicaimingcheng) {
		this.shicaimingcheng = shicaimingcheng;
	}
	/**
	 * 获取：食材名称
	 */
	public String getShicaimingcheng() {
		return shicaimingcheng;
	}
	/**
	 * 设置：食材产地
	 */
	public void setShicaichandi(String shicaichandi) {
		this.shicaichandi = shicaichandi;
	}
	/**
	 * 获取：食材产地
	 */
	public String getShicaichandi() {
		return shicaichandi;
	}
	/**
	 * 设置：食材地点
	 */
	public void setShicaididian(String shicaididian) {
		this.shicaididian = shicaididian;
	}
	/**
	 * 获取：食材地点
	 */
	public String getShicaididian() {
		return shicaididian;
	}
	/**
	 * 设置：食材热量
	 */
	public void setShicaireliang(String shicaireliang) {
		this.shicaireliang = shicaireliang;
	}
	/**
	 * 获取：食材热量
	 */
	public String getShicaireliang() {
		return shicaireliang;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：食材封面
	 */
	public void setShicaifengmian(String shicaifengmian) {
		this.shicaifengmian = shicaifengmian;
	}
	/**
	 * 获取：食材封面
	 */
	public String getShicaifengmian() {
		return shicaifengmian;
	}
	/**
	 * 设置：食用宜忌
	 */
	public void setShiyongyiji(String shiyongyiji) {
		this.shiyongyiji = shiyongyiji;
	}
	/**
	 * 获取：食用宜忌
	 */
	public String getShiyongyiji() {
		return shiyongyiji;
	}
	/**
	 * 设置：选购技巧
	 */
	public void setXuangoujiqiao(String xuangoujiqiao) {
		this.xuangoujiqiao = xuangoujiqiao;
	}
	/**
	 * 获取：选购技巧
	 */
	public String getXuangoujiqiao() {
		return xuangoujiqiao;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
