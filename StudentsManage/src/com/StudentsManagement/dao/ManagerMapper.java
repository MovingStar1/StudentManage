package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.StudentsManagement.entity.Manager;

public interface ManagerMapper {
	// 管理员登录
	@Select("select * from t_admin where userName=#{userName} and userPw=#{userPw}")
	Manager ManagerLogin(@Param("userName") String userName, @Param("userPw") String userPw);

	// 添加管理员
	@Insert("insert into t_admin(userName,userPw)value(#{userName},#{userPw})")
	void AddManager(Manager manager);

	// 查找所有管理员
	@Select("select*from t_admin ")
	List<Manager> getAllManager();

	// 删除管理员
	@Delete("delete from t_admin where userId=#{userId}")
	void DelManager(Integer id);

	// 更新管理员密码
	@Update("update t_admin set userPw=#{userPw} where userName=#{userName}")
	void ManagerPwUpdate(Manager manager);
	
	
	

	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
