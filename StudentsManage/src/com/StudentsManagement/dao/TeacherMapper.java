package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.StudentsManagement.entity.Teacher;

public interface TeacherMapper {
	// 老师登录
	@Select("select * from t_laoshi where loginname=#{loginname} and loginpw=#{loginpw}")
	Teacher TeacherLogin(@Param("loginname") String loginname, @Param("loginpw") String loginpw);

	// 添加老师
	@Insert("insert into t_laoshi(bianhao,xingming,xingbie,nianling,zhicheng,loginname,loginpw)value(#{bianhao},#{xingming},#{xingbie},#{nianling},#{zhicheng},#{loginname},#{loginpw})")
	void AddTeacher(Teacher teacher);

	// 删除老师
	@Delete("delete from t_laoshi where id=#{id}")
	void DelTeacher(Integer id);

	// 查找所有老师
	@Select("select *from t_laoshi ")
	List<Teacher> getAllTeachers();
	
	
}
