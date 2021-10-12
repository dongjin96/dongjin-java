package Day09;

public class Audio implements RemoteControl {
				//임플리먼트 : 클래스에 인터페이스 연결

	//1.필드
	private int volume;
	private boolean mute;
	//2. 생성자
	
	//3.메소드
	@Override
	public void turnON() {
	 System.out.println("Audio를 켭니다");
			
	}
	@Override
	public void turnOFF() {
		System.out.println("Audio 끕니다");
		
	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
			
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
	}
		public void setmute(boolean mute) {
			this.mute=mute;
			if(mute) {
				System.out.println("Audio 무음 처리합니다");
			}else {
				System.out.println("Audio 무음 해제합니다.");
			}
		}


}
