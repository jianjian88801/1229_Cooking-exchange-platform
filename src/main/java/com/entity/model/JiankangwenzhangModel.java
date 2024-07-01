package com.entity.model;

import com.entity.JiankangwenzhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康文章
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public class JiankangwenzhangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章封面
	 */
	
	private String wenzhangfengmian;
		
	/**
	 * 文章类型
	 */
	
	private String wenzhangleixing;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 文章内容
	 */
	
	private String wenzhangneirong;
				
	
	/**
	 * 设置：文章封面
	 */
	 
	public void setWenzhangfengmian(String wenzhangfengmian) {
		this.wenzhangfengmian = wenzhangfengmian;
	}
	
	/**
	 * 获取：文章封面
	 */
	public String getWenzhangfengmian() {
		return wenzhangfengmian;
	}
				
	
	/**
	 * 设置：文章类型
	 */
	 
	public void setWenzhangleixing(String wenzhangleixing) {
		this.wenzhangleixing = wenzhangleixing;
	}
	
	/**
	 * 获取：文章类型
	 */
	public String getWenzhangleixing() {
		return wenzhangleixing;
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
	 * 设置：文章内容
	 */
	 
	public void setWenzhangneirong(String wenzhangneirong) {
		this.wenzhangneirong = wenzhangneirong;
	}
	
	/**
	 * 获取：文章内容
	 */
	public String getWenzhangneirong() {
		return wenzhangneirong;
	}
			
}
