package Day_05;

import java.util.Scanner;

public class Day05_03 {
// P. 181 확인문제
	//1.2
	//힙 : 변수내 실제 값
	//스택 : 변수이름 저장
	//3. == != 객체 주소값 비교 [객체 내용물 비교x]
			//.equals [객체 내용물 비교 o]
	
	//2. 3
	     //1. 프로그램 종류시 동시에 끝나면 메모리 초기화 
		//3. 참조되지 않는 객체는 자동 소멸
	
	
	//3.2[문자열 동일해도 객체가 다를수도있기 떄문]
	
	//4.2 int[] array ={1,2,3}]
	
	//5. 3 [boolean 타입 배열의 초기값은 false]
	// 정수 =0, 실수=0,0 , 논리 =false , 문자열[객체]= null
	//7.
	/*
	 * for (int i = 0 ; i<arry.length; i++){ // i는 인덱스 0부터 4까지 1씩증가하면서 반복
	 * 
	 * 				if(array [i]> max)max=array[i // i번째 인덱스 값이 max 보다 크면 max에 i 번쨰 인덱스 값]
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	//8.[배열내  모든 인덱스에 접근하기 위해서 for 활용]
	/* int count = 0 ; // 정수 개수
	 * // 행 반복
	 * for(int i=0; i<array.length;i++){
	 * 열반복
	 * for (int j =0. ; j<array[j].length ; j++){
	 * 해당 인덱스 값 가져와서 sum 누적합계 더하기
	 * sum+= array[i][j];
	 * }
	 * count += array[i].length ; //2+3+5}
	 * avg = (double)sum / count;
	 * 
	 * 
	 */
	public static void main(String[] args) {//ms
		Scanner scanner = new Scanner(System.in);
		boolean run = true; // while 무한 루프 제어 변수
		int studentNum =0;
		int[] scores =null;
		
		
		
		while(run) {//무한루프 [5번 입력하면 무한루프 종류]}
			System.out.println("---------------------------------------");
			System.out.println("1.학생수|2.점수입력|3점수리스트|4.분석|5.종류");
			System.out.println("---------------------------------------");
			System.out.println("선택 :");
			
			int selctNo =scanner.nextInt();
			if(selctNo==1) {
				System.out.println("학생수 :"); studentNum = scanner.nextInt();
				scores = new int[studentNum]; // 입력받은 정수만큼 배열길이 할당
			}
			else if(selctNo==2) {
				//배열내 할당된 모든 인덱스에 값넣기=> for
				for(int i =0 ; i<selctNo ; i++) {
					System.out.println("scores["+i+"]");
					scores[i]=scanner.nextInt(); // 입력받은 값을 i 번에 저장
				}
			}
			else if(selctNo==3) {
				for(int i = 0; i, studentNum; i++) {System.out.println("scores["+i+""]");
			}
			else if(selctNo==4) {int max =0; int sum=0, double avg=0.0;
			for(int i =0; i< studentNum ; i++) {
				if(scores[i]>max)max=scores[i]
						sum+=scores[i]
			}
				} 
			}
			else if(selctNo==5) {
				run =false;
				
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}//me
	
	/*int 학생수 =0;
	int 학생점수=0;
	Scanner scanner = new Scanner(System.in);
	while(true) {
	System.out.println("1.학생수 : 2.학생점수 : 3. 점수리스트 4.분석 5.종류");
	System.out.print("선택 :");
	
	int 플레이어 = scanner.nextInt();
	
	if(플레이어==1)
	{ System.out.println("학생수" +학생수);}
	else if (플레이어 ==2) {System.out.println("학생점수"+학생점수);
		
	}
	else if (플레이어 ==3) {System.out.println("점수리스트");}
	else if (플레이어 ==4) {System.out.println("분석");}
	else if(플레이어==5)
	{System.out.println("[종류]");}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//w e
}

private static void else if (플레이어 ==2) {
		
	}(boolean b) {
// TODO Auto-generated method stub
*/
	
	
	
	
	
	
	
}
