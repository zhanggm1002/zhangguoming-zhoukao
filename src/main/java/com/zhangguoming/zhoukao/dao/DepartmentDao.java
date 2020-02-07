package com.zhangguoming.zhoukao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhangguoming.zhoukao.pojo.Department;
import com.zhangguoming.zhoukao.pojo.Plan;

public interface DepartmentDao {
	/**
	 * @Title: insert   
	 * @Description: 插入  
	 * @param: @param plan
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(Department department);
	/**
	 * @Title: deleteByIds   
	 * @Description: 删除   
	 * @param: @param ids
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteByIds(@Param("ids") String ids);
	/**
	 * @Title: update   
	 * @Description: 修改   
	 * @param: @param plan
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(Department department);
	/**
	 * @Title: selectById   
	 * @Description: 根据Id查询对象   
	 * @param: @param id
	 * @param: @return      
	 * @return: Plan      
	 * @throws
	 */
	Department selectById(Integer id);
	/**
	 * @Title: select   
	 * @Description: 根据条件查询数据   
	 * @param: @param plan
	 * @param: @return      
	 * @return: List<Plan>      
	 * @throws
	 */
	List<Department> select(Department department);
	/**
	 * @Title: selectByName   
	 * @Description: 根据部门名称，查询部门   
	 * @param: @param deptName
	 * @param: @return      
	 * @return: Department      
	 * @throws
	 */
	@Select("SELECT * FROM zhunneng_department WHERE `name`=#{deptName}")
	Department selectByName(String deptName);
}
