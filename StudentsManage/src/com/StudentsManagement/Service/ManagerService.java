package com.StudentsManagement.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.StudentsManagement.entity.Manager;

public interface ManagerService {

	// ��ӹ���Ա
	void AddManager(Manager manager);

	// ����Ա��½
	Manager ManagerLogin(@Param("userName") String userName,
			@Param("userPw") String userPw);

	// ��ȡ���й���Ա
	List<Manager> getAllManager();

	// ɾ������Ա
	void DelManager(Integer id);

	// ���¹���Ա����
	void ManagerPwUpdate(Manager manager);
}
