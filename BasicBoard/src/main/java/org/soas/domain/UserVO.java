package org.soas.domain;

import java.util.Date;

import lombok.Data;

@Data
public class UserVO {

	private Integer user_idx;
	private String user_type; // 회원, 관리자
	private String platform_type; // facebook, kakao, google, basic
	private String user_ID;
	private String user_PW;
	private String user_name;
	private String user_phoneNum;
	private String user_email;
	private String thumbnail;
	private Date create_date;
	private Date update_date;
	
	
	
}
