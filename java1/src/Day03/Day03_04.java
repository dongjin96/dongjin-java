package Day03;

import java.util.Scanner;

public class Day03_04 {
	
	
	
	
	
	// 반복문 : for , while
	  //. 1. for  : 어디부터 어디까지 어떻게 증가하는 지 반복실행
	      //. for (초기값; 조건문; 증감식) {실행문;}
			// for (어디서부터, 어디까지, 어떻게 증가) {실핼문;}
	public static void main(String[] args) {
	
		//P.121예
		//1부터 10까지 1씩 증가하면서 반복 출력
		for (int i = 1; i <= 10; i++) {
			//1. 조건값 : 반복변수의 시작값 i는 1부터
			//2. 조건문 : 변복 변수의 논리제어 [true 실행 아니면 실행x]
			//3. 증감식 : 변복변수의 증감단위
			System.out.print(i+" ");
			
			//i= 1일때 i<=10 미만 반복실행o
			//[증감식] i = 2 일때 i<=10 true 반복실행o
			//[증감식] i = 3 일때 i<=10 true 반복실행o
			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
			//[증감식] i = 11 일때 i<=10 true false 반복실행x
		}												
		
		//예2 1부터 50까지
		for (int i = 1; i <=50; i++) {System.out.print(i+" "); }
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 1; i < 50; i+=3) {System.out.print(i+" ");}
		
		
		//1부터 100까지 의 합을 출력하기
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");
	    int 누적합계 = 0;
		for (int i = 1; i <= 100; i++) {누적합계 +=i;}
		//누적합계 +=i //누적합계+i
		System.out.println("1부터 100까지 누적합계 : " + 누적합계);
		
	
		//예 구구단 2단 124P
			//단수: 2[상수]   곱 1~9[변수]
				//단수 2~15 [변수] 곱 : 1~9[변수]
					// 하나의 단 마다 곱으 ㄴ9번실행
		//구구단 
		int 실행횃수 = 0;
		for (int 단 = 1; 단 <=15 ; 단++) {System.out.println(단 + "단");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int 곱 = 1; 곱 < 9; 곱++) {System.out.printf( "%d X %d = %d \n" , 단 , 곱 , 단*곱 );
			실행횃수++;
		}
			
		}
		
	 

	}
}
