package Day09;

public class Audio implements RemoteControl {
				//���ø���Ʈ : Ŭ������ �������̽� ����

	//1.�ʵ�
	private int volume;
	private boolean mute;
	//2. ������
	
	//3.�޼ҵ�
	@Override
	public void turnON() {
	 System.out.println("Audio�� �մϴ�");
			
	}
	@Override
	public void turnOFF() {
		System.out.println("Audio ���ϴ�");
		
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
				System.out.println("Audio ���� ó���մϴ�");
			}else {
				System.out.println("Audio ���� �����մϴ�.");
			}
		}


}
