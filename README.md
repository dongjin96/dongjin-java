

public class Member {
	
	//1.필드
	// 회원들이 가져야할 고유 정보를 정해놓는것?
	private String m_name;
	private String m_id;
	private String m_pw;
	private String m_phone;
	
	
	// 빈생성자// 더사용할수있게 만든것
	
	public Member() {}
	//2. 생성자
	public Member(String m_name, String m_id, String m_pw, String m_phone) {// 외부입력값과 Member에저장된값을 구분지어놓음
		super();
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_phone = m_phone;
		
	}
	
	//회원가입 메소드
	public static boolean signup() {// 2. 번쨰로 회원가입 메소드만들기
		System.out.println("=================회원가입페이지============");
		System.out.println(" 이름 :"); String m_name =BookApplication.scanner.next();
		System.out.println("번호 입력");String m_phone=BookApplication.scanner.next();
		System.out.println("사용할 아이디 입력 :");String m_id=BookApplication.scanner.next();
		// 아이디 중복체크 
					boolean check = idcheck1(m_id);
					if( check ) {
						System.out.println(" [[ 알림 ]] : 사용할수 없는 아이디 입니다 ");
						return false; // 회원가입 실패  
					}
		/////////// 아이디 중복 체크 가 왜 둘로 나눠져있는지 모르겠음 // 회원가입 메소드밖에있는지 모르겠음
		
		
		System.out.println("사용할 비밀번호 입력 :");String m_pw=BookApplication.scanner.next();
		Member member = new Member(m_name, m_id, m_pw, m_phone);//입력받은 값을 하나의객체로 통일 시킨거같다
		try {
			
		
		for (int i = 0; i < BookApplication.members.length; i++) {
			if (BookApplication.members[i]==null) {//BookApplication.memberlist[i]가비어있으면 안에다가저장
				BookApplication.members[i]= member; //member를 BookApplication.memberlist[i]에저장
				// member 오류 ㅜ
				
			}
			
		}//for 배열
		} catch (Exception e) {
			
		}
		
		return false;// 이건회원가입안되었을경우
		
	}// 6. 아이디 체크(중복체크) 메소드
	public static boolean idcheck1( String check_id ) {
		for( int i = 0 ; i<BookApplication.members.length; i++ ) {
			if( BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id) ) {
				return true; // 인수와 동일한 아이디가 배열내 존재하면 true 
			}
		}
		return false; // 배열내 동일한 값이 없을경우 
	}

	
	
	
	
	//로그인메소드
	public static String login() {//1.제일 첫번째로한것 로그인메소드만들기
		System.out.println("------------------로그인 페이지 ----------------");
		System.out.println("아이디 :"); String m_id= BookApplication.scanner.next();//입력받은 아이디를 어플리케이션입력객체로만들기?
		System.out.println("비밀번호 :");String m_pw = BookApplication.scanner.next();
		// BookApplication.memberlist[i]저장된 정보와 동일한지 확인
		for (int i = 0; i < BookApplication.members.length; i++) {
		if (BookApplication.members[i]!=null&& 
				BookApplication.members[i].getM_id().equals(m_id)&&
				BookApplication.members[i].getM_pw().equals(m_pw)) {
			//만약에 BookApplication.memberlist[i]가 비어있지 않고 BookApplication.memberlist[i]안의 아이디비밀번호가 입력받은 값과동일하면
		
			// 위에 조건이 동일하면 리턴값을 m_id로주겠다는말
			return m_id;
		}
		
		
		}//다르면 null 공백으로준다  여기까지만든후 BookApplication으로이동
		return null;
		
		
		
		
	}
	
	//아이디찾기 메소드
	public static String findid() {//3. 아이디찾기
		System.out.println("=====ID찾기페이지=====");
		System.out.println("이름 :");String m_name= BookApplication.scanner.next();
		System.out.println("전화번호 :");String m_phone= BookApplication.scanner.next();
		for (int i = 0; i < BookApplication.members.length; i++) {
			if (BookApplication.members[i]!=null&&BookApplication.members[i].getM_name().equals(m_name)&&BookApplication.members[i].getM_phone().equals(m_phone)) {
				return BookApplication.members[i].getM_id();
			}// 이름 전화번호를 m_name,m_phone으로 입력받아서 for문을통해서 BookApplication.members[i] 에공간이없거나 가져온값과 BookApplication.members[i]와같으면 true
		}
		return null; //아니면 실패
		
		
		
		
	}// 아이디 찾기 메소드 끝
		// 비밀번호 찾기메소드

	public static String findpw() {
		System.out.println("=======PW찾기 페이지=======");
		System.out.println("ID입력 ");
		String m_id = BookApplication.scanner.next();
		System.out.println("연락처 :");
		String m_phone = BookApplication.scanner.next();
		// 전화번호는 중복될수없어서사용

		for (int i = 0; i < BookApplication.members.length; i++) {
			if (BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id)
					&& BookApplication.members[i].getM_phone().equals(m_phone)) {
				return BookApplication.members[i].getM_pw();
					//입력받은값을 for문을통해서 공간이 없고 입력한값이BookApplication.members[i]안에있는정보와동일한지 확인한다
			}
		}
		return null;
	}
	
	
	//3. 메소드

	public String getName() {
		return m_name;
	}
	public void setName(String name) {
		this.m_name = name;
	}
	public String getId() {
		return m_id;
	}
	public void setId(String id) {
		this.m_id = id;
	}
	public String getPw() {
		return m_pw;
	}
	public void setPw(String pw) {
		this.m_pw = pw;
	}
	public String getPhone() {
		return m_phone;
	}
	public void setPhone(String phone) {
		this.m_phone = phone;
	}
  
  
  
  
  
  
  
  
  
  -----------------------------------------------------------------
  package 과제;

import java.util.Scanner;

import 과제.Member;

public class BookApplication {// 오류 찾음 import를 다른 클래스 걸 사용해서 오류발생

	public static Member[] members = new Member[100];
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		main_menu();
	}

	public static void main_menu() {
		while (true) {
			System.out.println("===============================================");
			System.out.println("============로그인 페이지==========");
			System.out.println("1.로그인2.회원가입3.아이디찾기4.비밀번호찾기:");
			int ch = scanner.nextInt();
			if (ch == 1) {
				String loginid = Member.login();// 로그인 메소드를 호출하고 그결과값을 loginid에저장함

				if (loginid == null) {// Memberlogin메소드에서 가져온 결과값이비어있다
					System.out.println("[알림]동일한 회원정보가 없습니다");
				}

				else {
					member_menu(loginid);
				} // 로그인 성공하면 loginid 를가지고 member_menu로가져간다는말

			}

			if (ch == 2) {
				Member.signup();

			}
			if (ch == 3) {
				String findid = Member.findid();// findid메소드에서 받은 값을 저장
				if (findid == null) {
					System.out.println("동일한회원정보가없습니다"); // 왜냐면 없으니깐
				} else {
					System.out.println("회원님의 아이디는 :" + findid);
				}

			} // 3아이디찾기

			if (ch == 4) {// 비밀번호찾기
				String findpw2 = Member.findpw();
				if (findpw2 == null) {
					System.out.println("동일한정보가없습니다");

				} else {
					System.out.println("회원님의 비밀번호입니다 :" + findpw2);

				}

			}

		} // main_menu while문 끝나는 과정

	}

	private static void member_menu(String loginid) {
		// TODO Auto-generated method stub

	}// main_menu 끝나는과정

}
