package Day09;

public class Day09_04 {
		
	
	//�������̽� : ��ü�� ������� �����ϴ� Ÿ�� /// �������̽� �ϳ������� �ƹ��͵����� 
	//���� : Ŭ�������� �����ؾ��ϴ� ������ �����ϴµ� ���Ǵ� �߻��ڷ� // ������ �����Ͽ� ���δٸ� Ŭ�������� �����ϱ����ؼ� 
	
	//�߻� :
	//�� : ������
		// �������̽� = [��ư] �̵���ư, ���ݹ�ư, ����ư
		// Ŭ����[���ӵ�] = �������,��ɰ���,RPG����
			// ������ �����Ͽ� �����̴µ� ���δٸ� Ŭ�������� ������
			
				// implements : �����ϴ�
					// �߻�޼ҵ� : ���� �ִ� �޼ҵ� => ����� Ŭ���� ������ ����
					// �߻� �޼ҵ� ����
				// �������̽� ���
			//1. �������̽� �������̽��� =  new Ŭ����()
					// �������̽� = (Ŭ����)��ü
					//2. �͸� ���� ��ü
						// �������̽� �������̽��� = new �������̽��� (){�߻�޼ҵ� �������̵�}
	// extends : ����x [ ����� �ѹ��� ����]
	// implements :����o [������ ������ ����]
	public static void main(String[] args) {
		
		//P.347~354
			//1. �������̽� ���� : Remote control
			//2. Ŭ���� ���� : Television implements RemoteControl
			//3. Ŭ���� ���� : Audio Implements RemoteControl
	
	
	
	
			//1. ������ ���� [�޸� �Ҵ�x]
					RemoteControl rc;
					//2. �������� �ڷ����� Ŭ���� ����
					rc= new Television(); // �ش� �������� �ڷ��������� ���
					// �ڷ����� ������ ���
					rc.turnON();
					rc.turnOFF();
					rc.setVolume(5);
					//3. �ڷ����� �������� ����� ������ ����
					System.out.println("�������� ������������� �����մϴ�!");
					
					rc=new Audio();
					//����� ������ ���
					rc.turnON();
					rc.turnOFF();
					rc.setVolume(15);
					//P360
					rc.setMute(true);// ����Ʈ �޼ҵ�
					//P362
					RemoteControl.changeBattery();// ���� �޼ҵ�� ��ü ����
					
					//P.355 : �͸� ���� ��ü : ��ȸ�� �ڵ�
					
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
