package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.StudentsManagement.entity.Kecheng;

public interface KechengMapper {

	// �������пγ�
	@Select("select * from t_kecheng")
	List<Kecheng> getAllKecheng();

	// ɾ���γ�
	@Delete("delete from t_kecheng where id=#{id}")
	void KechengDel(Integer id);
	
	//��ӿγ�
	@Insert("insert into t_kecheng(bianhao,mingcheng,keshi)value(#{bianhao},#{mingcheng},#{keshi})")
	void KechengAdd(Kecheng kc);
}
