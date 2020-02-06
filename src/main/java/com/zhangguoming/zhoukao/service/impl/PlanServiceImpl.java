package com.zhangguoming.zhoukao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangguoming.zhoukao.dao.DepartmentDao;
import com.zhangguoming.zhoukao.dao.PlanDao;
import com.zhangguoming.zhoukao.service.PlanService;
@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanDao planDao;
	
	@Autowired
	private DepartmentDao departmentDao;
}
