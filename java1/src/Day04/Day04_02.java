package Day04;

import java.util.Scanner;

public class Day04_02 {
	
	
	//console �� Ű����ũ [���Ǳ�]
			// 1.�޴���[1.�ݶ�[300]2.ȯŸ[200]3.���̴�[100]4.����]
			// �޴��� �Ʒ��� ������ ��ǰ�� ���[������� / �� ���� ���� �ݾ�]
			//2. �ʱ� ��� [10����] �ȷ����� ��� ���� // ��� �� ������ ���� �Ұ�
			//3. ������ �ݾ��� �Է¹޾Ƽ� ������ ��ŭ ������ �ܵ� ���!!
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ��� ����  [�������� : ������ ����� ��ȣ �ȿ����� ��� �����ϴ�]// ���ξȿ������� �ѵ� ���� ���� ���̿����¾ȵ�
		int �ݶ���� = 10;int ȯŸ��� = 10;int ���̴���� = 10;
		
		// . ��ٱ��� ����
		
			int �ݶ󱸸ż� = 10;int ȯŸ���ż� = 10;int ���̴ٱ��ż� = 10;
		//1. ���� ����
		while(true) {
			if (�ݶ����==0) {System.out.println("1.�ݶ�[����]2.ȯŸ[200]3.���̴�[100]4.����");
			}
			else
			{System.out.println("1.�ݶ�[300]2.ȯŸ[200]3.���̴�[100]4.����");}
			
			System.out.println(">>>>>>>>>����"); int ch =scanner.nextInt();
			if (ch==1) {// ��� ���� �� ���� �Ұ�
				if (�ݶ����==0) {System.out.println("[[�ݶ���������ϴ� : ��ǰ�غ���]]");}
				else {System.out.println("[[�ݶ� ��ҽ��ϴ�]]");
				�ݶ󱸸ż�++;
				�ݶ����--;
						
			}
			
		}
			if (ch==2) {// ��� ���� �� ���� �Ұ�
				if (ȯŸ���==0) {System.out.println("[[ȯŸ��������ϴ� : ��ǰ�غ���]]");}
				else {System.out.println("[[ȯŸ ��ҽ��ϴ�]]");
				ȯŸ���ż�++;
				ȯŸ���--;}
				
			if (ch==3) {// ��� ���� �� ���� �Ұ�
					if (���̴����==0) {System.out.println("[[���̴���������ϴ� : ��ǰ�غ���]]");}
					else {System.out.println("[[���̴� ��ҽ��ϴ�]]");
					���̴ٱ��ż�++;
					���̴����--;
			
			
			System.out.println("[[�ݶ� ��ҽ��ϴ�]]"); �ݶ󱸸ż�++;
		////////////////////////////////��ٱ���/////////////
		
		System.out.println("��ǰ��\t��ǰ����\t������");
		if(�ݶ󱸸ż�>0) {System.out.println(" �ݶ�\t"+�ݶ󱸸ż�+"\t"+�ݶ󱸸ż�*300);
		if(ȯŸ���ż�>0) {System.out.println(" ȯŸ\t"+ȯŸ���ż�+"\t"+ȯŸ���ż�*200);
		if(���̴ٱ��ż�>0) {System.out.println(" ���̴�\t"+���̴ٱ��ż�+"\t"+���̴ٱ��ż�*100);
		}
		{System.out.println(">>>>>>�� ������"+ (�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100) );}

		
		
		
		if(ch==4) {
			if(�ݶ󱸸ż�==0 && ȯŸ���ż�==0 && ���̴ٱ��ż� ==0)	{System.out.println("[�˸�]��������ǰ�� �����ϴ�");	}
			else {
			System.out.println("���� �Ͻðڽ��ϱ�?[y][n] : " ); String ch2 = scanner.next();
			if(ch2.equals("y")) {
				System.out.println("�ݾ����� :"); int money= scanner.nextInt();
				int totalpay = (�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100);
				if(money < totalpay) {System.out.println("[�˸�] �ݾ��� �����մϴ�");
			}
				else {
					System.out.println(" [�����Ϸ�] : �ܵ� : " + ( money - totalpay ));
					// ��ٱ��� �ʱ�ȭ 
					�ݶ󱸸ż� = 0 ; ȯŸ���ż� = 0 ; ���̴ٱ��ż� = 0 ;}
			
				else if( ch2.equals("n") ) {
					// ��ٱ��� �ʱ�ȭ 
					�ݶ󱸸ż� = 0 ; ȯŸ���ż� = 0 ; ���̴ٱ��ż� = 0 ;
			
			}else {
				System.out.println("[�˸�] :  �˼� ���� �ൿ �Դϴ� ");}
		
		
		
		
		
		
		
		
		
		
		
		}//while end	
	}//m e

}// c e
