package org.soas.service;

import org.soas.domain.UserVO;

public interface UserService {

	
	public void register(UserVO vo) throws Exception;
	
	public UserVO read(Integer user_idx) throws Exception;
	
	public void modify(UserVO vo) throws Exception;
	
	public void remove(Integer user_idx) throws Exception;
	
	public UserVO login(UserVO vo) throws Exception;
	
	public boolean checkID(String user_ID) throws Exception;
	
	public String findID(UserVO vo) throws Exception;
	
	public void modifyPW(UserVO vo) throws Exception;

}
