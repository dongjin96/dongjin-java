package Day08;

public class DmbCellPhone extends CellPhone{
								//extents : �����ϴ� // ��� 1�� ������ xx
	// �P���� �⺻��� => cell phone ���
	//1�ʵ�
	
	int channel;


	//2.������
	 public DmbCellPhone(String model, String color, int channel) {
	 /*this : ����Ŭ������ ���
	 this.model= model; //�θ� Ŭ������ ��� ���
	 this.color =color; // �θ� Ŭ������ ��� ���
	 this .channel= channel;// ���� Ŭ���� ��� ���
	 }*/
		 
		 //�θ�Ŭ������ ������ ������ => super()Ű���带 �̿��� �θ�Ŭ���� ������ ȣ��
		 super(model,color);//super() : �θ�Ŭ������ ������ ȣ��
		 this.channel = channel;
	 }
		 
		 //3.�޼ҵ�
	void turnonDmb() {
		System.out.println("ä�� :"+channel + "�� DMB ��� ������ �����մϴ�");
	}
	void changeChannelDmb(int channl) {this.channel=channl;}
	// this.channel : �Ķ��� => ����Ŭ������ ���
	// channel : ������ => �޼ҵ忡 �ܺηκ��� ���� ����(�μ�)
	private void syso("ä��: "+channl+"������ �ٲߴϴ�";) {
		

	}
	
	void turnoffDmb() {System.out.println("DMB��� ������ ����ϴ�");}
	
	//�������̵�[�θ�Ŭ������ �޼ҵ� ������ ]: �ڵ��ϼ�

	@override // ������ =>�ڵ庯�� //@: ������̼�
	void powerOn() {
	//super.powerOn(); //�θ�޼ҵ� ȣ��
			System.out.println("@�����޼ҵ带 �մϴ�");}
}
	}
