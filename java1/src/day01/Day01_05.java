package day01;

import java.util.Scanner; // import  : 다른 패키지에서 클래스 가져오기

public class Day01_05 {// c s
public static void main(String[] args) {
	
// 1.입력객체 만들기
	Scanner 입력객체 = new Scanner(System.in );
	// 2. 입력받은 값을 변수/객체 저장 [ 옮기기 ]
		System.out.println("회원가입 아이디 : "); String 아이디 = 입력객체.next();
		System.out.println("회원가입 비밀번호 : "); String 비밀번호 = 입력객체.next();
		System.out.println("회원가입 성명 : "); String 성명 = 입력객체.next();
		System.out.println("회원가입 이메일 : "); String 이메일 = 입력객체.next();
	
	// 3. 출력
		System.out.println(">>>>>>>>>>>>>>>>>>>>> 회원가입 완료  아래 정보를 확인해주세요 <<<<<<<<<<< : ");
		System.out.println("아이디\t 비밀번호\t 성명\t 이메일");
		System.out.println(아이디+"\t" +비밀번호+"\t"+성명+"\t"+이메일);
				
		
}


}// c e
