package Day09;

public class Tire {

	//314P/ �ʵ�
	 public int maxRotation; // �ִ� ȸ���� [Ÿ�̾� ����]
	 public int accumulatedRotation;//���� ȸ����
	 public String location;
	// ������
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	 
	 
	 
	 
	
	//�޼ҵ�
	public boolean roll() {//Ÿ�̾� ȸ�� �޼ҵ�
		++accumulatedRotation ;//����ȸ���� ����
		if(accumulatedRotation< maxRotation) {//�ִ�ȸ���� ��ũ��
			System.out.println(location+"Tire ���� :"+(maxRotation-accumulatedRotation)+"ȸ");//�������� ���
		return true;}//true ������ ������ ǥ���ϴ¹�ȯ
	else { System.out.println("***"+location+"Tire ��ũ***");
	       return false; // false ������ ������ ǥ���ϴ� ��ȯ
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
