package org.soas.persistence;

import org.apache.ibatis.session.SqlSession;
import org.soas.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SqlSession session;
	
	private static final String namespace = "org.soas.mapper.UserMapper";

	@Override
	public void create(UserVO vo) throws Exception {

		session.insert(namespace + ".create", vo);
		
	}

	@Override
	public UserVO read(Integer user_idx) throws Exception {
		
		return session.selectOne(namespace + ".read", user_idx);
	}

	@Override
	public void update(UserVO vo) throws Exception {

		session.update(namespace + ".update", vo);

	}

	@Override
	public void delete(Integer user_idx) throws Exception {

		session.delete(namespace + ".delete", user_idx);
	}

	@Override
	public UserVO login(UserVO vo) throws Exception {

		return session.selectOne(namespace + ".login", vo);
	}

	@Override
	public boolean checkID(String user_ID) throws Exception {

		String loginID = session.selectOne(namespace + ".checkID", user_ID);
		//System.out.println("loginID : " + loginID);
		
		boolean loginValue = loginID == null ? true : false;
		//System.out.println("loginValue : " + loginValue);
		
		return loginValue;
	}

	@Override
	public String findID(UserVO vo) throws Exception {

		return session.selectOne(namespace + ".findID", vo);
	}

	@Override
	public void updatePW(UserVO vo) throws Exception {

		session.update(namespace + ".updatePW", vo);
	}

}
