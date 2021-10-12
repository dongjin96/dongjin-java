package Day09;

public class Day09_04 {
		
	
	//인터페이스 : 객체의 사용방법을 정의하는 타입 /// 인터페이스 하나가지곤 아무것도못함 
	//목적 : 클래스들의 구현해야하는 동작을 지정하는데 사용되는 추상자료 // 동일한 목적하에 서로다른 클래스들을 조작하기위해서 
	
	//추상 :
	//예 : 오락기
		// 인터페이스 = [버튼] 이동버튼, 공격버튼, 방어버튼
		// 클래스[게임들] = 비행게임,사냥게임,RPG게임
			// 동일한 목적하에 움직이는데 서로다른 클래스들을 조작함
			
				// implements : 구현하다
					// 추상메소드 : 선언만 있는 메소드 => 연결된 클래스 내에서 구현
					// 추상 메소드 구현
				// 인터페이스 사용
			//1. 인터페이스 인터페이스명 =  new 클래스()
					// 인터페이스 = (클래스)객체
					//2. 익명 구현 객체
						// 인터페이스 인터페이스명 = new 인터페이스명 (){추상메소드 오버라이딩}
	// extends : 다중x [ 상속은 한번만 가능]
	// implements :다중o [구현은 여러번 가능]
	public static void main(String[] args) {
		
		//P.347~354
			//1. 인터페이스 설꼐 : Remote control
			//2. 클래스 설계 : Television implements RemoteControl
			//3. 클래스 설계 : Audio Implements RemoteControl
	
	
	
	
			//1. 리모컨 생성 [메모리 할당x]
					RemoteControl rc;
					//2. 리모컨에 텔레비전 클래스 연결
					rc= new Television(); // 해당 리모컨은 텔레비전으로 사용
					// 텔레비전 리모컨 사용
					rc.turnON();
					rc.turnOFF();
					rc.setVolume(5);
					//3. 텔레비전 리모컨을 오디오 리모컨 변경
					System.out.println("리모컨을 오디오전용으로 변경합니다!");
					
					rc=new Audio();
					//오디오 리모컨 사용
					rc.turnON();
					rc.turnOFF();
					rc.setVolume(15);
					//P360
					rc.setMute(true);// 디폴트 메소드
					//P362
					RemoteControl.changeBattery();// 정적 메소드는 객체 없이
					
					//P.355 : 익명 구현 객체 : 일회성 코드
					
					RemoteControl rc2 = new RemoteControl() {
						
						@Override
						public void turnON() {
							
						}
						
						@Override
						public void turnOFF() {
													}
						
						@Override
						public void setVolume(int volume) {
							
						}
					};
					
					
					
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
