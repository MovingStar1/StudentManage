package com.StudentsManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagement.dao.KebiaoMapper;
import com.StudentsManagement.entity.Kebiao;

@Service
public class KebiaoServiceImpl implements KebiaoService {
	@Autowired
	private KebiaoMapper kebiaoMapper;

	@Override
	public List<Kebiao> getAllKebiao() {
		// TODO Auto-generated method stub
		return kebiaoMapper.getAllKebiao();
	}

	@Override
	public void AddKebiao(Kebiao kb) {
		// TODO Auto-generated method stub
		kebiaoMapper.AddKebiao(kb);
		
	}

	@Override
	public void DelKebiao(Integer id) {
		// TODO Auto-generated method stub
		kebiaoMapper.DelKebiao(id);
		
	}

	@Override
	public List<Kebiao> getKebiaoByStudentID(Integer id) {
		// TODO Auto-generated method stub
		return kebiaoMapper.getKebiaoByStudentID(id);
	}

	@Override
	public List<Kebiao> getKebiaoByTeacherID(Integer id) {
		// TODO Auto-generated method stub
		return kebiaoMapper.getKebiaoByTeacherID(id);
	}

	


}
