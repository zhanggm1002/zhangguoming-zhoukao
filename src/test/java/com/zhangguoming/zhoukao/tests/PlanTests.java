package com.zhangguoming.zhoukao.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangguoming.zhoukao.dao.PlanDao;
import com.zhangguoming.zhoukao.service.PlanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class PlanTests {
	@Autowired
	private PlanService planService;

	@Autowired
	private PlanDao planDao;
	
	@Test
	public void test() {
		int size = planDao.deleteByIds("1,2");
		System.out.println(size);
	}
}
