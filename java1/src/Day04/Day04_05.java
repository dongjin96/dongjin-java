package Day04;

import java.util.Scanner;

import sun.security.util.Length;

public class Day04_05 {

	// �迭�� �̿��� �������� ���α׷�
		//1. �л����� �Է¹޾� �л�����ŭ �迭�� ���� �Ҵ�
		//2. �޴� [1. �л���2.�����Է�3.�м�[���,���]4.����]
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			int[]�л�������� = null;//�迭������ ����ֱ�
			while(true) {
				
				System.out.println("1. �л��� 2.�����Է�3.�м� 4.����");
				System.out.println("����: "); int ch = scanner.nextInt();
				if(ch==1)
					System.out.print("�л��� �Է�[�迭����] : "); int size = scanner.nextInt();
				//�迭�� �޸� �Ҵ�
					
					�л��������=new int[size]; //�Է¹��� �� ��ŭ �޸� �Ҵ�
					System.out.println(size+"��ŭ �л� ��� ����");
			
					if(ch==2) { // �л� ����ŭ ���� �Է� �ޱ� [�迭�� .length : �迭�Ǳ���]
						for(int i = 0 ; i<�л��������.length ; i++) {
					�л��������[i]= scanner.nextInt();}
					}
					if(ch==3) {
						//1. ��������
						for(int i = 0 ; i< �л� ������� length ; i++) {
							for{int j = i+1; j<�л��������[j])} //���� ��ü}
						}
					
					
					}
					if(ch==4) break;
			
			
			//2. Ŭ���� �̿��� ���� [�迭 ���� Ŭ���� = Arrays]
			
			
			
			}	
		}
}
