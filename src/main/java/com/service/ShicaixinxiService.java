package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShicaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShicaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicaixinxiView;


/**
 * 食材信息
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
public interface ShicaixinxiService extends IService<ShicaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShicaixinxiVO> selectListVO(Wrapper<ShicaixinxiEntity> wrapper);
   	
   	ShicaixinxiVO selectVO(@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);
   	
   	List<ShicaixinxiView> selectListView(Wrapper<ShicaixinxiEntity> wrapper);
   	
   	ShicaixinxiView selectView(@Param("ew") Wrapper<ShicaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShicaixinxiEntity> wrapper);
   	
}

