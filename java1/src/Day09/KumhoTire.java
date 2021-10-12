package Day09;

public class KumhoTire extends Tire {

	
	
	//필드
	
	//생성자
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	//메소드
	
	@Override
	public boolean roll() {
		++accumulatedRotation ;//누적회전수 증가
		if(accumulatedRotation< maxRotation) {//최대회전수 더크면
			System.out.println(location+"KumhoTire 수명 :"+(maxRotation-accumulatedRotation)+"회");//남은수명 출력
		return true;}//true 수명이 남음을 표시하는반환
	else { System.out.println("***"+location+"KumhoTire 펑크***");
	       return false; // false 수명이 없음을 표시하는 반환
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
