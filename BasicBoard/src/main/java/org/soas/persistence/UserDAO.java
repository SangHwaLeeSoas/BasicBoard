package org.soas.persistence;

import org.soas.domain.UserVO;

public interface UserDAO {
	
	public void create(UserVO vo) throws Exception;
	
	public UserVO read(Integer user_idx) throws Exception;
	
	public void update(UserVO vo) throws Exception;
	
	public void delete(Integer user_idx) throws Exception;

	public UserVO login(UserVO vo) throws Exception;
	
	public boolean checkID(String user_ID) throws Exception;
	
	public String findID(UserVO vo) throws Exception;
	
	public void updatePW(UserVO vo) throws Exception;
	
}
