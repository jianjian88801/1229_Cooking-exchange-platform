package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangwenzhangView;


/**
 * 健康文章
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface JiankangwenzhangService extends IService<JiankangwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangwenzhangVO> selectListVO(Wrapper<JiankangwenzhangEntity> wrapper);
   	
   	JiankangwenzhangVO selectVO(@Param("ew") Wrapper<JiankangwenzhangEntity> wrapper);
   	
   	List<JiankangwenzhangView> selectListView(Wrapper<JiankangwenzhangEntity> wrapper);
   	
   	JiankangwenzhangView selectView(@Param("ew") Wrapper<JiankangwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangwenzhangEntity> wrapper);
   	
}

