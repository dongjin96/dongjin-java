package Day03;

import java.util.Scanner;

import org.graalvm.compiler.lir.LIRInstruction.Temp;

import sun.jvm.hotspot.oops.ReturnTypeEntry;

public class Day03_02 {
	
	
	
	
	
	
	
	
	
	//����1  : 2���� ������ �Է¹޾� ��ū �� ���
	


	public static void main(String[] args) {
		Scanner �Է°�ü = new Scanner(System.in);
		System.out.println("����1 ����1 : "); int ����1 = �Է°�ü.nextInt();
		System.out.println("����1 ����2 : "); int ����2 = �Է°�ü.nextInt();
		
		if( ����1 > ����2) { System.out.println("����1 �� �� Ů�ϴ�"); }
		else if (����2>����1) {System.out.println("����2 �� �� Ů�ϴ�");}
		else System.out.println("�μ��� ����");
		//����2 : 3���� ������ �Է¹޾� ���� ū�� ���
		
		System.out.println("����2 ����_1 : "); int ����_1 = �Է°�ü.nextInt();
		System.out.println("����2 ����_2 : "); int ����_2 = �Է°�ü.nextInt();
		System.out.println("����2 ����_3 : "); int ����_3 = �Է°�ü.nextInt();
		//if( ����_7 > ����_8 && ����_7>����_9) { System.out.println("����7 ��  Ů�ϴ�"); }
		if( ����_1 > ����_2) { System.out.println("����1 ��  Ů�ϴ�"); }
		else if (����_1>����_3) {System.out.println("����1 �� �� Ů�ϴ�");}
		else if (����_2>����_1) {System.out.println("����2 �� �� Ů�ϴ�");}
		else if (����_2>����_3) {System.out.println("����2 �� �� Ů�ϴ�");}
		else if (����_3>����_1) {System.out.println("����3 �� �� Ů�ϴ�");}
		else if (����_3>����_2) {System.out.println("����3 �� �� Ů�ϴ�");}
		else System.out.println("������ ����");
		//����3 : 4���� ������ �Է¹޾� ���� ū�� ���
		System.out.println("����3 ����__1 : "); int ����__1 = �Է°�ü.nextInt();
		System.out.println("����3 ����__2 : "); int ����__2 = �Է°�ü.nextInt();
		System.out.println("����3 ����__3 : "); int ����__3 = �Է°�ü.nextInt();
		System.out.println("����3 ����__4 : "); int ����__4 = �Է°�ü.nextInt();
		
		if( ����__1 > ����__2 && ����__1 > ����__3 && ����__1 > ����__4) { System.out.println("����__1 ��  ����Ů�ϴ�"); }
		if( ����__2 > ����__1 && ����__2 > ����__3 && ����__2 > ����__4) { System.out.println("����__2 ��  ����Ů�ϴ�"); }
		if( ����__3 > ����__1 && ����__3 > ����__2 && ����__3 > ����__4) { System.out.println("����__3 ��  ����Ů�ϴ�"); }
		if( ����__4 > ����__1 && ����__4 > ����__3 && ����__4 > ����__3) { System.out.println("����__4 ��  ����Ů�ϴ�"); }
		else System.out.println("�׼��� ����");
		
		//int �ִ밪 = ����6;//max ������ ù���� �� �ֱ�
		/*IF (�ִ밪 < ����7)�ִ밪 =����7
		 * IF (�ִ밪 < ����8)�ִ밪 =����7
		 * IF (�ִ밪 < ����9)�ִ밪 =����7
		 System.out.println("����ū���� : "+ �ִ�);
		
		
		
		*/
		//���� 4���� ������ �Է¹޾� ���� �������� ���
		// int temp; // ��ȯ�� ���Ǵ� �ӽú���
		
		System.out.println("����3 ����___1 : "); int ����___1 = �Է°�ü.nextInt();
		System.out.println("����3 ����___2 : "); int ����___2 = �Է°�ü.nextInt();
		System.out.println("����3 ����___3 : "); int ����___3 = �Է°�ü.nextInt();
		System.out.println("����3 ����___4 : "); int ����___4 = �Է°�ü.nextInt();
		int temp;
		if( ����___1 > ����___2) {temp = ����___1 ; ����___1 = ����___2; ����___2 = temp; }
		
		
		
		// ����6 : �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ڱ� 
		// [ ���� ] : ȸ�����̵� admin �̰� ��й�ȣ�� 1234 �� ��쿡�� �α��� ���� �ƴϸ� �α��� ���� ���
	
		System.out.println("���̵� : ");   String ���̵� = �Է°�ü .next();
		System.out.println("��й�ȣ : ");  int ��й�ȣ = �Է°�ü  .nextInt();
		  if (���̵�.equals("admin")) { // string �޼ҵ� ��� // ���̵� admin �̸�
			  if(��й�ȣ == 1234) { System.out.println(">>>>>>>�α��μ���<<<<<<<<");
			return;// ���� ����� �޼ҵ� (�Լ�) ����
		}else { System.out.println("[�α��ν���] �н����尡 �ٸ��ϴ�");}
			
		}else {System.out.println("[�α��ν���] �������� �ʴ� ���̵� �Դϴ�");}
			
		
		
		
		
		
		
		
		
		
		  }	
		
	}
	

