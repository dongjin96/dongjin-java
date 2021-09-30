package Day03;

import java.util.Scanner;

public class Day03_08 {

	
	//133쪽 확인문제 7 : ATM 프로그램
	public static void main(String[] args) {
		
		//종류 버튼 누르기전까지 무한실행 프로그램=> while(true)
		boolean 실행 = true; //무한루프를 제어하는 변수
		int 예금액 = 0 ; //예금액
		Scanner scanner = new Scanner(System.in); //입력객체
		while(실행) {//[실행변수 true 무한루프 실행// 실행변수가 false 이면 무한루프 종류]
			System.out.println("\n-------------------------");
			System.out.println("1.예금 |2.출금|3잔고|4.종류");
			System.out.println("\n-------------------------");
			System.out.println("선택>"); int 선택 = scanner.nextInt();
			if(선택 == 1) {System.out.println("예금액 >" );예금액 += scanner.nextInt()}
			else if(선택 == 2) {System.out.println("출금액 >" ); int 출금액 -= scanner.nextInt()
					if(예금액<출금액) {System.out.println("[[알림]] 잔고가 부족합니다");}};
					
			else if(선택 == 3) {System.out.println("잔고 >"+예금액 );}
			
			
			if(선택 == 4)//만약에 4를 입력했을떄 
			{실행=false;// 실행변수를 FALSE 넣어서 무한루프 [while] 종류
			System.out.println("[[이용해주셔서 감사합니다]]");}
			else {System.out.println("[[경고]]: 알수 없는 번호 입니다");
		
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
