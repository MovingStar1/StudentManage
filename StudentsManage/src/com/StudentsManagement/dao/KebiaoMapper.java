package com.StudentsManagement.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import com.StudentsManagement.entity.Kebiao;

public interface KebiaoMapper {
	// ��ȡ���пα�
	List<Kebiao> getAllKebiao();

	// �����ҵ�ѡ����Ϣ
	List<Kebiao> getKebiaoByStudentID(Integer id);

	// ��ȡ��ʦ�Ŀγ̱���Ϣ
	List<Kebiao> getKebiaoByTeacherID(Integer id);

	// ��ӿα�
	@Insert("insert into t_kebiao(kecheng_id,shijian,jieci,jiaoshi,laoshi_id)value(#{kecheng_id},#{shijian},#{jieci},#{jiaoshi},#{laoshi_id})")
	void AddKebiao(Kebiao kb);

	// ɾ���α�
	@Delete("delete from t_kebiao where id=#{id}")
	void DelKebiao(Integer id);

}
