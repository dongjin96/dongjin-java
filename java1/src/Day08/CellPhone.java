package Day08;

public class CellPhone {
// �ʵ�
	String model;
	String color;
	//������
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;}
	
	//�޼ҵ�[���������� (����=>default)]��ȯŸ�� �޼ҵ�(�μ�1,�μ�2�μ�3){�����ڵ�}
	void powerOn() {System.out.println("������ �մϴ�");}
		//void : ��ȯ�� ���� [return ����]
	void powerOff() {System.out.println("������ ���ϴ�");}
	void bell() {System.out.println("���� �︳�ϴ�");}
								//�ܺ�
	
	void sendVoice(String message) {//�ܺη� ���� ������ ����[�μ�]
		System.out.println("���� :"+message);
		}
	
	void receiveVoice(String message) {System.out.println("���� :"+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�");}
	
	
	
	
	
	
	

}
