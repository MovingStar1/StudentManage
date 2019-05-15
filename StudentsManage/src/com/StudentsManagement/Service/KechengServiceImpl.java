package com.StudentsManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagement.dao.KechengMapper;
import com.StudentsManagement.entity.Kecheng;

@Service
public class KechengServiceImpl implements KechengSerivce {
	@Autowired
	private KechengMapper kechengMapper;

	@Override
	public List<Kecheng> getAllKecheng() {
		// TODO Auto-generated method stub
		return kechengMapper.getAllKecheng();
	}

	@Override
	public void KechengDel(Integer id) {
		// TODO Auto-generated method stub
		kechengMapper.KechengDel(id);

	}

	@Override
	public void KechengAdd(Kecheng kc) {
		// TODO Auto-generated method stub
		kechengMapper.KechengAdd(kc);

	}

}
