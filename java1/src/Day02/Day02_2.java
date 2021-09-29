package Day02;//c s

// 변수  : 하나의 값을 저장할수 있는 메모리 공간
   // 메모리[주기억장치=ram] : 현재 실행중인 프로 그램 기억
				//프로그램 <---프로세드 [스레드]<-----명령어[코드 ]집합
						//변수개수 증가---->용량증가--->속도감소
                 		// 변수 효율성 => 자료형
  				// 변수 선언
					//자료형 변수명 [임의]
					//int age;
				// 변수명 규칙
					//숫자로 시작 x //대소문자 구분 
				// 변수값 저장[ 오른쪽값이 왼쪽에 대입 : 대입 연산자 =]
					// int score; // 변수 선언
					// score = 90 : // 변수에 90 값 대입
  
					//변수는 선언된 블록 내에서만 가능가능하다 [괄호 안으로 이동가능// 괄호 밖으로는 이동 불가임~!]
public class Day02_2 {
	
	public static void main(String[] args) {
		//p.35 예
		 int vaㅣue = 10 ; // int형 자료의 value 변수명을 갖는 변수 선언과 동시에 10 대입	//인트라는 상자를 사서 벨류라는 10을 대입하는거
		 int result = vaㅣue + 10 ; //변수 +값 20
		 System.out.println("결과 : " + result);
		 
	
	
		 // p.38 자료형
		 	//자료형사용 목적 : 메모리의 효율성[적절한 사용]
		 	// 컴퓨터는 기계어 사용 [0.1] 단위 : bit =>0 또는 1
		 	// bit =>8bit =>1바이트 [01010101=>1바이트]
		    // byte => 1024byte=> 1kbyte
		 /*[논리]
		  *  boolean 1바이트 	true, false
		  * [문자]
		  * char	2바이트 	문자 [유니코드] 아스키는 1바이트 임
		  * [정수]
		  * byte 	1바이트 	+-127
		  * char 	2바이트 	문자
		  * short 	2바이트 	+-3만정도
		  * int 	4바이트 	+-20억정도
		  * long 	8바이트
		  * float	4바이트    //소수점 8자리 까지 표현가능
		  * double	8바이트	 //소수점 18자리 까지 표현이가능
		  * 
		  * 
		  */
		 
		 //p.40 byte[-128~ +127] 문자 넣으면 숫자로나옴
		 byte var1 = -128; System.out.println(var1);
		 byte var2 = -30;  System.out.println(var2);
		 byte var3 =  30;  System.out.println(var3);
		  //byte var4 =  128;  System.out.println(var4); //오류
		 
		 // p. 43: char [문자 1개= 한글자] 숫자를 넣으면 문자로나옴
		 char c1 = 'A'; 		System.out.println(c1);
		 char c2 =  65; 		System.out.println(c2);
		 char c3 = '\u0041'; 	System.out.println(c3);
		 
		 char c4 = '가'; 		System.out.println(c4);
		 char c5 = 44032; 		System.out.println(c5);
		 char c6 = '\uac00'; 	System.out.println(c6);
		//컴퓨터는[0.1] 어떻게 문자를 처리할까?
		 //아스키코드 :컴퓨터를 이용하여 무전하기위해서  [0.1]기계어를 영어로 바꾸는것 또 영어를 [기계어]로 바꾸는것 
		        //아스키코드 : 미국에서 만든거고 전세계에서 사용하기위해 만든게 //유니코드(다국어 가능 용량이많음)
		 		//유니코드[java] : 전세계 공용어가 다들어가있다
		 //P.44~45 : short [2바이트] , int[기본 정수 자료형/ 4바이트] 타입
		 short num1 = 30000; 	System.out.println( num1 );
		 
		 int num2 = 10; 		System.out.println(num2);
		 int num3 = 012; 		System.out.println(num3);//팔진수
		 int num4 = 0xA; 		System.out.println(num4);//16진수
		 	//진수 목적 : 컴퓨터가 표현할수 있는 단위 한계 해결
		 	// 2진수 [0,1] : 기계어
		 	// 8진수 [0~7] 						[0]을 넣으면 8진수
		 	//10 진수 [0~9] : 사람					
		 	//16 진수 [0~9A V CDEF] :다양한 표현단위  [0x]를 넣으면 16진수가됨
		
		 
		 // P.46 : Long[8바이트] : 20억이상
		 Long num5 = 2000000000L;     System.out.println(num5);
		 
		 // P.47~48 : float , double [*기본 실수 자료형 /8바이트]
		 	double val = 3.14; System.out.println( val );
		 	//float val2 = 3.14; System.out.println( va2 ); //이러면 안됨
		 	float val2 = 3.14f; System.out.println( val2 ); //앞에 f를 붙이면 가능함
		 	
		 double val3 = 0.123456789123456789; System.out.println( val3);
		 //소수점 18자리까지 표현가능하다
		 float val4 =  0.123456789123456789f;  System.out.println( val4);
		 
		 //boolean : 비트 [0(false).1(true)]
		 boolean bo1 = true; System.out.println(bo1);
		
		 
		 // P. 49 : 타입변환 가장큰상자 롱 그다음 인트 그다음 숏트 그다음 바이트
		              // 롱은 8바이트인 데 4 인트에 넣을라면 데이터가 짤린다.
		 
		   		//1. 자동 타입변환 [크기순 : 작은상자에서 큰상자로 이동 가능] 
		 				// 바이트 ->쇼트(char) ->인트  ->롱 ->플로트 ->더블 //(반대로는불가하다)
		      				byte bytevalue = 10;
		      				int intvalue = bytevalue; //자동 형변환 [가능]바이트 -> 인트
		      				//byte bytevalue2 = intvalue; // 불가  인트 -> 바이트
		      				
		 		//2. 강제 타입변환 [메모리 손실 => 데이터손실]
		      				//P.54
		      				 byte bytevalue2 = (byte)intvalue;
		
		 
	}

}//c e
