package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.StudentsManagement.entity.Teacher;

public interface TeacherMapper {
	// ��ʦ��¼
	@Select("select * from t_laoshi where loginname=#{loginname} and loginpw=#{loginpw}")
	Teacher TeacherLogin(@Param("loginname") String loginname, @Param("loginpw") String loginpw);

	// �����ʦ
	@Insert("insert into t_laoshi(bianhao,xingming,xingbie,nianling,zhicheng,loginname,loginpw)value(#{bianhao},#{xingming},#{xingbie},#{nianling},#{zhicheng},#{loginname},#{loginpw})")
	void AddTeacher(Teacher teacher);

	// ɾ����ʦ
	@Delete("delete from t_laoshi where id=#{id}")
	void DelTeacher(Integer id);

	// ����������ʦ
	@Select("select *from t_laoshi ")
	List<Teacher> getAllTeachers();
	
	
}
