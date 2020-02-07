package com.zhangguoming.zhoukao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangguoming.zhoukao.dao.DepartmentDao;
import com.zhangguoming.zhoukao.dao.PlanDao;
import com.zhangguoming.zhoukao.pojo.Department;
import com.zhangguoming.zhoukao.pojo.Plan;
import com.zhangguoming.zhoukao.service.PlanService;
@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanDao planDao;
	
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public PageInfo<Plan> getPageInfo(Plan plan, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Plan> planList = planDao.select(plan);
		for (Plan plan2 : planList) {
			Department department = departmentDao.selectById(plan2.getDept_id());
			plan2.setDept_name(department.getName());
		}
		return new PageInfo<>(planList);
	}
}
