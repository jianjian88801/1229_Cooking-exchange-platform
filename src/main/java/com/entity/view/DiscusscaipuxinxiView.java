package com.entity.view;

import com.entity.DiscusscaipuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜谱信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
@TableName("discusscaipuxinxi")
public class DiscusscaipuxinxiView  extends DiscusscaipuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscaipuxinxiView(){
	}
 
 	public DiscusscaipuxinxiView(DiscusscaipuxinxiEntity discusscaipuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscaipuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
