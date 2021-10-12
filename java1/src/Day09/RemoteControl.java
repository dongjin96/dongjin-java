package Day09;

public interface RemoteControl {
		// class : 클래스 선언시 사용되는 키워드
	// interface : 인터페이스 선언시 사용되는 키워드
	//1. 상수필드 [반드시 초기값존재] 초기값은 기본값이있다는것
	public int MAX_VOLUME=10;//최대소움
	public int MIN_VOLUME=0;//최소소음
	//2. 추상메소드[메소드 선언만 /실행코드는 정의x] : 중괄호가 없음~!
	public void turnON();
	public void turnOFF();
	public void setVolume(int volume);
	//3. 디폴트 메소드 [메소드 선언과 실행코드 정의o] : 중괄호 있음
	default void setMute(boolean mute) {
		if(mute) {System.out.println("무음처리합니다");}
	else {System.out.println("무음 헤제합니다.");}
	}
	//4. 정적메소드 [객체 선언없이 사용되는 메소드]
 static void changeBattery() {
	 System.out.println("건전지를 교환합니다.");
 }
	
	
	
	
	
	
	
	
}
