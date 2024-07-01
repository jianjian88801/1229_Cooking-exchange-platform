package com.dao;

import com.entity.DiscussjiankangwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankangwenzhangVO;
import com.entity.view.DiscussjiankangwenzhangView;


/**
 * 健康文章评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface DiscussjiankangwenzhangDao extends BaseMapper<DiscussjiankangwenzhangEntity> {
	
	List<DiscussjiankangwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);
	
	DiscussjiankangwenzhangVO selectVO(@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);
	
	List<DiscussjiankangwenzhangView> selectListView(@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);

	List<DiscussjiankangwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);
	
	DiscussjiankangwenzhangView selectView(@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);
	
}
