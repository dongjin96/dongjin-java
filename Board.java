package ������������;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Board {
	//33�� 
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Boardlist[] board = new Boardlist[100];
	
		
	
	while(true) {
		
		System.out.println("=====================�����==================");
		System.out.printf("%5s\t %5s\t %5s\t %5s\t \n", "����","�ۼ���","��¥","��ȸ��");
		for (int i = 0; i < board.length; i++) {
			if (board[i]!=null) {System.out.printf("%5s\t %5s\t %5s\t %5s\t \n", 
					i ,board[i].title,board[i].writer,board[i].contents,board[i].date,board[i].count);
					
				
				
			}
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("1.�۾��� 2. �ۻ󼼺��� >>>>>:");int ch = scanner.nextInt();
		
		
		if (ch==1) {
		System.out.println("===================�۾���=============");
		scanner.nextLine();
		System.out.println("�����Է� :");String title = scanner.nextLine();
		System.out.println("�ۼ��� :");String writer = scanner.nextLine();
		System.out.println("���� :");String contents = scanner.nextLine();
		 /// ���⿡ if ��ȣ�־ 4������
		Date now = new Date();  // �ѹ��� date 
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM_dd");
		String date = dateFormat .format(now);
		
		String count = "1";
		
		for (int i = 0; i < board.length; i++) {
			if (board[i]==null) {
				Boardlist boards = new Boardlist();//10�� 
				
				
				boards.title = title; 	boards.contents = contents; 
				boards.writer = writer; 	boards.date = date; 
				boards.count = 1 ;
				
				board[i] = boards;
			
				
			}break;
			}
		
		}
		if(ch==2) {
			 System.out.println("�Խù� ��ȣ ���� >>>>>>:"); int ch2 = scanner.nextInt();
			System.out.println("===============�Խ��ǻ󼼺���==========");
			System.out.println("���� : "+board[ch2].title);
			System.out.println("���� : "+board[ch2].contents);
			System.out.println("�ۼ��� :"+board[ch2].writer);
			System.out.println("-------------------------------------------");
					
			
			
			
		}
		
	}//we
}
}
