package Day03;

public class Day03_01 {
	// ��ǻ�� [0.1] : ����
	//1. ��ǻ��[java] ���/�Է�
	//2. �޸�[����]����, ���[����]
	//P.108
	//��� : if (������) (����Ǽ��� ���拚), switch(����������)(�ӵ�������) // ��ǻ�͸� �ȶ��ϰ� ������ִ°�
		// ���� : ����Ǽ� ������ �ڵ� ó��
		//��) �л����� 1000���ְ� �ݶ� �ɺθ�
					//.����Ǽ�
				//1. ���� ����� ������ => �ݶ�x =>����������
				//2. ���� ����� ������ => �ݶ� 1200
				//3. ���� �ؼ� ���� ����� ������ => �ݶ� ����
	// if (a������===�ݶ�&&�ݶ󰡰� <==1000){}
	//		else if (��2) {}
	//		else if (��3) {}
	//		else if (��4) {}
	//		else if (��5) {}
	//		else
	
				//��) ���������� : ����ġ ��ư [if(���࿡ ��� ��ư�� ��������)]
					//���� ����� ������ �����´�
	//if : true , false ������� (�� )
	
	public static void main(String[] args) {
		
		// ��1) true �̸� ���๮ ����
				//����1 : if (��) true ���๮
				//����2 : if (��) true ���๮
				// else false ���๮
				// ����3 : if(��){���๮; ���๮;}
							//els{���๮; ���๮;}
				//����4 if (��){}
				//		else if (��2) {}
				//		else if (��3) {}
				//		else if (��4) {}
				//		else if (��5) {}
				//		else
			if (3>5) System.out.println("3�� 1���� ũ��");			
			//�� 2) false �̸� ���� x
			if (3>5) System.out.println("3�� 5���� ũ��");		
			//��3) true false �̸� ���๮ ����
			if (3>5) System.out.println("3�� 5���� ũ��");		
			else System.out.println("3�� 5���� �۴�");
			
			//��4{}�� ���Ǵ� ��� => ���๮ 2�� �̻��ϋ�
			if (3>2) {
				System.out.println("true�̸� ����Ǵ��ڸ�");		
			System.out.println("3��2���� ũ��");	
			}else {
				System.out.println("false�̸� ����Ǵ��ڸ�");
			    System.out.println("3�� 2���� �۴�");	
			}
		
		//��) ����� ����Ǽ��� ���� ���� (��� �� �ϳ� ������)
			if (3>5) System.out.println("��)5 3�� 5���� ũ��");
			else if(3>4) System.out.println("��)5 3�� 4 ���� ũ��");
			else if(3>3) System.out.println("��)5 3�� 3 ���� ũ��");
			else if(3>2) System.out.println("��)5 3�� 2 ���� ũ��");
			else  System.out.println("true�� ����");
			
			//2 �ϳ��� ���ǿ� �پ��� ����� �̾Ƴ��� �� ����
			if (3>5) System.out.println("��)5 3�� 5���� ũ��");
			 if(3>4) System.out.println("��)5 3�� 4 ���� ũ��");
			 if(3>3) System.out.println("��)5 3�� 3 ���� ũ��");
			 if(3>2) System.out.println("��)5 3�� 2 ���� ũ��");
			else  System.out.println("true�� ����");
			
			 
			 
			 //p.112
			 int score3 = 75;
			 if (score3>=90) {System.out.println("������ 100~90 �Դϴ�");System.out.println("����� A �Դϴ�");	
			}
			 else if (score3 >=80) {System.out.println("������ 80~89 �Դϴ�");System.out.println("����� B �Դϴ�");}
				
		
			 else if (score3 >=70) {System.out.println("������ 70~79 �Դϴ�");System.out.println("����� C �Դϴ�");}
				
				
				 
			 
	
	
	
	
	
	
	}
	
	
	
	
}
