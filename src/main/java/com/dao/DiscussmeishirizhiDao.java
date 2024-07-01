package com.dao;

import com.entity.DiscussmeishirizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishirizhiVO;
import com.entity.view.DiscussmeishirizhiView;


/**
 * 美食日志评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface DiscussmeishirizhiDao extends BaseMapper<DiscussmeishirizhiEntity> {
	
	List<DiscussmeishirizhiVO> selectListVO(@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);
	
	DiscussmeishirizhiVO selectVO(@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);
	
	List<DiscussmeishirizhiView> selectListView(@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);

	List<DiscussmeishirizhiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);
	
	DiscussmeishirizhiView selectView(@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);
	
}
