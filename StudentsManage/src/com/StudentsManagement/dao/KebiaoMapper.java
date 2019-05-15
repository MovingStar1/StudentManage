package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import com.StudentsManagement.entity.Kebiao;

public interface KebiaoMapper {
	// 获取所有课表
	List<Kebiao> getAllKebiao();

	// 查找我的选课信息
	List<Kebiao> getKebiaoByStudentID(Integer id);

	// 获取老师的课程表信息
	List<Kebiao> getKebiaoByTeacherID(Integer id);

	// 添加课表
	@Insert("insert into t_kebiao(kecheng_id,shijian,jieci,jiaoshi,laoshi_id)value(#{kecheng_id},#{shijian},#{jieci},#{jiaoshi},#{laoshi_id})")
	void AddKebiao(Kebiao kb);

	// 删除课表
	@Delete("delete from t_kebiao where id=#{id}")
	void DelKebiao(Integer id);

}
