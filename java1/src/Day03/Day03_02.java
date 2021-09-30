package Day03;

import java.util.Scanner;

import org.graalvm.compiler.lir.LIRInstruction.Temp;

import sun.jvm.hotspot.oops.ReturnTypeEntry;

public class Day03_02 {
	
	
	
	
	
	
	
	
	
	//문제1  : 2개의 정수를 입력받아 더큰 수 출력
	


	public static void main(String[] args) {
		Scanner 입력객체 = new Scanner(System.in);
		System.out.println("문제1 정수1 : "); int 정수1 = 입력객체.nextInt();
		System.out.println("문제1 정수2 : "); int 정수2 = 입력객체.nextInt();
		
		if( 정수1 > 정수2) { System.out.println("정수1 이 더 큽니다"); }
		else if (정수2>정수1) {System.out.println("정수2 이 더 큽니다");}
		else System.out.println("두수는 같다");
		//문제2 : 3개의 정수를 입력받아 가장 큰수 출력
		
		System.out.println("문제2 정수_1 : "); int 정수_1 = 입력객체.nextInt();
		System.out.println("문제2 정수_2 : "); int 정수_2 = 입력객체.nextInt();
		System.out.println("문제2 정수_3 : "); int 정수_3 = 입력객체.nextInt();
		//if( 정수_7 > 정수_8 && 정수_7>정수_9) { System.out.println("정수7 이  큽니다"); }
		if( 정수_1 > 정수_2) { System.out.println("정수1 이  큽니다"); }
		else if (정수_1>정수_3) {System.out.println("정수1 이 더 큽니다");}
		else if (정수_2>정수_1) {System.out.println("정수2 이 더 큽니다");}
		else if (정수_2>정수_3) {System.out.println("정수2 이 더 큽니다");}
		else if (정수_3>정수_1) {System.out.println("정수3 이 더 큽니다");}
		else if (정수_3>정수_2) {System.out.println("정수3 이 더 큽니다");}
		else System.out.println("세수는 같다");
		//문제3 : 4개의 정수를 입력받아 가장 큰수 출력
		System.out.println("문제3 정수__1 : "); int 정수__1 = 입력객체.nextInt();
		System.out.println("문제3 정수__2 : "); int 정수__2 = 입력객체.nextInt();
		System.out.println("문제3 정수__3 : "); int 정수__3 = 입력객체.nextInt();
		System.out.println("문제3 정수__4 : "); int 정수__4 = 입력객체.nextInt();
		
		if( 정수__1 > 정수__2 && 정수__1 > 정수__3 && 정수__1 > 정수__4) { System.out.println("정수__1 이  가장큽니다"); }
		if( 정수__2 > 정수__1 && 정수__2 > 정수__3 && 정수__2 > 정수__4) { System.out.println("정수__2 이  가장큽니다"); }
		if( 정수__3 > 정수__1 && 정수__3 > 정수__2 && 정수__3 > 정수__4) { System.out.println("정수__3 이  가장큽니다"); }
		if( 정수__4 > 정수__1 && 정수__4 > 정수__3 && 정수__4 > 정수__3) { System.out.println("정수__4 이  가장큽니다"); }
		else System.out.println("네수는 같다");
		
		//int 최대값 = 정수6;//max 변수에 첫번쨰 값 넣기
		/*IF (최대값 < 정수7)최대값 =정수7
		 * IF (최대값 < 정수8)최대값 =정수7
		 * IF (최대값 < 정수9)최대값 =정수7
		 System.out.println("가장큰수는 : "+ 최댓값);
		
		
		
		*/
		//문제 4개의 정수를 입력받아 오름 차순으로 출력
		// int temp; // 교환시 사용되는 임시변수
		
		System.out.println("문제3 정수___1 : "); int 정수___1 = 입력객체.nextInt();
		System.out.println("문제3 정수___2 : "); int 정수___2 = 입력객체.nextInt();
		System.out.println("문제3 정수___3 : "); int 정수___3 = 입력객체.nextInt();
		System.out.println("문제3 정수___4 : "); int 정수___4 = 입력객체.nextInt();
		int temp;
		if( 정수___1 > 정수___2) {temp = 정수___1 ; 정수___1 = 정수___2; 정수___2 = temp; }
		
		
		
		// 문제6 : 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력박기 
		// [ 조건 ] : 회원아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력
	
		System.out.println("아이디 : ");   String 아이디 = 입력객체 .next();
		System.out.println("비밀번호 : ");  int 비밀번호 = 입력객체  .nextInt();
		  if (아이디.equals("admin")) { // string 메소드 사용 // 아이디가 admin 이면
			  if(비밀번호 == 1234) { System.out.println(">>>>>>>로그인성공<<<<<<<<");
			return;// 가장 가까운 메소드 (함수) 종류
		}else { System.out.println("[로그인실패] 패스워드가 다릅니다");}
			
		}else {System.out.println("[로그인실패] 존재하지 않는 아이디 입니다");}
			
		
		
		
		
		
		
		
		
		
		  }	
		
	}
	

