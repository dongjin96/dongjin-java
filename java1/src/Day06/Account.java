package Day06;

public class Account {

	

		//1.��ü �����[private : �ʵ� ��ȣ�� ���� ������]
			// ���� Ŭ���� �������� ��밡��
				// �ܺηκ��� ���ٺҰ�[�������� : get , set�޼�]
	private	String ano; //���¹�ȣ
	private	String owner; //������
	private	int balance;	// ���� ���ݾ�
	
	//2. ������
		// �ڵ� �ϼ� : ���콺 ����Ŭ��
		public Account(String ano, String owner, String balance2) {
			super();
			this.ano = ano;
			this.owner = owner;
			this.balance = balance2;
		}
	//3. �޼ҵ�
		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
	
	
	
	
	
	
	
	
}

