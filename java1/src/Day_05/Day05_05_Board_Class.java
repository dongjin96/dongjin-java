package Day_05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_05_Board_Class {

	
	
	//1. ���� �ٸ� �ڷ����� �ϳ��� ����
	public static void main(String[] args) {
		//2. �ۼ� �� Ŭ������ �迭����
		Board[] boards = new Board[100];
Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		// 1. ���ѷ��� 
		while(true) {
			System.out.println("\n\n================================Ŀ�´�Ƽ====================================");
			System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","����" , "����" , "�ۼ���","�ۼ���","��ȸ��");
			// �迭�� ��� �ε��� ���
			for( int i = 0 ; i<boards.length; i++ ) {
				if( boards[i][0] != null ) {
					System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
							i , boards[i].title , boards[i][2],boards[i][3],boards[i][4]);
				}
			}
			System.out.println("==========================================================================");
			System.out.print(" 1.�۾��� 2.�ۻ󼼺���  >>���� : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				System.out.println(" >>>>>> �Խù� ���� >>>>>>");
					scanner.nextLine(); // ���� ����
				System.out.print(" ���� : ");	String title = scanner.nextLine();
				System.out.print(" ���� : ");	String contents = scanner.nextLine();
				System.out.print(" �ۼ��� : ");	String writer = scanner.nextLine();
				// ���� ��¥ Ŭ����
				Date now = new Date(); // ���� �ý����� ��¥/�ð� ��ü
					// ��¥ ���� Ŭ���� [ ��¥ ���� �����ϱ� ] 
					SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
					String date = dateFormat.format(now);
				// ��ȸ��
					// string count = "1";
					
				String count = "1";
				// ��� ������ ����� �迭�� ���� 
				for( int i = 0 ; i<boards.length ;i++ ) {
					if( boards[i] == null) {//�ش��ε�����  ��ü��������
						boards[i].title;  boards[i][1] = contents; boards[i][2] = writer; 
						boards[i].writer; boards[i].date = date;
						boards[i].count = 1 ; break;
						board[i] = board;
					}
				}				
			}
		 
			if( ch == 2 ) { 
				System.out.print(" >>> �Խù� ��ȣ ���� : "); 	int ch2 = scanner.nextInt();
					// �ش� �Խù��� ��ȸ�� 1 ����
				//int count = Integer.parseInt( boards[ch2][4] ); //  [ ��ȸ��(String) -> int ��ȯ ] 
				//boards[ch2][4] = Integer.toString(++count);	// ��ȸ�� ������ -> String ��ȯ 
						boards[che2].count++;
				System.out.println("--------------- �Խù� �������� -----------------");
				System.out.println(" >>> ���� : " + boards[ch2][0]);
				System.out.println(" >>> �ۼ��� :"+ boards[ch2][2] +
						"\t�ۼ��� : "+ boards[ch2].date+ "\t��ȸ�� : "+boards[ch2]count );
				System.out.println(" >>> ���� : " + boards[ch2]contents );
				System.out.println("-----------------------------------------------");
				
			}
		}
		
		
	
	}

	







		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
