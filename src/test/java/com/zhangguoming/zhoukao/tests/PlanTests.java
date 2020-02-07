package com.zhangguoming.zhoukao.tests;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhanggm.common.utils.FileUtil;
import com.zhangguoming.zhoukao.dao.DepartmentDao;
import com.zhangguoming.zhoukao.dao.PlanDao;
import com.zhangguoming.zhoukao.pojo.Department;
import com.zhangguoming.zhoukao.pojo.Plan;
import com.zhangguoming.zhoukao.service.PlanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class PlanTests {
	@Autowired
	private PlanService planService;

	@Autowired
	private PlanDao planDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Test
	public void test() {
		/** 读取文件，在maven项目下，resources下的文件可以向src开始路径去读该文件 **/
		File file = new File("src\\test\\resources\\data.txt");
		/** 打印文件的绝对路径 **/
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		/** 读取文件内容到List **/
		List<String> readTextFileToList = FileUtil.readTextFileToList(absolutePath);
		for (String string : readTextFileToList) {
			/** 分隔符，有时候需要用\\反斜线转义 **/
			String[] split = string.split("\\|\\|");
			System.out.println(split[0]);
			/** 投资金额 **/
			String amountStr = split[1];
			BigDecimal amount = new BigDecimal(amountStr);
			/** 查询部分 **/
			String deptName = split[4];
			Department department = departmentDao.selectByName(deptName);
			Plan plan = new Plan(null, split[0],amount , split[3], split[2], department.getId());
			System.out.println(plan);
			/** 保存投资计划到数据库 **/
			planDao.insert(plan);
		}
	}
}
