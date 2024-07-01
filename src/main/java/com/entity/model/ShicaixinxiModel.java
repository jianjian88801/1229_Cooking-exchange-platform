package com.entity.model;

import com.entity.ShicaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食材信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public class ShicaixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
