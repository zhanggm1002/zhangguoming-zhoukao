package com.zhangguoming.zhoukao.service;

import com.github.pagehelper.PageInfo;
import com.zhangguoming.zhoukao.pojo.Plan;

public interface PlanService {
	/**
	 * @Title: getPageInfo   
	 * @Description: 分页查询数据   
	 * @param: @param plan
	 * @param: @param pageNum
	 * @param: @param pageSize
	 * @param: @return      
	 * @return: PageInfo<Plan>      
	 * @throws
	 */
	PageInfo<Plan> getPageInfo(Plan plan,Integer pageNum,Integer pageSize);

}
