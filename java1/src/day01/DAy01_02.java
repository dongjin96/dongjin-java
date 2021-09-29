package day01;

public class DAy01_02 { // c s
	//System.out.print() // main 없이 실행 불가
	public static void main(String[] args) {
		
		
		
		//Public static void = new Public();main
		// main Ctrl+스페이스바
		// 1. 출력
		// Print(출력할 문구) : 출력
		// Println(출력할문구) : 출력후 줄바꿈 [라인바꿈]
		// Printf( 형식문자, 출력문구); : 형식 문자  맞는 출력
		// F : format : 모양
		// 형식문자
			// %d : 정수
			// %f : 실수
			// %s : 문자열
			// %c : 문자
	// 제어문자[P34]
		// ＼ : 엔터위의 원화기호
		// n 줄바꿈
		// t 탭
		
		//예1 : syso + crtl+스페이스바
		System.out.print("java");
		System.out.print(123456);// 기계어 이기 때문에 숫자에는 문자처리x
		System.out.print("java10"); // 문자+숫자  =>문자 
		// System : 미리 만들어진 시스템이라는 클래스
		// Out : 출력 스트림
		// print (인수: 출력하고 싶은말 : 출력 함수
		// . : 클래스내 멤버  (함수, 변수)접근 연산자 [특수문자]
		// " " : 키워드[미리 작성된 단어] ,변수 등 제외한 모든 문자에는 문자처리
		
		// ; : 한줄의 실행코드 끝 [일처리]
		
		//ctrl+F11 : 컴파일

		// 예제2
		System.out.print("java");
		System.out.print(12345);
		System.out.print("java10");
	
		//예제 3
		System.out.printf("%s", "java");
		System.out.printf("%d",  12345);
		System.out.printf("%s", "java10");
		
		// printf 장점
		System.out.printf("나이는 %d 입니다 " , 20 );
		System.out.print("java10");
		// + : 연결 연산자
		
		
		System.out.print("\njava\n");
		System.out.print("\t12345");
		System.out.print("\t12345");
		System.out.print("\rjava10");
		//문제 1
		/* 출력결과
		 * *                  [[출석부]]
		 *-------------------------------------------------
		 * 이름      1교시     2교시     3교시  비고
		 * 강호동     출석      결석      출석  
		 * 유재석     출석      결석      출석
		 *-------------------------------------------------
		 */
		
		System.out.println("\n＼t＼t [[출석부]]n");
		System.out.println("---------------------------");
		System.out.println("이름＼t1교시＼t2교시＼t3교시＼t비고");
		System.out.println("이름＼t1교시＼t2교시＼t3교시＼t비고");
		System.out.println("이름＼t1교시＼t2교시＼t3교시＼t비고");
		
		System.out.println();
	
		
		System.out.println("\\     /\\");
		System.out.println(")    ( ' )");
		System.out.println("(     / )");
		System.out.println("\\   (__)");
		System.out.println("\\(__)|");
	
		
		
		System.out.println("|\\_/|");	
		System.out.println("|q  p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'    |");
		System.out.println("||_/=\\__ |");
	
	}
	
	


}  // c e
