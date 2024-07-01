package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishirizhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishirizhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishirizhiView;


/**
 * 美食日志
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface MeishirizhiService extends IService<MeishirizhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishirizhiVO> selectListVO(Wrapper<MeishirizhiEntity> wrapper);
   	
   	MeishirizhiVO selectVO(@Param("ew") Wrapper<MeishirizhiEntity> wrapper);
   	
   	List<MeishirizhiView> selectListView(Wrapper<MeishirizhiEntity> wrapper);
   	
   	MeishirizhiView selectView(@Param("ew") Wrapper<MeishirizhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishirizhiEntity> wrapper);
   	
}

