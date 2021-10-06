package Day06;

public class Day06_03 {
public static void main(String[] args) {
	
	
	
	
			//객체 만들기 [생성자 정의 선언이 없을경우 빈생성자]
		Calculator calculator = new Calculator();
		//객체를 통한 메소드 호출
	calculator.powerOn();
	
	
	int result1 = calculator.plus(5, 6);
	System.out.println("함수 결과물:" + result1);
	
	
	
	//P .223
	Car4 car4 = new Car4();// 객체
	car4 = new car4();//인스턴스화
			//1. 객체내 필드에 값을 초기화할수 있는방법
			//.2. new 클레스명 (10)
			//3. 객체명 set 메소드 (10)
			
			car4.setGas(5); // setGas 메소드 호출[인수로 5 넣기]
			boolean gasstate= car4.isLeftGas();
			if(gasstate) {
				System.out.println("출발");
				car4.run();
				
			}
			if (car4.isLeftGas()) {
				System.out.println("gas  주입할 필요가 있습니다");
			}else {
				System.out.println("gas 를 주입해주세요");
				
			}
			
	
	
	
}
	
	
	
	
	
	
	
	
	
}
