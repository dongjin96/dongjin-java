package Day06;




public class Day06_01 {

	
	public static void main(String[] args) {
		
		
		//P195
		//1. ��ü ����� : Ŭ���� �̿��� �޸� �Ҵ�
		Student student = new Student();
		//Ŭ������ ��ü�� = new ������ ();
					// Ŭ������ == �����ڸ�
				System.out.println("student ������ Student ��ü�� �����մϴ�");
				
				Student student2= new Student();
				System.out.println("student ������ �� �ٸ� Student ��ü�� �����մϴ�");
					// ����
					//0,1:2����
					//0~7:8����
					//0~9:10����
					//0~9: abcdef : 16����
				// P.201
				//1. �ڵ��� ��ü �����
				Car car =new Car();
				System.out.println("����ȸ�� :"+car .company);
				System.out.println("�𵨸� :"+car .model);
				System.out.println("���� :" + car .color);
				System.out.println("�ְ�ӵ� :"+car .speed);
				
				
				//3. ��ü�� �ɹ�[�ʵ�] �� ����
				System.out.println(">>>>>>>>>> �ӵ�����");
				car.speed =60;
				System.out.println("������ �ӵ� :"+car.speed);
				
		
		//P.205 : ������
				Car2 car2 = new Car2("����", 3000); // ������
				
				
				//207������ : ������ => �ʵ� �ʱ�ȭ
				Korean korean = new Korean("���ڹ�", "011225-1234567");
				System.out.println("korean1 name : "+ korean. name);
				System.out.println("korean1 ssn : "+ korean. ssn);
				
				Korean korean2 = new Korean("���ڹ�", "011225-1234567");
				System.out.println("korean2 name : "+ korean2. name);
				System.out.println("korean2 ssn : "+ korean2. ssn);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
