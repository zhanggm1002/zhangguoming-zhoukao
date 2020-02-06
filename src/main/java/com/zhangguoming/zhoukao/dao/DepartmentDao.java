package com.zhangguoming.zhoukao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	int insert(Plan plan);
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
	int update(Plan plan);
	/**
	 * @Title: selectById   
	 * @Description: 根据Id查询对象   
	 * @param: @param id
	 * @param: @return      
	 * @return: Plan      
	 * @throws
	 */
	Plan selectById(Integer id);
	/**
	 * @Title: select   
	 * @Description: 根据条件查询数据   
	 * @param: @param plan
	 * @param: @return      
	 * @return: List<Plan>      
	 * @throws
	 */
	List<Plan> select(Plan plan);
}
