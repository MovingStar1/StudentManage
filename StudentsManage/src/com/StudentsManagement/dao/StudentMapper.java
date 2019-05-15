package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.StudentsManagement.entity.Student;

public interface StudentMapper {
	// 学生登录
	@Select("select * from t_xuesheng where loginname=#{loginname} and loginpw=#{loginpw}")
	Student UserLogin(@Param("loginname") String loginname,
			@Param("loginpw") String loginpw);

	// 添加学生
	@Insert("insert into t_xuesheng(xuehao,xingming,xingbie,nianling,banji,loginname,loginpw)value(#{xuehao},#{xingming},#{xingbie},#{nianling},#{banji},#{loginname},#{loginpw})")
	void AddStudent(Student studnet);

	// 选课
	@Insert("insert into t_xuesheng_kebiao(xuesheng_id,kebiao_id)value(#{xuesheng_id},#{kebiao_id})")
	void Xuanke(@Param("xuesheng_id") Integer xuesheng_id,
			@Param("kebiao_id") Integer kebiao_id);
	

	// 删除学生
	@Delete("delete from t_xuesheng where id=#{id}")
	void DelStudent(Integer id);

	// 查找所有学生
	@Select("select *from t_xuesheng ")
	List<Student> getAllStudents();

}
