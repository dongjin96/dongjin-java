package day01;

import java.util.Scanner;

public class Day01_3 {

	// main �޼ҵ� (�Լ�)
	public static void main(String[] args) {
		// ��� Ŭ���� : System
		System.out.println("�Է� : "); //��� �޼ҵ� ȣ��
		// �Է� Ŭ���� : Scanner��ü : Ű����κ��� �Է¹��� ���� �޸�[������ġ] ��ü ����
		
		Scanner scanner = new Scanner(System.in);
		
		//��ü : Ŭ���� ������� ������ �޸� ����
			// ��ü ���� : Ŭ������ ��ü�� [����]= new ������	()
				// new : �޸� ������	
					// System. in : �Է�
					// System. out : ���
		
		// ��ü���� ��������
		//.next() : ��ü�� ����� ���ڿ� ȣ��(���� x)
		//.nextint() : ��ü�� ����� ���� ȣ��
		//.nextLine() : ��ü�� ����� ���ڿ� ȣ�� (����o)
		// ���
		String string1 = scanner.next();
		//��ü�� ����� �Է°��� ������ ����
		System.out.println("�Էµ� ���ڿ��� :"+ string1);
			
		String string2 = scanner.next();
		//���
		System.out.println("�Էµ� �ι�° ���ڿ��� : " + string2);
	}
	//�Է�
	
}
