package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankangwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankangwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankangwenzhangView;


/**
 * 健康文章评论表
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface DiscussjiankangwenzhangService extends IService<DiscussjiankangwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankangwenzhangVO> selectListVO(Wrapper<DiscussjiankangwenzhangEntity> wrapper);
   	
   	DiscussjiankangwenzhangVO selectVO(@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);
   	
   	List<DiscussjiankangwenzhangView> selectListView(Wrapper<DiscussjiankangwenzhangEntity> wrapper);
   	
   	DiscussjiankangwenzhangView selectView(@Param("ew") Wrapper<DiscussjiankangwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankangwenzhangEntity> wrapper);
   	
}

