package Day09;

public class Tire {

	//314P/ 필드
	 public int maxRotation; // 최대 회전수 [타이어 수명]
	 public int accumulatedRotation;//누적 회전수
	 public String location;
	// 생성자
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	 
	 
	 
	 
	
	//메소드
	public boolean roll() {//타이어 회전 메소드
		++accumulatedRotation ;//누적회전수 증가
		if(accumulatedRotation< maxRotation) {//최대회전수 더크면
			System.out.println(location+"Tire 수명 :"+(maxRotation-accumulatedRotation)+"회");//남은수명 출력
		return true;}//true 수명이 남음을 표시하는반환
	else { System.out.println("***"+location+"Tire 펑크***");
	       return false; // false 수명이 없음을 표시하는 반환
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
