package com.StudentsManagement.Service;

import java.util.List;

import com.StudentsManagement.entity.Kecheng;

public interface KechengSerivce {
	// ��ȡ���пγ�
	List<Kecheng> getAllKecheng();

	// ɾ���γ�
	void KechengDel(Integer id);

	// ��ӿγ�
	void KechengAdd(Kecheng kc);
}
