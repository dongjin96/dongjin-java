package Day06;

public class Car4 {

	
		//1. �ʵ�
	int gas;
	//2. ������
	
	//3.�޼ҵ�
	void setGas (int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
	if(gas==0) {
		System.out.println("gas �� �����ϴ�");
		return false;
	}
	System.out.println("������ �ֽ��ϴ�");
	return true;}
	
	void run () {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�(gas�ܷ� : )"+gas);
				gas-=1;
			}else {System.out.println("����ϴ� (gas�ܷ� :)"+gas );
			return;
			}
		}
	
	
}//�޼ҵ� �����ε� : �޼������ �����Ұ�� �μ� ����[Ÿ��,����]
	
	//���� Ŭ���� ȣ��
	void start() {
		run();
	}
}

