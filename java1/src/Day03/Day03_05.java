package Day03;

import java.util.Scanner;




public class Day03_05 {
	
	
	
	public static void main(String[] args) {
		
	Readable[] string;
	Scanner scanner = new Scanner(System.in );
	//반복으로 별모양 찍기
		// 문제 1) 입력받은 정수만큼 별 출력찍기 // s :입력한수
	System.out.println("문제1)별 개수 :"); int s = scanner. nextInt();
	for (int i = 1; i <=s ; i++) {System.out.print("*");}
	
	System.out.println("\n ----------------------------");
	
	// 문제2) 입력받은 정수만큼 별출력 // 5개마다(5배수) 줄바꿈
		
		System.out.println("문제 2) 별 개수"); int s2 =scanner.nextInt();
		for (int i = 1; i <=s; i++) {System.out.print(" * ");
		if(i%5==0)System.out.println();
			
		}
		System.out.println("\n ----------------------------");
		// 문제 3 입력받은 줄만큼 별출력
		
	
		System.out.println("문제 3) 줄 수"); int line =scanner.nextInt();
		
		//i 는 1부터 입력받은 줄수 (line)까지 1씩 증가하면서 내려감
		for (int i = 1; i <= line ; i++) {
			//줄바꿈 하기전에 별찍기
			for (int s1 = 1; s1 <=i; s1++) {System.out.print("*");}
				System.out.println();}
	
		//.문제 4
		System.out.println("\n ----------------------------");
		System.out.println("문제 4) 줄 수"); int line4 =scanner.nextInt();
		for( int i = 1 ; i<=line4 ; i++ ) {
		//별찍기
		for (int s1= 1; s1<= line4-i+1 ; s1++) {System.out.print("*");}
		System.out.println();
		}
		
		//.문제 4
		System.out.println("\n ----------------------------");
		System.out.println("문제 4) 줄 수"); int line5 = scanner.nextInt();
		
		for( int i = 1 ; i<=line5 ; i++ ) {
			// 공백찍기
			for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" ");}
			// 별찍기
			for( int s1 = 1 ; s1<=i ; s1++ ) {System.out.print("*");}
			// 줄바꿈
			System.out.println();}
		
		System.out.println("\n ----------------------------");	
		System.out.println("문제6) 줄 수 :"); scanner.next();
		for (int i =1 ; i<=line6; i++) {
			//공백찍기
			for(int b =1 ;)
		}
			
}
	
}
