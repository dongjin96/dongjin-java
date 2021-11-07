package 오동진정리함;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Board {
	//33분 
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Boardlist[] board = new Boardlist[100];
	
		
	
	while(true) {
		
		System.out.println("=====================계시판==================");
		System.out.printf("%5s\t %5s\t %5s\t %5s\t \n", "제목","작성자","날짜","조회수");
		for (int i = 0; i < board.length; i++) {
			if (board[i]!=null) {System.out.printf("%5s\t %5s\t %5s\t %5s\t \n", 
					i ,board[i].title,board[i].writer,board[i].contents,board[i].date,board[i].count);
					
				
				
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("1.글쓰기 2. 글상세보기 >>>>>:");int ch = scanner.nextInt();
		
		
		if (ch==1) {
		System.out.println("===================글쓰기=============");
		scanner.nextLine();
		System.out.println("제목입력 :");String title = scanner.nextLine();
		System.out.println("작성자 :");String writer = scanner.nextLine();
		System.out.println("내용 :");String contents = scanner.nextLine();
		 /// 여기에 if 괄호있어서 4분은봄
		Date now = new Date();  // 한번봄 date 
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM_dd");
		String date = dateFormat .format(now);
		
		String count = "1";
		
		for (int i = 0; i < board.length; i++) {
			if (board[i]==null) {
				Boardlist boards = new Boardlist();//10번 
				
				
				boards.title = title; 	boards.contents = contents; 
				boards.writer = writer; 	boards.date = date; 
				boards.count = 1 ;
				
				board[i] = boards;
			
				
			}break;
			}
		
		}
		if(ch==2) {
			 System.out.println("게시물 번호 선택 >>>>>>:"); int ch2 = scanner.nextInt();
			System.out.println("===============게시판상세보기==========");
			System.out.println("제목 : "+board[ch2].title);
			System.out.println("내용 : "+board[ch2].contents);
			System.out.println("작성자 :"+board[ch2].writer);
			System.out.println("-------------------------------------------");
					
			
			
			
		}
		
	}//we
}
}
