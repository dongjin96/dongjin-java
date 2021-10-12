package Day09;

public class Car {

	//필드[변수, 배열, 객체 등]
	Tire frontLeftTire = new Tire(6,"앞왼쪽");
	Tire frontRightTire = new Tire(2,"앞오른쪽");
	Tire backLeftTire = new Tire(3,"뒤왼쪽");
	Tire backRightTire = new Tire(4,"뒤오른쪽");
	//생성자
	
	
	//메소드
	int run() {}
	//접근 제한자 생략시 => 기본값: default
	
	if (frontLeftTire.roll()==false) {stop(); return 1;}
	if (frontRightTire.roll()==false) {stop(); return 1;}
	if (backLeftTire.roll()==false) {stop(); return 1;}
	if (backRightTire.roll()==false) {stop(); return 1;}
	return 0;
	
	
	
	
	
}
