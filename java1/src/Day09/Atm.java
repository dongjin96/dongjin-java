package Day09;

public interface Atm {

		//1. 상수 필드
		//2. 추상 메소드
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();
	// 3. 디폴트 메솓
	default void 실행 () {
		System.out.println();
	}
	
	
	
	
	
	
		//3. 디폴트 메소드
	    //4. 정적 메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
