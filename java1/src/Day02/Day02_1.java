//주석 : 설명 달기 => 컴파일 [실행시] 무관

package Day02;//c s

import java.util.Scanner;

//java 는 100% 객체지향 언어!!!
public class Day02_1 {
//public : 접근제한자
		// class : 클래스 선언시 사용되는 키워드 [미리 만들어진 단어]
			// 클래스명[임의] : 첫글자를 대문자 (권장)
				//{ : 시작  } : 끝

  //자동완선 단축기 : ctrl + 스페이스바
	public static void main(String[] args) {// main의시작
		//main 메소드에는 main 스레드 존재 [스레드 : 코드를읽어주는역할]
			//main 메소드 괄호 밖에있는 코드는 실행 불가
	//syso +자동완성  메인 밖에다가 코드를 실행하면 코드 사용 불가~!	
	       //1. 입력객체 선언 [키보드로부터 입력받은값을 저장하는 객체]
		Scanner 입력객체 = new Scanner(System.in);
		//2. next()메소드를 이용한 객체내 입력값 뺴오기
		String 문자열= 입력객체.next();
		//3. 출력 [+: 연결연산자 (문자 +변수 연결)]
		 System.out.println("입력 값은 : " +문자열);
		  //""문저초리 : 키워드 [미리만들어진단어], 객체, 클레스명, 변수,숫자 등 제외
	
	
	
	
	
	}//main 의 끝




}//c e 클래스 의 끝~!
