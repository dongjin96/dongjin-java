package Day09;

public class HankookTire extends Tire{

	
	
	
	//�ʵ�
	
	//������
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	//�޼ҵ�
	//���� ���̵� : �޼ҵ� ������[�޼ҵ峻���� �ٲٱ�]
	@Override
	public boolean roll() {
		++accumulatedRotation ;//����ȸ���� ����
		if(accumulatedRotation< maxRotation) {//�ִ�ȸ���� ��ũ��
			System.out.println(location+"HankookTire ���� :"+(maxRotation-accumulatedRotation)+"ȸ");//�������� ���
		return true;}//true ������ ������ ǥ���ϴ¹�ȯ
	else { System.out.println("***"+location+"HankookTire ��ũ***");
	       return false; // false ������ ������ ǥ���ϴ� ��ȯ
	}
	
	
	}
	

}
