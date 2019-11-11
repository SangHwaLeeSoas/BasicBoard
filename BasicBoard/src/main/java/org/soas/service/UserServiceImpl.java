package org.soas.service;

import org.soas.domain.UserVO;
import org.soas.persistence.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDAO dao;
	
	@Override
	public void register(UserVO vo) throws Exception {

		dao.create(vo);
	}

	@Override
	public UserVO read(Integer user_idx) throws Exception {

		return dao.read(user_idx);
	}

	@Override
	public void modify(UserVO vo) throws Exception {

		dao.update(vo);
	}

	@Override
	public void remove(Integer user_idx) throws Exception {

		dao.delete(user_idx);
	}

}
