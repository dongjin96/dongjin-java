package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import domain.Member;

public class MemberDao {
	
	
	//JDBC �ֿ� �������̽� , Ŭ����
		//1. Connection : DB ���� �������̽�[DriverManager Ŭ����]
	
	//1. �ʵ�
		private Connection connection; // ���� �������̽� ����
		private PreparedStatement preparedStatement; //sql ���� �������̽� ����
		private ResultSet resultSet;
		private static MemberDao memberDao = new MemberDao();
		
	//2. ������
		public MemberDao() {
			try {
				
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC","root","1234");
					
			} catch (Exception e) {
				System.out.println("*DB ���� ���� :"+e);
			}		
		}
	
		// 3. �޼ҵ�
		public static MemberDao getMemberDao() {
			return memberDao;
		}

		// ��ɸ޼ҵ�

		// 1. ȸ�����Ը޼ҵ�
		public boolean signup(Member member) {
			// 1.SQL �ۼ�[SQL :DB ���۾�DML]
			String sql = "insert into member(m_id,m_password,m_name,m_email,m_point)" + "values(?,?,?,?,?)";
			try {

				// 2. SQL----> DB ���� [preparedStatement �������̽� : ����� db�� sql������]
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				// 3. SQL ���� [? �� ������ �ֱ�]
				preparedStatement.setString(1, member.getM_id());
				preparedStatement.setString(2, member.getM_password());
				preparedStatement.setString(3, member.getM_name());
				preparedStatement.setString(4, member.getM_email());
				preparedStatement.setInt(5, member.getM_point());

				// 4. SQL ����
				preparedStatement.executeUpdate();

				// 5. SQL ���
				return true;
			} catch (Exception e) {
			}
			;
			return false;
		}

		// 2. �α��� �޼ҵ� 
		public boolean login( String id , String password ) {
			
			// 1. SQL �ۼ�
			String sql = "select * from member where m_id=? and m_password=?";
			// 2. SQL -> DB ���� [ ������ ���ܹ߻� ] 
			try {
				preparedStatement = connection.prepareStatement(sql);
			// 3. SQL ����  [ ���� �޼ҵ�� ���� �μ��� ? ���� ]
				preparedStatement.setString( 1 , id );
				preparedStatement.setString( 2 , password );
			// 4. SQL ���� [ Querey : ���� ( �˻� ��� )
				resultSet = preparedStatement.executeQuery();
			// 5. SQL ��� [ �˻���� ���� ] 
				if( resultSet.next() ) { // ��������� ���������� ������ true 	
					return true; // �α��� ���� 
				}
				else {
					return false; // �α��� ���� 
				}
			}catch (Exception e) {}
			return false ; // DB ���� 
		}
			// 3. ���̵�ã�� �޼ҵ� 
		public String findid( String name, String email ) {
			// 1. SQL �ۼ� 
			String sql = "select m_id from member where m_name=? and m_email = ?";
			// 2. SQL -> DB ���� 
			try {
				preparedStatement = connection.prepareStatement(sql);
				// 3. SQL ���� 
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, email);
				// 4. SQL ���� 
			 	resultSet = preparedStatement.executeQuery();
				// 5. SQL ��� 
				if( resultSet.next() ) { // �˻������ ������
					return resultSet.getString(1); // ����(�˻����)�� ù��° �ʵ带 ��ȯ 
				}else {
					return null; // �˻������ ������ null ��ȯ 
				}
			}
			catch (Exception e) {}
			return null; // db ���� 
		}
			
			// 4. �н�����ã�� �޼ҵ� 
		public String findpassword( String id, String email ) {
			// 1. SQL �ۼ� 
			String sql = "select m_password from member where m_id=? and m_email = ?";
			// 2. SQL -> DB ���� 
			try {
				preparedStatement = connection.prepareStatement(sql);
				// 3. SQL ���� 
				preparedStatement.setString(1, id);
				preparedStatement.setString(2, email);
				// 4. SQL ���� 
			 	resultSet = preparedStatement.executeQuery();
				// 5. SQL ��� 
				if( resultSet.next() ) { // �˻������ ������
					return resultSet.getString(1); // ����(�˻����)�� ù��° �ʵ带 ��ȯ 
				}else {
					return null; // �˻������ ������ null ��ȯ 
				}
			}
			catch (Exception e) {}
			return null; // db ���� 
		}		
				
	//4. �н�����ã��޼ҵ�
	//5. ȸ�������޼ҵ�
	//6. ȸ��Ż��޼ҵ�	





























}







//DB ���� �׽�Ʈ
/*
public class MemberDao {

	//1. mysql ����̺� Ȯ��
	public static void main(String[] args) {
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("����̺� �������� ����");
		//2. DB����
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC","root","1234");
		System.out.println("2. DB���� ����");
		} catch (Exception e) {
			System.out.println("DB ���� ����");
		}
		
		}
	
	
	*/