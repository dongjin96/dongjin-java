package Day02;

import java.util.Scanner;

public class Day02_4 {
	
	//����1 : �޿� ���� 
	public static void main(String[] args) {
		Scanner �Է°�ü = new Scanner(System.in);//ù������ �Է°�ü�� �ʿ���
		//1. �Է°�ü ���� =Scanner Ŭ������ �̿��ϴ� ��ü ����  �ڵ��ϼ����ؾ� ���� ����Ʈ���� , �ѱ۷� ���°� �ƹ��ų�����
		//2. �Է���ü�� ����� ���� ������ �ű��
						System.out.println("�⺻�� :");					int �⺻�� = �Է°�ü.nextInt();
						System.out.println("���� :");						int ���� = �Է°�ü.nextInt();
		//3. ���
						//100%->1 10%->0.1 1%->0.01
					int ���� = (int)(�⺻��* 0.1);//int *double	
						System.out.println("�Ǽ��ɾ� : "+ (�⺻��+����-����));
						
		//���� 2 : ���������	
						//1. ���� �Է¹ޱ�//�ؽ�Ʈ�������°�
					System.out.println("�ݾ� : ");	int �ݾ� = �Է°�ü.nextInt();
						//1.�ʸ�����
						System.out.println("�ʸ��� :"+(�ݾ�/100000)+"��");
						�ݾ� -=(�ݾ�/100000)*100000; //�ʸ�����������
						//2. ���� ��
						System.out.println("���� :"+(�ݾ�/10000)+"��");
						�ݾ� -=(�ݾ�/10000)*10000; //�������� ����
						//3. õ�� ��
						System.out.println("õ�� :"+(�ݾ�/1000)+"��");
						�ݾ� -=(�ݾ�/1000)*1000;
						//4.�����
						System.out.println("��� :"+(�ݾ�/100)+"��");
						�ݾ� -=(�ݾ�/100)*100;
		//���� 3 : �ϳ��� ������ �Է¹޾� 7�� ������� ��� [true,false]// ���� ����°� �Է°�ü�� �����־�
		 System.out.println("����3 ���� �Է� :");    int ����3 = �Է°�ü.nextInt();
				 //*���ã��
				 //��%��==0 �������� 0 �̸� ����  �׼��� ���
				 System.out.println("7�ǹ������ :"+(����3%7==0));
				 //Ȧ�� ã��
				 //��%2==1 ������ 2�� ���� �� �������� 0�̸� ¦�� 1�̸� Ȧ��
				 System.out.println("����4 ���� �Է� :");    int ����4 = �Է°�ü.nextInt();
				 System.out.println("Ȧ������ : " + (����4%2==1));
		
				 //.����5 �ϳ��� ���縦 �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ��[t or f]
		
				System.out.println("����5 ���� �Է�");int ����5 = �Է°�ü.nextInt();
				System.out.println("7�� ��� �̸鼭 ¦������: "+(����5%7==0 && ����5%2==0));
		  //. ���� 6
				 System.out.println("����6 ����1 �Է� ");int ����6_1 = �Է°�ü.nextInt();
				 System.out.println("����6 ����1 �Է� ");int ����6_2 = �Է°�ü.nextInt();
				 
				 System.out.println("����1>����2 ũ��: "+(����6_1>����6_2));
		//. ���� 7
				 
		
				 System.out.println("����7 ������ �Է�");double ������ = �Է°�ü.nextDouble();
				 
				 System.out.println("�����̴� :"+(������*������*3.14));
		//���� 8
				 //��) 54.5 84.3�̸� 64.285714%
				 
				 System.out.println("����8 �Ǽ�1 �Է�");double ����8_1 = �Է°�ü.nextDouble();
				 System.out.println("����8 �Ǽ�2 �Է�");double ����8_2 = �Է°�ü.nextDouble();
				 double ���� =(����8_1/����8_2)*100;
				 System.out.println("�Ǽ�1�� �Ǽ�2�� ����� : "+ ���� +"%");
				 // �Ҽ��� ������ ���� ����// �ۼ��������� �ΰ��־����
				 System.out.printf("�Ǽ�1�� �Ǽ�2�� ����� : %.2f%%",����);
				 // g���Ĺ��� :%f[�Ǽ�]
				   //%.����f[���� : �Ҽ��� �ڸ���]
				 //%.2f[�Ҽ��� 2�ڸ���]
				 // ���� 9 ��ٸ� �� ���� ���ϱ� [������ �غ� ���̸� �Է¹޾� ����ϱ�]
				 //��ٸ��� ���� => (����*�غ�)*����/2
				 System.out.println("����8  ���� �Է�");double ���� = �Է°�ü.nextDouble();
				 System.out.println("����8  �غ� �Է�");double �غ� = �Է°�ü.nextDouble();
				 System.out.println("����8  ���� �Է�");double ���� = �Է°�ü.nextDouble();
				 System.out.printf("��ٸ��� ���� : %.3f\n" , (����*�غ�)*���� / 2 );
				 //\n: �ٹٲ�
				//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
					//ǥ��ü�� ���� = > (Ű - 100) * 0.9
					System.out.print("����10 Ű �Է� : ");  	double Ű = �Է°�ü.nextDouble();
					System.out.println(" ǥ��ü�� ���� : " + ( Ű-100) * 0.9 );
					
				//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ�
				System.out.println("����12 inch �Է�");double inch = �Է°�ü.nextDouble();
				System.out.println("�Է��� inch�� cm�� ��ȯ : " +(inch*2.54));
				
				 
				//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
				System.out.println("����13 �߰����");double �߰���� = �Է°�ü.nextDouble();
				 System.out.println("����13  �⸻���");double �⸻��� = �Է°�ü.nextDouble();
				 System.out.println("����13 ������ �Է�");double ������ = �Է°�ü.nextDouble();
				 �߰���� *=0.3; �⸻��� *=0.3; ������*=0.4;
				 System.out.printf("�ݿ������� ���� : %2f\n", (�߰����+�⸻���+������));
				 
				//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
				 	//int x = 10;
					//int y = x-- + 5 + --x;
					//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
				 //1. x--+5=>10+5
				   //2. x--=>10->9
				 //3.--x=>9-> 8
				 //4.5+8=13
				 //5.15+8=>23
				 //
				System.out.println("5 �Է�"); double "5" = �Է°�ü.nextdouble();
				System.out.println("10 �Է�"); double "10" = �Է°�ü.nextdouble();
				System.out.println("7 �Է�"); double "7" = �Է°�ü.nextdouble();
				
				 System.out.printf("��ٸ��� ���� : %.1f\n" , (5*10)*7 / 2 );
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
