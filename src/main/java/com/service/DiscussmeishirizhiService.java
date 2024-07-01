package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishirizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishirizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishirizhiView;


/**
 * 美食日志评论表
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface DiscussmeishirizhiService extends IService<DiscussmeishirizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishirizhiVO> selectListVO(Wrapper<DiscussmeishirizhiEntity> wrapper);
   	
   	DiscussmeishirizhiVO selectVO(@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);
   	
   	List<DiscussmeishirizhiView> selectListView(Wrapper<DiscussmeishirizhiEntity> wrapper);
   	
   	DiscussmeishirizhiView selectView(@Param("ew") Wrapper<DiscussmeishirizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishirizhiEntity> wrapper);
   	
}

