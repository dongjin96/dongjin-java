package �׽�Ʈ;

import java.util.Scanner;



public class BankApplication {

	//���� ���α׷� [���»���,����,���]
		/* 1.���¼���
		 * 1.�ʵ�
		 * 2.������
		 * 3.�޼ҵ�
		 * 
		 * 
	*/
	private static Account[] accountArry= new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���� ");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {createAccount(); }
			else if(selectNo ==2) { }
			else if(selectNo ==3) {}
			else if(selectNo ==4) {}
			else if(selectNo ==5) {break;}	
		}
		System.out.println("���α׷� ����");
	}
	
	//
	private static void createAccount() {
		
			System.out.println("--------------------------------------");
			System.out.println("���� ����");
			System.out.println("--------------------------------");
			System.out.println("���� ��ȣ :"); String ano= scanner.next();
			System.out.println("������ : "); String owner = scanner.next();
			System.out.println(" �ʱ��Աݾ� :");int balance = scanner.nextInt();
			
		Account account = new Account(ano,owner,balance);
	}
	
			
			
			
			
		
	
	private static void accountList() {}
	//private static Account findAccount(}
	private static void deposit() {}
	private static void withdraw() {}
	
	
}
