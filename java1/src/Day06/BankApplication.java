package Day06;

import java.util.Scanner;


public class BankApplication {
	//static
	
	// private : ���� Ŭ���� �������� ȣ�� ����~!
		
	//100�� ���� ��ü�� �����Ҽ� �ִ� �迭����
	//main �޼ҵ� �ۿ� ����� ;main �޼ҵ� �� ��� �޼ҵ忡�� ȣ�Ⱑ��

	private static Account[] accountArray1 = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// ����������
		//public :������Ʈ�� �������� ȣ�Ⱑ��
		//private : ���� ���ϳ������� ȣ�Ⱑ��
		//default[����] : ������ ��Ű�� �������� ȣ�Ⱑ��
		//protected : ������ ��Ű���������� ȣ�� ����
		//Account account = new Account("123","���缮",500);
		
		//main �޼ҵ忡�� main������ ����
		//100�� ���� ��ü�� �����Ҽ� �ִ� �迭����
		//main �޼ҵ� �ۿ� ����� ;main �޼ҵ� �� ��� �޼ҵ忡�� ȣ�Ⱑ��
		Account[] accountArray = new Account[100];
		//static : �������� : ���α׷� ���ݿ� ���� ���� ����	
		// main�޼ҵ�� ���� ���α׷� ���۽� �޸� �Ҵ�
		//��� �޼ҵ忡 ���Ǵ� �ʵ忡����
		//<-----> �������� : �����{}�ȿ����� ��� ----->{}������ ������ �ʱ�ȭ
		
		
		
		
		
