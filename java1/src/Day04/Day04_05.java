package Day04;

import java.util.Scanner;

import sun.security.util.Length;

public class Day04_05 {

	// 배열을 이용한 점수관리 프로그램
		//1. 학생수를 입력받아 학생수만큼 배열의 길이 할당
		//2. 메뉴 [1. 학생수2.점수입력3.분석[등수,평균]4.종류]
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			int[]학생점수목록 = null;//배열선연후 공백넣기
			while(true) {
				
				System.out.println("1. 학생수 2.점수입력3.분석 4.종류");
				System.out.println("선택: "); int ch = scanner.nextInt();
				if(ch==1)
					System.out.print("학생수 입력[배열길이] : "); int size = scanner.nextInt();
				//배열에 메모리 할당
					
					학생점수목록=new int[size]; //입력받은 수 만큼 메모리 할당
					System.out.println(size+"만큼 학생 목록 생성");
			
					if(ch==2) { // 학생 수만큼 점수 입력 받기 [배열명 .length : 배열의길이]
						for(int i = 0 ; i<학생점수목록.length ; i++) {
					학생점수목록[i]= scanner.nextInt();}
					}
					if(ch==3) {
						//1. 내림차순
						for(int i = 0 ; i< 학생 점수목록 length ; i++) {
							for{int j = i+1; j<학생점수목록[j])} //스왑 교체}
						}
					
					
					}
					if(ch==4) break;
			
			
			//2. 클래스 이용한 정렬 [배열 관련 클래스 = Arrays]
			
			
			
			}	
		}
}
