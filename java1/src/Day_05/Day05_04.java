package Day_05;

public class Day05_04 {
	
	package Day_05;

	public class Day05_04 {


		package Day05;

		import java.text.SimpleDateFormat;
		import java.util.Scanner;
//1. ���� �ٸ� �ڷ����� ������ �迭�� �����Ҽ� ����
		// ���� �ٸ� �ڷ��� =>�ϳ��� �ڷ��� �����=> ���� =>Ŭ����
			// �ڷ��� ����
		//2. �迭 �����  ���ÿ� �޸� �Ҵ�=> ���α׷� ����� �޸� ���� �Ұ�
		public class Day05_4_Board {
		public static void main(String[] args) {
			//0. ����
			String[][] boards =new String[100][5];//��ù� 100�� �����Ҽ� �ִ� �迭 ����[�Խù��� 5��]
				Scanner scanner = new Scanner(System.in);//�Է°�ü

			
			//1. ���ѷ���
				while(true) {
					System.out.println("----------------[�Խ���]------------");
					System.out.printf("%2s\t%10s\t%5s\t%3s\n","����","����","�ۼ���","�ۼ���","����");
					//�迭�� ��� �ε��� ���
						for( int i =0 ; i< boards .length;i++) {
					if (boards[i][0] != null) {System.out.println("%2s\t%10s\t%5s\t%3s\n");}
						i , boards[i][0], boards[i][2], boards[i][3],boards[i][4]);
						
						
				
			
						}//f	
		}//w
				System.out.println("==========================================");
				System.out.println("1.�۾���2.�ۻ󼼺��� >> ���� :"); int ch =scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�Խù�����");
					System.out.println("���� :"); String title= scanner.nextline();
				  System.out.println("���� :");String contents = scanner.nextline();	
				 System.out.println("�ۼ��� :");String writer = scanner.nextline();
				  Date now =new Date();
				  SimpleDateFormat dateFormat = new simpleDateFormate("MM-dd");
				  String date = dateFormat.format(now);}
				  //��ȸ��
				  String count ="1";
				  //��� ������ ����� �迭�� ����
				  for(int i=0 ; i<boards.length ;i++) {
					  if(boards[i][0]==null) {
						  boards[i][0]= title; boards
					  }
				  }
				  if(ch == 2) {
						System.out.println("�Խù���ȣ ����"); int che2 = scanner.nextInt()
								
								int count = inreger.parseInt
								
						System.out.println("===============�Խù���������===============");
						System.out.println("���� :" + boards[ch2][0]);
					  System.out.println("�ۼ��� :"+ boards[ch2][2]+
							  "\t�ۼ��� : " +  boards[ch2][3]+"\t��ȸ�� :" + boards[ch2][4]);
					  System.out.println(">>>>���� :"+ boards[ch2][1]);
					  
					 System.out.println("����:");String writer = scanner.nextline();

				
				
				
		}//me
		}//se
		// ����1: �Խ��� ���α׷�  
		// 0. 2���� �迭 ���  // �Խù���ȣ�� �ε��� ��ȣ
		// 1. �Խ��� [ ���� , ���� , �ۼ��� , �ۼ���[Date] , ��ȸ�� ]

		// 2. ���� �޴� ����
		// 
		/*
		 * 			[ �Խ��� ]
		 * 	����	����			�ۼ���	�ۼ���	��ȸ�� 
		 * 	1   �ȳ�			������	10-05	3 
		 * 	2  	�ȳ�2		������	10-05	3 
		 * 	3	�ȳ�3		��ȣ��	10-04	2
		 * 	���� : 1.�۾��� 2.�ۻ�������	
		 */

		// [ �۾��� ������ ]
			// 1. ���� , ���� , �ۼ��� , �ۼ���[Date] �Է¹޾� �迭�� ���� 
		// [ �ۻ������� �������� ] 
			// 1. ���������� �� �Խù� ��ȣ ���� 
			// 2. ������ �Խù��� �������� ��� 

		// 2. �������� ���� 
		/*
		 *	>> ���� : �ȳ�  
		 *	>> �ۼ��� : ������ 	�ۼ��� : 10-5		��ȸ�� : 3
		 * 	>> ���� : �ȳ��ϼ��� �ڹ� �Դϴ� 
		 * 	
		 * 	>> ���� : 1. �ڷΰ���	
		 * Scanner scanner = new Scanner(System.in);
			String
				int ����;
				int ����;
				int �ۼ��� ;
				int �ۼ���;
				int ��ȸ��=0;
				while(true) {//ws
				System.out.println("----------------[�Խ���]------------");
				System.out.println("1.����|2.����|3.�ۼ���|4.�ۼ���|5.��ȸ��");
				int ch = scanner.nextInt();
				
				if(ch == 1) {System.out.println("���� :");} ����= scanner.nextInt();
				else if (ch==2) {System.out.println("���� :");���� = scanner.nextInt();}	
				else if (ch==3) {System.out.println("�ۼ��� :");�ۼ��� = scanner.nextInt();}
				else if (ch==4) {System.out.println("�ۼ��� :");�ۼ��� = scanner.nextInt();
			      ��ȸ��++;
			      break;
			      boolean  ch2= true;
			      if(ch2<0 && ch2 >4) {System.out.println("�˼����� ��ȣ�Դϴ�");}
			      continue;
		 */
	  
		
		
		
		
	}



