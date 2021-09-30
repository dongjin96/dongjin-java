package Day03;

import javax.swing.event.SwingPropertyChangeSupport;

import com.sun.java_cup.internal.runtime.Scanner;

public class Day03_03 {

	//if(논리제어) swich (데이터 제어)
	   // 경우의수가 정해져 있는경우  => switch [속도가 빠름]
	// 경우의수가 정해져 있지 않는 경우 => if[논리]
	 /* 형태 : switch(key : 검사대상){
					case 검사 : 실행문;
					case 검사 : 실행문;
					case 검사 : 실행문;	
					default : 실행문;
					
	*/
	//예 )
	// break : switch 혹은 반복문을 탈출시 사용되는 키워드 (가장 가까운 중괄호 탈출)
	public static void main(String[] args) {
		
		int 점수 = 80; 
		switch (점수) {//점수는 검사
		case  90 : System.out.println("A등급 입니다");break;
		case  80 : System.out.println("B등급 입니다");break;
		case  70 : System.out.println("C등급 입니다");break;

		default: System.out.println("탈락입니다");
			
		
		
		
	//P.118 char switch 문
		String position = "과장";
		switch (position) {
		case "부장":
			
			break;

		default:
			break;
		};
	// 국어 영어 수학 점수를 를 입력받아 평균이 90점 이상이면 "A" 80점이상이면 "B" 나머지는 탈락
	
	Scanner 입력객체 = new Scanner(System.in);
	
		}
	
	
	
	
	
	
	
	
	
	}	
}
