package Day_05;

public class Day05_04 {
	
	package Day_05;

	public class Day05_04 {


		package Day05;

		import java.text.SimpleDateFormat;
		import java.util.Scanner;
//1. 서로 다른 자료형을 동일한 배열에 저장할수 없음
		// 서로 다른 자료형 =>하나의 자료형 만들기=> 설계 =>클래스
			// 자료형 설계
		//2. 배열 선언과  동시에 메모리 할당=> 프로그렘 실행시 메모리 변겨 불가
		public class Day05_4_Board {
		public static void main(String[] args) {
			//0. 설정
			String[][] boards =new String[100][5];//계시물 100를 저장할수 있는 배열 선언[게시물당 5열]
				Scanner scanner = new Scanner(System.in);//입력객체

			
			//1. 무한루프
				while(true) {
					System.out.println("----------------[게시판]------------");
					System.out.printf("%2s\t%10s\t%5s\t%3s\n","순번","제목","작성자","작성일","내용");
					//배열내 모든 인덱스 출력
						for( int i =0 ; i< boards .length;i++) {
					if (boards[i][0] != null) {System.out.println("%2s\t%10s\t%5s\t%3s\n");}
						i , boards[i][0], boards[i][2], boards[i][3],boards[i][4]);
						
						
				
			
						}//f	
		}//w
				System.out.println("==========================================");
				System.out.println("1.글쓰기2.글상세보기 >> 선택 :"); int ch =scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("게시물쓰기");
					System.out.println("제목 :"); String title= scanner.nextline();
				  System.out.println("내용 :");String contents = scanner.nextline();	
				 System.out.println("작성자 :");String writer = scanner.nextline();
				  Date now =new Date();
				  SimpleDateFormat dateFormat = new simpleDateFormate("MM-dd");
				  String date = dateFormat.format(now);}
				  //조회수
				  String count ="1";
				  //모든 변수를 빈공간 배열에 저장
				  for(int i=0 ; i<boards.length ;i++) {
					  if(boards[i][0]==null) {
						  boards[i][0]= title; boards
					  }
				  }
				  if(ch == 2) {
						System.out.println("게시물번호 선택"); int che2 = scanner.nextInt()
								
								int count = inreger.parseInt
								
						System.out.println("===============게시물상세페이지===============");
						System.out.println("제목 :" + boards[ch2][0]);
					  System.out.println("작성자 :"+ boards[ch2][2]+
							  "\t작성일 : " +  boards[ch2][3]+"\t조회수 :" + boards[ch2][4]);
					  System.out.println(">>>>내용 :"+ boards[ch2][1]);
					  
					 System.out.println("내용:");String writer = scanner.nextline();

				
				
				
		}//me
		}//se
		// 문제1: 게시판 프로그램  
		// 0. 2차원 배열 사용  // 게시물번호는 인덱스 번호
		// 1. 게시판 [ 제목 , 내용 , 작성자 , 작성일[Date] , 조회수 ]

		// 2. 메인 메뉴 예시
		// 
		/*
		 * 			[ 게시판 ]
		 * 	순번	제목			작성자	작성일	조회수 
		 * 	1   안녕			김현수	10-05	3 
		 * 	2  	안녕2		김현수	10-05	3 
		 * 	3	안녕3		강호동	10-04	2
		 * 	선택 : 1.글쓰기 2.글상세페이지	
		 */

		// [ 글쓰기 했을때 ]
			// 1. 제목 , 내용 , 작성자 , 작성일[Date] 입력받아 배열에 저장 
		// [ 글상세페이지 눌렀을때 ] 
			// 1. 상세페이지를 볼 게시물 번호 선택 
			// 2. 선택한 게시물의 상페이지 출력 

		// 2. 상세페이지 예시 
		/*
		 *	>> 제목 : 안녕  
		 *	>> 작성자 : 김현수 	작성일 : 10-5		조회수 : 3
		 * 	>> 내용 : 안녕하세요 자바 입니다 
		 * 	
		 * 	>> 선택 : 1. 뒤로가기	
		 * Scanner scanner = new Scanner(System.in);
			String
				int 제목;
				int 내용;
				int 작성자 ;
				int 작성일;
				int 조회수=0;
				while(true) {//ws
				System.out.println("----------------[게시판]------------");
				System.out.println("1.제목|2.내용|3.작성자|4.작성일|5.조회수");
				int ch = scanner.nextInt();
				
				if(ch == 1) {System.out.println("제목 :");} 제목= scanner.nextInt();
				else if (ch==2) {System.out.println("내용 :");내용 = scanner.nextInt();}	
				else if (ch==3) {System.out.println("작성자 :");작성자 = scanner.nextInt();}
				else if (ch==4) {System.out.println("작성일 :");작성일 = scanner.nextInt();
			      조회수++;
			      break;
			      boolean  ch2= true;
			      if(ch2<0 && ch2 >4) {System.out.println("알수없는 번호입니다");}
			      continue;
		 */
	  
		
		
		
		
	}



