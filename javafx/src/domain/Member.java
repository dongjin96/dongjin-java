package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import domain.Member;
public class Member {

	// 1. 필드
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_email;
	private int m_point;

	// 2. 생성자
	public Member() {
	}

	// 모든 필드를 받는 생성자
	public Member(String m_id, String m_password, String m_name, String m_email, int m_point) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = m_point;
	}

	// 회원가입시 사용되는 생성자 [포인트를 제외=>초기값]

	public Member(String m_id, String m_password, String m_name, String m_email) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_point = 1000;
	}

	// 4. 회원 수정시 사용되는 수정자
	public Member(String m_name, String m_email) {
		super();
		this.m_name = m_name;
		this.m_email = m_email;

	}

	// 3.메소드

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public int getM_point() {
		return m_point;
	}

	public void setM_point(int m_point) {
		this.m_point = m_point;
	}
	
	//Email 전송 메소드
	public static void sendmail(String tomail, String msg, int type) {
								//받는사람//메일내용//메일 타입
		
		//보내는 사람 정보
		String fromemail ="dhehdwls44@naver.com";
				String frompassword = "";
		//설정 네이버 ,구글 카카오 호스트 설정
			Properties properties = new  Properties();
			properties.put("mail.smtp.host","smtp.naver.com");
			properties.put("mail.smtp.port",587);
			properties.put("mail.smtp.auth",true);
			//인증
			Session session = Session.getDefaultInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromemail, frompassword);
				}
			
			});
			// 메일 보내기
			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom( new InternetAddress(fromemail) );
				message.addRecipient( Message.RecipientType.TO, new InternetAddress(tomail));
				
				if( type == 2 ) { // 비밀번호 찾기 타입 
					message.setSubject("Nike community 회원님의 패스워드 결과 ");
					message.setText(" 회원님의 비밀번호 : "+ msg );
				}
				Transport.send(message);
			}
			catch (Exception e) {}
			
			
			
				
	}
	
	//회원가입시 사용되는 생성자
	
	
	
	
	
	
	
}
