package Day03;

public class Day03_06 {

	
	public static void main(String[] args) {
		//for (초기값; 조건문 ; 증감식) {실행문}
		//while (조건문){
		//실행문 
		//증감식
		//}
		//P.125예1
		
		
		int i = 1;
		while(i<=10) {
			System.out.println(i+""); i++;
		}
		System.out.println("\n-------------------------");
		//for 차이
		for(int j = 1 ; j<=10 ; j++) {System.out.println(j+" ");
		
		
		//P.125 예2
		int sum = 0 ;
		int h = 1; //초기값
		while(h<=100) {sum+=h; h++;}
		System.out.println("1~100까지 누적합계 :"+sum);
		
		System.out.println("\n-------------------------");
		//for 차이
		int sum2 = 0;
		for (int K = 1 ; K<=100 ; K++) {sum2+=K;}
		System.out.println("1~100까지 누적합계 :" +sum2);
				
		
		
		
		
		//무한 루프 => while (true)
		while(true) {System.out.println("");}
		
		
		
		
		
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
