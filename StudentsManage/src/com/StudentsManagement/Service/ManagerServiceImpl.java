package com.StudentsManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagement.dao.ManagerMapper;
import com.StudentsManagement.entity.Manager;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public void AddManager(Manager manager) {
		managerMapper.AddManager(manager);

	}

	@Override
	public Manager ManagerLogin(String userName, String userPw) {
		// TODO Auto-generated method stub
		return managerMapper.ManagerLogin(userName, userPw);
	}

	@Override
	public List<Manager> getAllManager() {
		// TODO Auto-generated method stub
		return managerMapper.getAllManager();
	}

	@Override
	public void DelManager(Integer id) {
		// TODO Auto-generated method stub
		managerMapper.DelManager(id);

	}

	@Override
	public void ManagerPwUpdate(Manager manager) {
		managerMapper.ManagerPwUpdate(manager);

	}

}
