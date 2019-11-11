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

}
