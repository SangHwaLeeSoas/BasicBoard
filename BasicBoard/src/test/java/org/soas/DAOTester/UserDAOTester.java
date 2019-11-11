package org.soas.DAOTester;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.soas.domain.UserVO;
import org.soas.persistence.UserDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class UserDAOTester {

	@Inject
	private UserDAO dao;
	
	@Test
	public void CreateTest() throws Exception {
		
		UserVO vo = new UserVO();

		vo.setUser_type("회원");
		vo.setPlatform_type("basic");
		vo.setUser_ID("ID12345678");
		vo.setUser_PW("asdf1234");
		vo.setUser_name("테스터");
		vo.setUser_phoneNum("010328924539");
		vo.setUser_email("sangwha0924@naver.com");
		vo.setThumbnail("기본");
		
		dao.create(vo);
		
	}

	
	@Test
	public void readTest() throws Exception {
		
		dao.read(1);
	}
	
	
	@Test
	public void updateTest() throws Exception {
		
		UserVO vo = new UserVO();
		
		vo.setUser_name("업데이트");
		vo.setUser_phoneNum("123123");
		vo.setUser_email("12312312312123");
		vo.setThumbnail("기본");
		vo.setUser_idx(1);
		
		dao.update(vo);
	}
	
	
	@Test
	public void deleteTest() throws Exception {
		
		dao.delete(1);
	}
	
}
