package Day09;

public class Day0_02 {
	
	public static void main(String[] args) {
		//1. �ڵ��� ��ü ����
		Car car =new Car();
		
		//2. �ڵ��� 5�� ����
		for(int i=1 ; i<=5 ; i++) {
			int problemLocation= car.run();
			// car ȸ�� �޼ҵ� ȣ���ؼ� ��ȯ�� ������ ����
			
			switch( probleLocation ) {
			case 1 :
					System.out.println("�տ��� HankookTire �� ��ü");
					car. frontLeftTire = new HankookTire(15,"�տ���");
				 break;
			case 2 :
				System.out.println("�տ��� HankookTire �� ��ü");
				car. frontRightTire = new HankookTire(15,"�տ�����");
			 break;
			case 3 :
				System.out.println("�տ��� HankookTire �� ��ü");
				car. backLeftTire = new HankookTire(15,"�ڿ���");
			 break;
			case 4 :
				System.out.println("�տ��� HankookTire �� ��ü");
				car. backLeftTire = new HankookTire(15,"�ڿ�����");
			 break;
		
			
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
