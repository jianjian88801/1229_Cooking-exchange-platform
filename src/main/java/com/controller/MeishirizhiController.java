package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MeishirizhiEntity;
import com.entity.view.MeishirizhiView;

import com.service.MeishirizhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 美食日志
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-30 10:01:54
 */
@RestController
@RequestMapping("/meishirizhi")
public class MeishirizhiController {
    @Autowired
    private MeishirizhiService meishirizhiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeishirizhiEntity meishirizhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			meishirizhi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MeishirizhiEntity> ew = new EntityWrapper<MeishirizhiEntity>();
		PageUtils page = meishirizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meishirizhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeishirizhiEntity meishirizhi, 
		HttpServletRequest request){
        EntityWrapper<MeishirizhiEntity> ew = new EntityWrapper<MeishirizhiEntity>();
		PageUtils page = meishirizhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meishirizhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeishirizhiEntity meishirizhi){
       	EntityWrapper<MeishirizhiEntity> ew = new EntityWrapper<MeishirizhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meishirizhi, "meishirizhi")); 
        return R.ok().put("data", meishirizhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeishirizhiEntity meishirizhi){
        EntityWrapper< MeishirizhiEntity> ew = new EntityWrapper< MeishirizhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meishirizhi, "meishirizhi")); 
		MeishirizhiView meishirizhiView =  meishirizhiService.selectView(ew);
		return R.ok("查询美食日志成功").put("data", meishirizhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeishirizhiEntity meishirizhi = meishirizhiService.selectById(id);
        return R.ok().put("data", meishirizhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeishirizhiEntity meishirizhi = meishirizhiService.selectById(id);
        return R.ok().put("data", meishirizhi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        MeishirizhiEntity meishirizhi = meishirizhiService.selectById(id);
        if(type.equals("1")) {
        	meishirizhi.setThumbsupnum(meishirizhi.getThumbsupnum()+1);
        } else {
        	meishirizhi.setCrazilynum(meishirizhi.getCrazilynum()+1);
        }
        meishirizhiService.updateById(meishirizhi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeishirizhiEntity meishirizhi, HttpServletRequest request){
    	meishirizhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meishirizhi);
        meishirizhiService.insert(meishirizhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MeishirizhiEntity meishirizhi, HttpServletRequest request){
    	meishirizhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meishirizhi);
        meishirizhiService.insert(meishirizhi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MeishirizhiEntity meishirizhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meishirizhi);
        meishirizhiService.updateById(meishirizhi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meishirizhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<MeishirizhiEntity> wrapper = new EntityWrapper<MeishirizhiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = meishirizhiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
