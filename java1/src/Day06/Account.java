package Day06;

public class Account {

	

		//1.객체 만들기[private : 필드 보호를 위한 접근자]
			// 현재 클래스 내에서만 사용가능
				// 외부로부터 접근불가[간접접근 : get , set메소]
	private	String ano; //계좌번호
	private	String owner; //계좌주
	private	int balance;	// 계좌 예금액
	
	//2. 생성자
		// 자동 완성 : 마우스 오쪽클릭
		public Account(String ano, String owner, String balance2) {
			super();
			this.ano = ano;
			this.owner = owner;
			this.balance = balance2;
		}
	//3. 메소드
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

