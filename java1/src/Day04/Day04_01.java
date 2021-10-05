package Day04;


public class Day04_01 {public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System. in);
// 무한루프=> while 이용 한 무한반복 와일 값에 트루를 넣으면 무한반복이된다
	// 키보드를 이용한 루프제어
	//무한루프 종류방법 : 1. 조건을 false 2. break
while(true) {System.out.println("무한루프");
	int 선택 = scanner.nextInt();
	if(선택 == 4) break;
}
// 랜덤 [난수] 생성
// 1. 랜덤 클래스 // 2. math  클래스 
 // random 객체
			 // .next() : int 형 표현 할수 단위만큼 난수 생성
			 // random.nextInt(숫자) 0~ 숫자전까지 난수
			 //. random.nextInt(10)+초기값 <- 초기값에 일넣으면 일부터나옴 (그숫자만큼나옴)

 Random random = new Random();
 System.out.println( random.nextInt(10)+1);
 
 // 가위바위보
 		//1. 사용자로부터 가위 바위 보 중 하나를 입력받기
 		//2. 컴퓨터는 랜덤으로 가위 바위 보 중 하나 선택
 	    //3. 승리한 플레이어 호출
 		//+ : 만약 종류를 입력하면 게임종류
 		//+ : 게임종류시 게임수와 최종승리 [가장많이 이긴 플레이어]






}

	
}
