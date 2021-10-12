package Day08;

public class DmbCellPhone extends CellPhone{
								//extents : 연장하다 // 상속 1개 여러개 xx
	// 핻드폰 기본기능 => cell phone 상속
	//1필드
	
	int channel;


	//2.생성자
	 public DmbCellPhone(String model, String color, int channel) {
	 /*this : 현재클래스내 멤버
	 this.model= model; //부모 클래스내 멤버 사용
	 this.color =color; // 부모 클래스내 멤버 사용
	 this .channel= channel;// 본인 클래스 멤버 사용
	 }*/
		 
		 //부모클래스가 생성자 있을떄 => super()키워드를 이용한 부모클래스 생성자 호출
		 super(model,color);//super() : 부모클래스내 생성자 호출
		 this.channel = channel;
	 }
		 
		 //3.메소드
	void turnonDmb() {
		System.out.println("채널 :"+channel + "번 DMB 방송 수신을 시작합니다");
	}
	void changeChannelDmb(int channl) {this.channel=channl;}
	// this.channel : 파랑색 => 현재클래스내 멤버
	// channel : 빨강색 => 메소드에 외부로부터 들어온 변수(인수)
	private void syso("채널: "+channl+"번으로 바꿉니다";) {
		

	}
	
	void turnoffDmb() {System.out.println("DMB방송 수신을 멈춥니다");}
	
	//오버라이딩[부모클래스내 메소드 재정의 ]: 자동완성

	@override // 재정의 =>코드변경 //@: 어노테이션
	void powerOn() {
	//super.powerOn(); //부모메소드 호출
			System.out.println("@전원메소드를 켭니다");}
}
	}
