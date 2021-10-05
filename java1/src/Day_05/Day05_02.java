package Day_05;

import java.util.Scanner;

public class Day05_02 {

	
	
	public static void main(String[] args) {
		
		//0.
		 Scanner scanner = new Scanner(System.in);
		 
		//1. 회원 100명 [아이디,비번]저장하는 방법 선언
		String[][] 회원목록 = new String[100] [2];// 100행 *2열 =>200칸
		//1. 방문록 100개 [contents , writer] 저장하는 방법 선언
		String[][] 방문록 = new String[100][2];
		
		
		// 2. 메뉴 => 메뉴는 계속 반복 실행 : 무한루프 [while]
		while(true) {
			System.out.println("\n\n\t -회원제 방문록-");
			System.out.println("-----------------------------------");
			System.out.println("1.회원가입 2.로그인 선택 :");
			int ch = scanner.nextInt();
			
			//3. 입력에 따른 값 제어
			switch(ch) {
			case 1 : 
					System.out.println("- 회원가입 페이지");break;
					System.out.println("id :"); String id = scanner.next();
			
				
				// id 중복 체크[배열내 모든 인덱스에 접근해서 동일한 아이디가 있는지 체크]
				boolean idcheck =true;
				for(int i =0 ; i<회원목록.length ; i++) {
				if (회원목록[i][0].equals(id)) {System.out.println("[[알림]] : 중복된아이디가 존재합니다");}
				idcheck = false;
				break;// 중벅 찾기 for 종류
				
			// 중복체크 변수가 true 이면 배열내 빈 공간을 찾아서 저장 null은 공백
				if (idcheck) {
					for (int i =0 ; i<회원목록.length;i++) {
						if(회원목록[i][0]==null) {//i번쨰가 공백이면
							회원목록[i][0]=id ; 회원목록[i][1]= pw;
							System.out.println("[[알림]] : 회원가입이 되었습니다");
							break; // 저장하기for 종류
						}
					}
				}
				
				
				
	
			
			
			}// 배열ㅇ 저장
				회원목록[0][0]=id; 회원목록[0][1]=pw;
			case 2 :
				System.out.println("- 로그인 페이지");break;
				// 1.입력-> 저장
				System.out.println("id :"); String id = scanner.next();
				System.out.println("password :"); String pw = scanner.next();
				//2. 배열내에서 입력한 아이디와 패스워드가 존재하는지=> 존재하면 로그인 성공
				 // for문을 이용한 모든 인덱스에 접근해서 하나씩 비교
				boolean logincheck = true;
				for(int i = 0 ; i<회원목록.length ; i ++) {
					
					if(회원목록[i][0] !=null &&)
						회원목록[i][0].equals(logid) &&
						회원목록[i][1].equals(logpw) {
						System.out.println("[[알림]] : 로그인성공");
						/////////////////////////////////로그인 성공시 메뉴//////////////////////////////////
						while(true) {
							System.out.println("\n\n\t-회원 메뉴-");
							System.out.println("[[1.방문록2.로그아웃 선택 :]]");
							if( ch2 == 1  ) { 
								System.out.print("방문록 내용 : ");String contents = scanner.next();
								// 방문록 배열내 빈공간을 찾아서 내용과 로그인된 아이디를 저장
							else if( ch2 == 2 ){
								System.out.print("---------- 방문록 목록------------");
								System.out.printf("%10s \t %s \n" , "작성자" , "내용");
								// 배열내 공백을 제외한 모든 내용 출력
								for( int j = 0 ; j<방문록.length ; j++ )
									}
							else if( ch2 == 3 ) {
								System.out.println("[[ 알림 ]] : 로그아웃 되었습니다 ");
								break;
							}
							else System.out.println("[[ 알림 ]] : 알수 없는 행동입니다 ");
						}
						//////////////////////////////////////////////////////////////////////
						logincheck = false;
						break;
						
						
					}
					
					
					
					
				}
			case 3 :
				System.out.println("[[알림]] : 알수없는 번호 입니다");
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		}	
	}
	
}
