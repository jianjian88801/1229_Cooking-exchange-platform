package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshicaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshicaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshicaixinxiView;


/**
 * 食材信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface DiscussshicaixinxiService extends IService<DiscussshicaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshicaixinxiVO> selectListVO(Wrapper<DiscussshicaixinxiEntity> wrapper);
   	
   	DiscussshicaixinxiVO selectVO(@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);
   	
   	List<DiscussshicaixinxiView> selectListView(Wrapper<DiscussshicaixinxiEntity> wrapper);
   	
   	DiscussshicaixinxiView selectView(@Param("ew") Wrapper<DiscussshicaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshicaixinxiEntity> wrapper);
   	
}

