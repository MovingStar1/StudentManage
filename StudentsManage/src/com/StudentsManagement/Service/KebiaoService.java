package com.StudentsManagement.Service;

import java.util.List;

import com.StudentsManagement.entity.Kebiao;

public interface KebiaoService {
	// ��ȡ���пα�
	List<Kebiao> getAllKebiao();

	// ��ӿα�
	void AddKebiao(Kebiao kb);

	// ɾ���α�
	void DelKebiao(Integer id);

	// �����ҵ�ѡ����Ϣ
	List<Kebiao> getKebiaoByStudentID(Integer id);

	// ��ȡ��ʦ�Ŀγ̱���Ϣ
	List<Kebiao> getKebiaoByTeacherID(Integer id);


}
