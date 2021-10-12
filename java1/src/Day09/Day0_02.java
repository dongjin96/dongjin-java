package Day09;

public class Day0_02 {
	
	public static void main(String[] args) {
		//1. 자동차 객체 생성
		Car car =new Car();
		
		//2. 자동차 5번 전진
		for(int i=1 ; i<=5 ; i++) {
			int problemLocation= car.run();
			// car 회전 메소드 호출해서 반환을 변수에 저장
			
			switch( probleLocation ) {
			case 1 :
					System.out.println("앞왼쪽 HankookTire 로 교체");
					car. frontLeftTire = new HankookTire(15,"앞왼쪽");
				 break;
			case 2 :
				System.out.println("앞왼쪽 HankookTire 로 교체");
				car. frontRightTire = new HankookTire(15,"앞오른쪽");
			 break;
			case 3 :
				System.out.println("앞왼쪽 HankookTire 로 교체");
				car. backLeftTire = new HankookTire(15,"뒤왼쪽");
			 break;
			case 4 :
				System.out.println("앞왼쪽 HankookTire 로 교체");
				car. backLeftTire = new HankookTire(15,"뒤오른쪽");
			 break;
		
			
			
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
