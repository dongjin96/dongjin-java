package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import domain.Member;

public class MemberDao {
	
	
	//JDBC 주요 인터페이스 , 클래스
		//1. Connection : DB 연결 인터페이스[DriverManager 클래스]
	
	//1. 필드
		private Connection connection; // 연결 인터페이스 선언
		private PreparedStatement preparedStatement; //sql 연결 인터페이스 선언
		private ResultSet resultSet;
		private static MemberDao memberDao = new MemberDao();
		
	//2. 생성자
		public MemberDao() {
			try {
				
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC","root","1234");
					
			} catch (Exception e) {
				System.out.println("*DB 연동 실패 :"+e);
			}		
		}
	
		// 3. 메소드
		public static MemberDao getMemberDao() {
			return memberDao;
		}

		// 기능메소드

		// 1. 회원가입메소드
		public boolean signup(Member member) {
			// 1.SQL 작성[SQL :DB 조작어DML]
			String sql = "insert into member(m_id,m_password,m_name,m_email,m_point)" + "values(?,?,?,?,?)";
			try {

				// 2. SQL----> DB 연결 [preparedStatement 인터페이스 : 연결된 db에 sql에조작]
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				// 3. SQL 조작 [? 에 데이터 넣기]
				preparedStatement.setString(1, member.getM_id());
				preparedStatement.setString(2, member.getM_password());
				preparedStatement.setString(3, member.getM_name());
				preparedStatement.setString(4, member.getM_email());
				preparedStatement.setInt(5, member.getM_point());

				// 4. SQL 실행
				preparedStatement.executeUpdate();

				// 5. SQL 결과
				return true;
			} catch (Exception e) {
			}
			;
			return false;
		}

		// 2. 로그인 메소드 
		public boolean login( String id , String password ) {
			
			// 1. SQL 작성
			String sql = "select * from member where m_id=? and m_password=?";
			// 2. SQL -> DB 연결 [ 무조건 예외발생 ] 
			try {
				preparedStatement = connection.prepareStatement(sql);
			// 3. SQL 설정  [ 현재 메소드로 들어온 인수를 ? 대입 ]
				preparedStatement.setString( 1 , id );
				preparedStatement.setString( 2 , password );
			// 4. SQL 실행 [ Querey : 쿼리 ( 검색 결과 )
				resultSet = preparedStatement.executeQuery();
			// 5. SQL 결과 [ 검색결과 연결 ] 
				if( resultSet.next() ) { // 쿼리결과에 다음내용이 있으면 true 	
					return true; // 로그인 성공 
				}
				else {
					return false; // 로그인 실패 
				}
			}catch (Exception e) {}
			return false ; // DB 오류 
		}
			// 3. 아이디찾기 메소드 
		public String findid( String name, String email ) {
			// 1. SQL 작성 
			String sql = "select m_id from member where m_name=? and m_email = ?";
			// 2. SQL -> DB 연결 
			try {
				preparedStatement = connection.prepareStatement(sql);
				// 3. SQL 설정 
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, email);
				// 4. SQL 실행 
			 	resultSet = preparedStatement.executeQuery();
				// 5. SQL 결과 
				if( resultSet.next() ) { // 검색결과가 있으면
					return resultSet.getString(1); // 쿼리(검색결과)내 첫번째 필드를 반환 
				}else {
					return null; // 검색결과가 없으면 null 반환 
				}
			}
			catch (Exception e) {}
			return null; // db 오류 
		}
			
			// 4. 패스워드찾기 메소드 
		public String findpassword( String id, String email ) {
			// 1. SQL 작성 
			String sql = "select m_password from member where m_id=? and m_email = ?";
			// 2. SQL -> DB 연결 
			try {
				preparedStatement = connection.prepareStatement(sql);
				// 3. SQL 설정 
				preparedStatement.setString(1, id);
				preparedStatement.setString(2, email);
				// 4. SQL 실행 
			 	resultSet = preparedStatement.executeQuery();
				// 5. SQL 결과 
				if( resultSet.next() ) { // 검색결과가 있으면
					return resultSet.getString(1); // 쿼리(검색결과)내 첫번째 필드를 반환 
				}else {
					return null; // 검색결과가 없으면 null 반환 
				}
			}
			catch (Exception e) {}
			return null; // db 오류 
		}		
				
	//4. 패스워드찾기메소드
	//5. 회원수정메소드
	//6. 회원탈퇴메소드	





























}







//DB 연동 테스트
/*
public class MemberDao {

	//1. mysql 드라이브 확이
	public static void main(String[] args) {
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이브 가져오기 성공");
		//2. DB연동
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC","root","1234");
		System.out.println("2. DB연동 성공");
		} catch (Exception e) {
			System.out.println("DB 연동 실패");
		}
		
		}
	
	
	*/