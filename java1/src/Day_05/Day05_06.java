package Day_05;

public class Day05_06 {
	
	// 회원 설계
		//1. 필드 : 속성
				//1.아이디,비밀번호,이름,연락처 등
		//2. 메소드 : 동작
			//1. 회원가입, 로그인, 회원탈퇴, 회원수정
	 // 객체 만들기 
	public static void main(String[] args) {
		
		
		Member 객체1 =new Member();
				// Member : 사용자 만든 클래스
					//객체 1 : 클래스명 [아무거나]
						//예외 : 기본자료형, String (미리 정해져 있기 떄문에)
							//int 정수 =10;
							//string 문자열 = "유재석"(영문 1바이트 한글 2바이트)문자는 바이트가 정해져있음
										// Member () : 객체 생성시 초기값
		
		
		
		// 2. 객체 내용물 넣기[.: 접근 연산자]
		// 객체내 필드에 접근해서 해당 필드에 값 넣기
		객체1.아이디 = "qwe";객체1.비밀번호="qwe";
		객체1.이름="qwe"; 객체1.연락처=12345;
		//3. 객체 내용물 호출
		System.out.println("객체 :"+객체1);
		System.out.println("객체내 필드 => 아이디 :"+객체1.아이디);
		System.out.println("객체내 필드 => 비밀번호 :"+객체1.비밀번호);
		System.out.println("객체내 필드 => 이름 :"+객체1.이름);
		System.out.println("객체내 필드 => 연락처 :"+객체1.연락처);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
