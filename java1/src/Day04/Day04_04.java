package Day04;

public class Day04_04 {

	// ���� : [�ڷ���] �ϳ��� ���� �����Ҽ� �ִ� �޸� ����
	// ��ü : [Ŭ����] ���赵 ������� ������ �޸� ����
		// �迭 : ���� Ÿ���� �����͸� ���ӵ� ������ ����, (�������) �ε��� �ο�
			// ���� Ÿ���� ������ ������ ȿ����
			//1. �ε��� : ����Ǵ� ������ȣ [0������ ����~!]
			//2. [] : [�ε��� ��ȣ] ���ȣ�� ��
	
	        
	
	
	
	
	// int ���� 1= int ���� 2, int ���� 3 ~~~~~~~~~int ���� 100
	// int[] ���� = new int [100]
	
	
	
	
	public static void main(String[] args) {
		//153 ������ ��3)
		//1. �迭 ����  [ž�� []�迭��]= {��1, ��2, ��3} ]
		//1. Ÿ��[] �迭�� = {��1, ��2 , ��3}
		//2. Ÿ��[] �迭�� = new Ÿ�� [����];
		
		
		
		
		
		
		
		int[] scores = {83,90,87};
			//int[]�迭�� : �迭����
				//={��1(�ε���0), ��2(�ε���1), ��3(�ε���2)}
		
		
		//2. �迭 ȣ��[�ε����� ȣ���ϸ� ���� ȣ��ȴ�]
		System.out.println("scores[0]:"+ scores[0]);
		System.out.println("scores[1]:"+ scores[1]);
		System.out.println("scores[2]:"+ scores[2]);
		
		//3. �ݺ��� Ȱ��
		int sum =0;
		for(int i = 0 ; i<3 ; i++) {sum +=scores[i];}
		System.out.println("�迭�� ���� :" + sum);
		System.out.println("�迭�� ��� :" + (sum/3);
		
		
		
		
		//��2) //int �� ���� 3���� �����Ҽ� �ִ� �迭 ����
		int[]�����迭1= new int[3];
			//1. Ÿ�� : �ڷ��� /Ŭ����
				//2.�迭�� : �ƹ��ų� [����]
					//3. new  : �޸� �Ҵ� ������
						//4. Ÿ�� [�迭�� ����]
		//1. �ش� �ε����� �� �ֱ�
			�����迭1[0]=3;�����迭[1]=4; �����迭1[2]=5;
			//2.���
			System.out.println(�����迭1); // �޸� �ּҰ� [�迭�ּ�= ù���� �ε��� �ּ�]���
			System.out.println(�����迭1[0]); // �ش�) �ε����� �� ���
			
		
		
		
		
		
		
	}
	
}