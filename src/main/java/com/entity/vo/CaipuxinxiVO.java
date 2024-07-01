package com.entity.vo;

import com.entity.CaipuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 菜谱信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public class CaipuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 菜品名称
	 */
	
	private String caipinmingcheng;
		
	/**
	 * 菜谱分类
	 */
	
	private String caipufenlei;
		
	/**
	 * 口味
	 */
	
	private String kouwei;
		
	/**
	 * 难度
	 */
	
	private String nandu;
		
	/**
	 * 烹饪时长
	 */
	
	private String pengrenshizhang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 原材料
	 */
	
	private String yuancailiao;
		
	/**
	 * 菜品介绍
	 */
	
	private String caipinjieshao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：菜品名称
	 */
	 
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
				
	
	/**
	 * 设置：菜谱分类
	 */
	 
	public void setCaipufenlei(String caipufenlei) {
		this.caipufenlei = caipufenlei;
	}
	
	/**
	 * 获取：菜谱分类
	 */
	public String getCaipufenlei() {
		return caipufenlei;
	}
				
	
	/**
	 * 设置：口味
	 */
	 
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
				
	
	/**
	 * 设置：难度
	 */
	 
	public void setNandu(String nandu) {
		this.nandu = nandu;
	}
	
	/**
	 * 获取：难度
	 */
	public String getNandu() {
		return nandu;
	}
				
	
	/**
	 * 设置：烹饪时长
	 */
	 
	public void setPengrenshizhang(String pengrenshizhang) {
		this.pengrenshizhang = pengrenshizhang;
	}
	
	/**
	 * 获取：烹饪时长
	 */
	public String getPengrenshizhang() {
		return pengrenshizhang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：原材料
	 */
	 
	public void setYuancailiao(String yuancailiao) {
		this.yuancailiao = yuancailiao;
	}
	
	/**
	 * 获取：原材料
	 */
	public String getYuancailiao() {
		return yuancailiao;
	}
				
	
	/**
	 * 设置：菜品介绍
	 */
	 
	public void setCaipinjieshao(String caipinjieshao) {
		this.caipinjieshao = caipinjieshao;
	}
	
	/**
	 * 获取：菜品介绍
	 */
	public String getCaipinjieshao() {
		return caipinjieshao;
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
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
