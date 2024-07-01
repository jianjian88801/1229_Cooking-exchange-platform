package com.dao;

import com.entity.MeishirizhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishirizhiVO;
import com.entity.view.MeishirizhiView;


/**
 * 美食日志
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface MeishirizhiDao extends BaseMapper<MeishirizhiEntity> {
	
	List<MeishirizhiVO> selectListVO(@Param("ew") Wrapper<MeishirizhiEntity> wrapper);
	
	MeishirizhiVO selectVO(@Param("ew") Wrapper<MeishirizhiEntity> wrapper);
	
	List<MeishirizhiView> selectListView(@Param("ew") Wrapper<MeishirizhiEntity> wrapper);

	List<MeishirizhiView> selectListView(Pagination page,@Param("ew") Wrapper<MeishirizhiEntity> wrapper);
	
	MeishirizhiView selectView(@Param("ew") Wrapper<MeishirizhiEntity> wrapper);
	
}
