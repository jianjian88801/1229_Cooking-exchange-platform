package com.dao;

import com.entity.DiscussshicaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshicaixinxiVO;
import com.entity.view.DiscussshicaixinxiView;


/**
 * 食材信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface DiscussshicaixinxiDao extends BaseMapper<DiscussshicaixinxiEntity> {
	
	List<DiscussshicaixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);
	
	DiscussshicaixinxiVO selectVO(@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);
	
	List<DiscussshicaixinxiView> selectListView(@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);

	List<DiscussshicaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);
	
	DiscussshicaixinxiView selectView(@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);
	
}
