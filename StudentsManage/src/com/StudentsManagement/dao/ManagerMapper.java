package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.StudentsManagement.entity.Manager;

public interface ManagerMapper {
	// ����Ա��¼
	@Select("select * from t_admin where userName=#{userName} and userPw=#{userPw}")
	Manager ManagerLogin(@Param("userName") String userName, @Param("userPw") String userPw);

	// ��ӹ���Ա
	@Insert("insert into t_admin(userName,userPw)value(#{userName},#{userPw})")
	void AddManager(Manager manager);

	// �������й���Ա
	@Select("select*from t_admin ")
	List<Manager> getAllManager();

	// ɾ������Ա
	@Delete("delete from t_admin where userId=#{userId}")
	void DelManager(Integer id);

	// ���¹���Ա����
	@Update("update t_admin set userPw=#{userPw} where userName=#{userName}")
	void ManagerPwUpdate(Manager manager);
	
	
	

	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}
