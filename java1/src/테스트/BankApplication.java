package 테스트;

import java.util.Scanner;



public class BankApplication {

	//계좌 프로그램 [계좌생성,예금,출금]
		/* 1.계좌설계
		 * 1.필드
		 * 2.생성자
		 * 3.메소드
		 * 
		 * 
	*/
	private static Account[] accountArry= new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {createAccount(); }
			else if(selectNo ==2) { }
			else if(selectNo ==3) {}
			else if(selectNo ==4) {}
			else if(selectNo ==5) {break;}	
		}
		System.out.println("프로그램 종류");
	}
	
	//
	private static void createAccount() {
		
			System.out.println("--------------------------------------");
			System.out.println("계좌 생성");
			System.out.println("--------------------------------");
			System.out.println("계좌 번호 :"); String ano= scanner.next();
			System.out.println("계좌주 : "); String owner = scanner.next();
			System.out.println(" 초기입금액 :");int balance = scanner.nextInt();
			
		Account account = new Account(ano,owner,balance);
	}
	
			
			
			
			
		
	
	private static void accountList() {}
	//private static Account findAccount(}
	private static void deposit() {}
	private static void withdraw() {}
	
	
}
