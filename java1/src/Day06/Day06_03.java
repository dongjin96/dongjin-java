package Day06;

public class Day06_03 {
public static void main(String[] args) {
	
	
	
	
			//��ü ����� [������ ���� ������ ������� �������]
		Calculator calculator = new Calculator();
		//��ü�� ���� �޼ҵ� ȣ��
	calculator.powerOn();
	
	
	int result1 = calculator.plus(5, 6);
	System.out.println("�Լ� �����:" + result1);
	
	
	
	//P .223
	Car4 car4 = new Car4();// ��ü
	car4 = new car4();//�ν��Ͻ�ȭ
			//1. ��ü�� �ʵ忡 ���� �ʱ�ȭ�Ҽ� �ִ¹��
			//.2. new Ŭ������ (10)
			//3. ��ü�� set �޼ҵ� (10)
			
			car4.setGas(5); // setGas �޼ҵ� ȣ��[�μ��� 5 �ֱ�]
			boolean gasstate= car4.isLeftGas();
			if(gasstate) {
				System.out.println("���");
				car4.run();
				
			}
			if (car4.isLeftGas()) {
				System.out.println("gas  ������ �ʿ䰡 �ֽ��ϴ�");
			}else {
				System.out.println("gas �� �������ּ���");
				
			}
			
	
	
	
}
	
	
	
	
	
	
	
	
	
}
