package day01;

import java.util.Scanner; // import  : �ٸ� ��Ű������ Ŭ���� ��������

public class Day01_05 {// c s
public static void main(String[] args) {
	
// 1.�Է°�ü �����
	Scanner �Է°�ü = new Scanner(System.in );
	// 2. �Է¹��� ���� ����/��ü ���� [ �ű�� ]
		System.out.println("ȸ������ ���̵� : "); String ���̵� = �Է°�ü.next();
		System.out.println("ȸ������ ��й�ȣ : "); String ��й�ȣ = �Է°�ü.next();
		System.out.println("ȸ������ ���� : "); String ���� = �Է°�ü.next();
		System.out.println("ȸ������ �̸��� : "); String �̸��� = �Է°�ü.next();
	
	// 3. ���
		System.out.println(">>>>>>>>>>>>>>>>>>>>> ȸ������ �Ϸ�  �Ʒ� ������ Ȯ�����ּ��� <<<<<<<<<<< : ");
		System.out.println("���̵�\t ��й�ȣ\t ����\t �̸���");
		System.out.println(���̵�+"\t" +��й�ȣ+"\t"+����+"\t"+�̸���);
				
		
}


}// c e
