package com.StudentsManagement.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.StudentsManagement.entity.Manager;

public interface ManagerService {

	// 添加管理员
	void AddManager(Manager manager);

	// 管理员登陆
	Manager ManagerLogin(@Param("userName") String userName,
			@Param("userPw") String userPw);

	// 获取所有管理员
	List<Manager> getAllManager();

	// 删除管理员
	void DelManager(Integer id);

	// 更新管理员密码
	void ManagerPwUpdate(Manager manager);
}
