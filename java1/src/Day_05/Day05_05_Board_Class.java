package Day_05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_05_Board_Class {

	
	
	//1. 서로 다른 자료형을 하나로 묶기
	public static void main(String[] args) {
		//2. 작성 한 클래스로 배열선언
		Board[] boards = new Board[100];
Scanner scanner = new Scanner(System.in); // 입력객체
		
		// 1. 무한루프 
		while(true) {
			System.out.println("\n\n================================커뮤니티====================================");
			System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","순번" , "제목" , "작성자","작성일","조회수");
			// 배열내 모든 인덱스 출력
			for( int i = 0 ; i<boards.length; i++ ) {
				if( boards[i][0] != null ) {
					System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
							i , boards[i].title , boards[i][2],boards[i][3],boards[i][4]);
				}
			}
			System.out.println("==========================================================================");
			System.out.print(" 1.글쓰기 2.글상세보기  >>선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				System.out.println(" >>>>>> 게시물 쓰기 >>>>>>");
					scanner.nextLine(); // 문제 보완
				System.out.print(" 제목 : ");	String title = scanner.nextLine();
				System.out.print(" 내용 : ");	String contents = scanner.nextLine();
				System.out.print(" 작성자 : ");	String writer = scanner.nextLine();
				// 현재 날짜 클래스
				Date now = new Date(); // 현재 시스템의 날짜/시간 객체
					// 날짜 형식 클래스 [ 날짜 형식 변경하기 ] 
					SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
					String date = dateFormat.format(now);
				// 조회수
					// string count = "1";
					
				String count = "1";
				// 모든 변수를 빈공간 배열에 저장 
				for( int i = 0 ; i<boards.length ;i++ ) {
					if( boards[i] == null) {//해당인덱스에  객체가없으면
						boards[i].title;  boards[i][1] = contents; boards[i][2] = writer; 
						boards[i].writer; boards[i].date = date;
						boards[i].count = 1 ; break;
						board[i] = board;
					}
				}				
			}
		 
			if( ch == 2 ) { 
				System.out.print(" >>> 게시물 번호 선택 : "); 	int ch2 = scanner.nextInt();
					// 해당 게시물의 조회수 1 증가
				//int count = Integer.parseInt( boards[ch2][4] ); //  [ 조회수(String) -> int 변환 ] 
				//boards[ch2][4] = Integer.toString(++count);	// 조회수 증가후 -> String 변환 
						boards[che2].count++;
				System.out.println("--------------- 게시물 상세페이지 -----------------");
				System.out.println(" >>> 제목 : " + boards[ch2][0]);
				System.out.println(" >>> 작성자 :"+ boards[ch2][2] +
						"\t작성일 : "+ boards[ch2].date+ "\t조회수 : "+boards[ch2]count );
				System.out.println(" >>> 내용 : " + boards[ch2]contents );
				System.out.println("-----------------------------------------------");
				
			}
		}
		
		
	
	}

	







		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