		boolean run = true;
		while(true) {
			System.out.println("===========================================");
			System.out.println("1.���»���||2.���¸��||3.����||4.���||5.����");
			System.out.println("===========================================");
			System.out.println("���� :");
			int selectNo = scanner.nextInt();
			if (selectNo==1) {}
			else if (selectNo==2) {accountlist}
			else if (selectNo==3) {}
			else if (selectNo==4) {}
			else if (selectNo==5) { run = false;}
		System.out.println("���α׷� ����");
	
		//�޼ҵ� ����
		// ���������� Ű���� ��ȯŸ�� �޼ҵ��(�Ű�����, �Űܺ���2~~){�����ڵ�;return:}
		
		// ���� �����ϱ�
		private static void creatAccount() {
			//1. �Է¹ޱ�
			System.out.println("---------------------------------");
			System.out.println("���»���");
			System.out.println("-----------------------------");
			//1.�Է¹ޱ� => ����������
			System.out.println(">>>>>> ���¹�ȣ :"); String ano = scanner.next();
			System.out.println(">>>>>> ������ :"); String owner = scanner.next();
			System.out.println(">>>>>> �ʱ��Աݾ� :"); String balance =scanner.next();
			
			//2.��ü����[�Է¹��� �������� ��ü �����ڿ� �־ ��ü �����]
			Account account = new Account(ano,owner,balance);
			//3. �迭����[�迭�� �����[null] �� ã�Ƽ� ����� �ε����� ��ü ����]
			for( int i = 0 ; i<accountArray.length ; i++ ) {
				if( accountArray[i] == null ) { // i��° �ε����� ��� ������ 
					accountArray[i] = account; // i��° �ε����� ��ü �ֱ� 
					System.out.println("��� : ���°� �����Ǿ����ϴ�. ");
					break; // ���»����� �ݺ��� ���� 
					
			
			
				}
			
				}
			
		}
		
		// static ������� : main ���� ȣ���ϱ� ���� [�̻��� : main �ش� �޼ҵ�]	
		
		// ���¸�Ϻ��� [ �μ�x ��ȯx ] 
		private static void createAccount() {
			System.out.println("--------------");
			System.out.println("���»���");
			System.out.println("--------------");
			// 1. �Է¹ޱ� => ������ ���� 
			System.out.print(">> ���¹�ȣ : ");	String ano = scanner.next();	
			System.out.print(">> ������ : ");	String owner = scanner.next();
			System.out.print(">> �ʱ��Աݾ� : ");int balance = scanner.nextInt();
			
			// 2. ��ü ���� [ �Է¹��� �������� ��ü �����ڿ� �־ ��ü ����� ] 
			Account account = new Account(ano, owner, balance);
			
			// 3. �迭���� [ �迭�� �����[null] �� ã�Ƽ� ����� �ε����� ��ü ���� ] 
			for( int i = 0 ; i<accountArray.length ; i++ ) {
				if( accountArray[i] == null ) { // i��° �ε����� ��� ������ 
					accountArray[i] = account; // i��° �ε����� ��ü �ֱ� 
					System.out.println("��� : ���°� �����Ǿ����ϴ�. ");
					break; // ���»����� �ݺ��� ���� 
				}
			}
		}	
		// ���¸�Ϻ��� [ �μ�x ��ȯx ] 
		private static void accountList() {
			System.out.println("--------------");
			System.out.println("���¸��");
			System.out.println("--------------");
			
			// 1. �迭�� ��� �ε����� ȣ�� [ ���� ���� ]
			for( int i = 0 ; i<accountArray.length ; i++ ) {
				if( accountArray[i]==null ) break;
				
				System.out.println( accountArray[i].getAno() + "\t" 
						+ accountArray[i].getOwner() +"\t"
						+ accountArray[i].getBalance() );
			}	
		}
		// Account �迭���� ano�� ������ Account��üã�� �޼ҵ� [ �μ�o( String ano ) ��ȯo ( Account ��ü ) ] 
		private static Account findAccount( String ano ) {
			Account account = null; // �ӽð�ü
			
			for( int i = 0 ; i<accountArray.length ; i++ ) {
				if( accountArray[i] != null ) { // i��° �ε����� ������ �ƴϸ鼭 
					 
					if( accountArray[i].getAno().equals(ano) ) {
						// i��° �ε����� ��ü�� ���¹�ȣ�� �μ�[�Է¹��� ���¹�ȣ]�� ������ 
						account = accountArray[i]; // ã�� ��ü�� �ӽð�ü�� ����
						break;
					}
				}
			}
			return account; // ���࿡ ������ ���¹�ȣ ������ ��ü[ã����ü] ��ȯ 
							// ������ ���¹�ȣ�� ������ ��ü[null] ��ȯ
		}
		// �����ϱ�  [ �μ�x ��ȯx ] 
		private static void deposit() { 
			System.out.println("--------------");
			System.out.println("����");
			System.out.println("--------------");
			// 1. �Է¹ޱ� 
			System.out.println(">>> ���¹�ȣ : ");		String ano = scanner.next();
			System.out.println(">>> ���ݾ� : ");	 	int balance = scanner.nextInt();
			// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ�� 
			Account account = findAccount(ano);
				// findAccount ��ȯ : ã�� ��ü Ȥ�� null 
			
			// 3. 
			if( account == null ) { // ��ȯ�� null �ϰ�� 
				System.out.println("��� : ���°� �������� �ʽ��ϴ�. ");
				return; // ���� �޼ҵ� ���� ���� 
			}
			
			// 4. 
			account.setBalance( account.getBalance() + balance  );
									// �������ݾ�  + �Է¹��� �Աݾ� 
				// set�޼ҵ� : �ʵ忡 �� ���� �޼ҵ� 
				// get�޼ҵ� : �ʵ��� �� ȣ�� �޼ҵ� 
			System.out.println("��� : ������ �����Ǿ����ϴ�. ");
			
		}
		// ����ϱ� [ �μ�x ��ȯx ] 
		private static void withdraw() {

			
				System.out.println("--------------");
				System.out.println("���");
				System.out.println("--------------");
				// 1. �Է¹ޱ� 
				System.out.println(">>> ���¹�ȣ : ");		String ano = scanner.next();
				System.out.println(">>> ���ݾ� : ");	 	int balance = scanner.nextInt();
				// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ�� 
				Account account = findAccount( ano );
				// 3.
				if( account == null ) { System.out.println("��� : ���°� �������� �ʽ��ϴ�. "); return; }
				if( account.getBalance() < balance  ) {
					// ��ݾ��� �������ݾ� ���� ũ�� ��ݺҰ� 
					System.out.println("���ݾ׺��� ���� �ݾ��� ����� �� �����ϴ�. "); return; 
				}		
				// 4.  �������ݾ� - ��ݾ�  
				account.setBalance( account.getBalance() - balance );
				System.out.println("��� : ����� �����Ǿ����ϴ�. ");	
			}

			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
