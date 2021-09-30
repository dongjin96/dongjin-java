package Day03;

public class Day03_01 {
	// 컴퓨터 [0.1] : 기계어
	//1. 컴퓨터[java] 출력/입력
	//2. 메모리[변수]저장, 계산[연산]
	//P.108
	//제어문 : if (논리제어) (경우의수가 생길떄), switch(데이터제어)(속도가빠름) // 컴퓨터를 똑똑하게 만들어주는것
		// 목적 : 경우의수 에따른 코드 처리
		//예) 학생에게 1000원주고 콜라 심부름
					//.경우의수
				//1. 가장 가까운 편의점 => 콜라x =>다음편의점
				//2. 다음 가까운 편의점 => 콜라 1200
				//3. 제어 해서 다음 가까운 편의점 => 콜라 구매
	// if (a편의점===콜라&&콜라가격 <==1000){}
	//		else if (논리2) {}
	//		else if (논리3) {}
	//		else if (논리4) {}
	//		else if (논리5) {}
	//		else
	
				//예) 엘레베이터 : 스우치 버튼 [if(만약에 상승 버튼을 눌렸을지)]
					//가장 가까운 엘베가 내려온다
	//if : true , false 만제어가능 (논리 )
	
	public static void main(String[] args) {
		
		// 예1) true 이면 실행문 실행
				//형태1 : if (논리) true 실행문
				//형태2 : if (논리) true 실행문
				// else false 실행문
				// 형태3 : if(논리){실행문; 실행문;}
							//els{실행문; 실행문;}
				//형태4 if (논리){}
				//		else if (논리2) {}
				//		else if (논리3) {}
				//		else if (논리4) {}
				//		else if (논리5) {}
				//		else
			if (3>5) System.out.println("3이 1보다 크다");			
			//예 2) false 이면 실행 x
			if (3>5) System.out.println("3이 5보다 크다");		
			//예3) true false 이면 실행문 실행
			if (3>5) System.out.println("3이 5보다 크다");		
			else System.out.println("3이 5보다 작다");
			
			//예4{}가 사용되는 경우 => 실행문 2개 이상일떄
			if (3>2) {
				System.out.println("true이면 실행되는자리");		
			System.out.println("3이2보다 크다");	
			}else {
				System.out.println("false이면 실행되는자리");
			    System.out.println("3이 2보다 작다");	
			}
		
		//예) 당양한 경우의수의 따른 제어 (결과 물 하나 뽑을떄)
			if (3>5) System.out.println("예)5 3이 5보다 크다");
			else if(3>4) System.out.println("예)5 3이 4 보다 크다");
			else if(3>3) System.out.println("예)5 3이 3 보다 크다");
			else if(3>2) System.out.println("예)5 3이 2 보다 크다");
			else  System.out.println("true가 없다");
			
			//2 하나의 조건에 다양한 결과를 뽑아낼떄 는 이프
			if (3>5) System.out.println("예)5 3이 5보다 크다");
			 if(3>4) System.out.println("예)5 3이 4 보다 크다");
			 if(3>3) System.out.println("예)5 3이 3 보다 크다");
			 if(3>2) System.out.println("예)5 3이 2 보다 크다");
			else  System.out.println("true가 없다");
			
			 
			 
			 //p.112
			 int score3 = 75;
			 if (score3>=90) {System.out.println("점수가 100~90 입니다");System.out.println("등급은 A 입니다");	
			}
			 else if (score3 >=80) {System.out.println("점수가 80~89 입니다");System.out.println("등급은 B 입니다");}
				
		
			 else if (score3 >=70) {System.out.println("점수가 70~79 입니다");System.out.println("등급은 C 입니다");}
				
				
				 
			 
	
	
	
	
	
	
	}
	
	
	
	
}
