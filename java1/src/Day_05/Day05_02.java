package Day_05;

import java.util.Scanner;

public class Day05_02 {

	
	
	public static void main(String[] args) {
		
		//0.
		 Scanner scanner = new Scanner(System.in);
		 
		//1. ȸ�� 100�� [���̵�,���]�����ϴ� ��� ����
		String[][] ȸ����� = new String[100] [2];// 100�� *2�� =>200ĭ
		//1. �湮�� 100�� [contents , writer] �����ϴ� ��� ����
		String[][] �湮�� = new String[100][2];
		
		
		// 2. �޴� => �޴��� ��� �ݺ� ���� : ���ѷ��� [while]
		while(true) {
			System.out.println("\n\n\t -ȸ���� �湮��-");
			System.out.println("-----------------------------------");
			System.out.println("1.ȸ������ 2.�α��� ���� :");
			int ch = scanner.nextInt();
			
			//3. �Է¿� ���� �� ����
			switch(ch) {
			case 1 : 
					System.out.println("- ȸ������ ������");break;
					System.out.println("id :"); String id = scanner.next();
			
				
				// id �ߺ� üũ[�迭�� ��� �ε����� �����ؼ� ������ ���̵� �ִ��� üũ]
				boolean idcheck =true;
				for(int i =0 ; i<ȸ�����.length ; i++) {
				if (ȸ�����[i][0].equals(id)) {System.out.println("[[�˸�]] : �ߺ��Ⱦ��̵� �����մϴ�");}
				idcheck = false;
				break;// �߹� ã�� for ����
				
			// �ߺ�üũ ������ true �̸� �迭�� �� ������ ã�Ƽ� ���� null�� ����
				if (idcheck) {
					for (int i =0 ; i<ȸ�����.length;i++) {
						if(ȸ�����[i][0]==null) {//i������ �����̸�
							ȸ�����[i][0]=id ; ȸ�����[i][1]= pw;
							System.out.println("[[�˸�]] : ȸ�������� �Ǿ����ϴ�");
							break; // �����ϱ�for ����
						}
					}
				}
				
				
				
	
			
			
			}// �迭�� ����
				ȸ�����[0][0]=id; ȸ�����[0][1]=pw;
			case 2 :
				System.out.println("- �α��� ������");break;
				// 1.�Է�-> ����
				System.out.println("id :"); String id = scanner.next();
				System.out.println("password :"); String pw = scanner.next();
				//2. �迭������ �Է��� ���̵�� �н����尡 �����ϴ���=> �����ϸ� �α��� ����
				 // for���� �̿��� ��� �ε����� �����ؼ� �ϳ��� ��
				boolean logincheck = true;
				for(int i = 0 ; i<ȸ�����.length ; i ++) {
					
					if(ȸ�����[i][0] !=null &&)
						ȸ�����[i][0].equals(logid) &&
						ȸ�����[i][1].equals(logpw) {
						System.out.println("[[�˸�]] : �α��μ���");
						/////////////////////////////////�α��� ������ �޴�//////////////////////////////////
						while(true) {
							System.out.println("\n\n\t-ȸ�� �޴�-");
							System.out.println("[[1.�湮��2.�α׾ƿ� ���� :]]");
							if( ch2 == 1  ) { 
								System.out.print("�湮�� ���� : ");String contents = scanner.next();
								// �湮�� �迭�� ������� ã�Ƽ� ����� �α��ε� ���̵� ����
							else if( ch2 == 2 ){
								System.out.print("---------- �湮�� ���------------");
								System.out.printf("%10s \t %s \n" , "�ۼ���" , "����");
								// �迭�� ������ ������ ��� ���� ���
								for( int j = 0 ; j<�湮��.length ; j++ )
									}
							else if( ch2 == 3 ) {
								System.out.println("[[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� ");
								break;
							}
							else System.out.println("[[ �˸� ]] : �˼� ���� �ൿ�Դϴ� ");
						}
						//////////////////////////////////////////////////////////////////////
						logincheck = false;
						break;
						
						
					}
					
					
					
					
				}
			case 3 :
				System.out.println("[[�˸�]] : �˼����� ��ȣ �Դϴ�");
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		}	
	}
	
}
