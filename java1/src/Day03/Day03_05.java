package Day03;

import java.util.Scanner;




public class Day03_05 {
	
	
	
	public static void main(String[] args) {
		
	Readable[] string;
	Scanner scanner = new Scanner(System.in );
	//�ݺ����� ����� ���
		// ���� 1) �Է¹��� ������ŭ �� ������ // s :�Է��Ѽ�
	System.out.println("����1)�� ���� :"); int s = scanner. nextInt();
	for (int i = 1; i <=s ; i++) {System.out.print("*");}
	
	System.out.println("\n ----------------------------");
	
	// ����2) �Է¹��� ������ŭ ����� // 5������(5���) �ٹٲ�
		
		System.out.println("���� 2) �� ����"); int s2 =scanner.nextInt();
		for (int i = 1; i <=s; i++) {System.out.print(" * ");
		if(i%5==0)System.out.println();
			
		}
		System.out.println("\n ----------------------------");
		// ���� 3 �Է¹��� �ٸ�ŭ �����
		
	
		System.out.println("���� 3) �� ��"); int line =scanner.nextInt();
		
		//i �� 1���� �Է¹��� �ټ� (line)���� 1�� �����ϸ鼭 ������
		for (int i = 1; i <= line ; i++) {
			//�ٹٲ� �ϱ����� �����
			for (int s1 = 1; s1 <=i; s1++) {System.out.print("*");}
				System.out.println();}
	
		//.���� 4
		System.out.println("\n ----------------------------");
		System.out.println("���� 4) �� ��"); int line4 =scanner.nextInt();
		for( int i = 1 ; i<=line4 ; i++ ) {
		//�����
		for (int s1= 1; s1<= line4-i+1 ; s1++) {System.out.print("*");}
		System.out.println();
		}
		
		//.���� 4
		System.out.println("\n ----------------------------");
		System.out.println("���� 4) �� ��"); int line5 = scanner.nextInt();
		
		for( int i = 1 ; i<=line5 ; i++ ) {
			// �������
			for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" ");}
			// �����
			for( int s1 = 1 ; s1<=i ; s1++ ) {System.out.print("*");}
			// �ٹٲ�
			System.out.println();}
		
		System.out.println("\n ----------------------------");	
		System.out.println("����6) �� �� :"); scanner.next();
		for (int i =1 ; i<=line6; i++) {
			//�������
			for(int b =1 ;)
		}
			
}
	
}
