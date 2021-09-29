package Day02;//c s


/* P 64 ,67 연산자 [연산시 사용되는 특수문]
	 산술 연산자 : +-* /나누기%(나머지)
	 			=(연결 연산자 )
	비교 연산자 :결과는 T아님 F
	 >=이상 (크거나 같다) > 초과 [크다] == [같다]
               <= 이하 (작거나같다)  < 미만  [작다] !=[같지않다]
			 
			논리 연산자 : 비교연산작 2 개이상일떄
			
			&& : AND[이면서, 면서, 이고 , 그리고 , 모두] 모두 트루면 트루
			|| : OR [이거나 , 거나 , 또는 , 하나라도] 하나라도 트루면 트루 
			!  : NOt[부정 (반대)]
					
			대입연산자 :
			
			=  [오른쪽값이 왼쪽에 대입]
			+= [오른쪽값을 왼쪽값에 더한후 왼쪽에대입]		
            *=/=-=%=
            *
            증감 연산장 : 앞에있으면 우선순위뒤에있으며마지막에
            	++[1증가]
				--[1감소]
			조건연산자 : : 콜론 기준으로 조건이맞을경우 앞에거 해당안하면 뒤에거
				
				 조건식 ? true(참) : false (거짓)
		 연산우선순위
		  괄호 ->증감 ->곱셈-> 덧셈 ->비교 ->논리-> 대입
				
*/

public class Day02_03 {
	
	
	
	public static void main(String[] args) {
		int 정수1 = 10; int 정수2 =20;
		System.out.println("더하기 :" + 정수1+정수2);// 문자 +숫자 +숫자 => 연결연산자
		System.out.println("더하기 :" + (정수1+정수2));
		//숫자 +숫자
		System.out.println("빼기 :" + (정수1-정수2));
		System.out.println("곱하기 :" + (정수1*정수2));
		System.out.println("나누기 :" + (정수1/정수2));
		System.out.println("나머지 :" + (정수1%정수2));
		//P.40 : 증감연산자    ++가앞에있는거 먼저 후 프린트  ++가뒤에있으면 프린트먼저 후 증
		// 규칙적인 증가 /감소
		//정수1= 정수1+1
		//정수1+=1|
		// 정수 ++
		 정수1++; System.out.println(" 증감 :" + 정수1);
		 정수1--;	 System.out.println(" 감소 :"+ 정수1);
		 // 선위 증가, 후위증가
		 System.out.println(" 선위증가:"+ ++정수1);// 1증
		 System.out.println(" 확인 :"+ 정수1);// 확인 11
		 System.out.println(" 후위증가 :"+ 정수1++);// 1증가 11
		 
		 System.out.println(" 선위감소 :"+ --정수1);//1감소 11
		 System.out.println(" 확인 :"+ 정수1);//11
		 System.out.println(" 후위감소 :"+ 정수1--);// 1감소 11
		 System.out.println(" 확인 :"+ --정수1); // 10
		 
		 
		 //P.88 :비교연산자
		 System.out.println(" 이상 :"+(정수1 >=정수2)); //10>=20 틀린것
		 System.out.println(" 이하 :"+(정수1 <=정수2)); //10<=20 맞음
		 System.out.println(" 초과 :"+(정수1 >정수2)); //10>20 틀린것
		 System.out.println(" 미만 :"+(정수1 <정수2)); //10<20 맞음
		 System.out.println(" 같다 :"+(정수1 == 정수2)); //10==20 틀림
		 System.out.println(" 같지않다 :"+(정수1 !=정수2)); //10!=20 맞음
		 
		 //P. 92 :논리연산자 : ANd/OR : 비교연산자 2개이상일떄
		 // AND : 2개이상의 비교연산자가 모두 TRUE=> 결과 TRUE // 하나라도 FALE=> 결과도 FALE
		 // OR : 2개이상의 비교 연산자가 하나라도 TRUE =>결과 TRUE
		 int 정수3 = 30; int 정수4 =40; //여기에 왜 이렇게 가정하는지..
		 System.out.println("AND :"+(정수1>=정수2 &&정수4 >=정수3));//F && T=>F
		 System.out.println("OR :"+(정수1>=정수2 ||정수4 >=정수3)); //F&&T=>T
		 System.out.println("NOT :"+ !(정수1>=정수2|| 정수4 >=정수3)); //!T=>F
		 
		 // P.98 : 대입연산자 :
		 정수1 += 1; //변수명 +=값 오른쪽값을 왼쪽변수명 더한후에 왼쪽 변수에 대입
		 정수1 *= 10; System.out.println(정수1);//110
		 정수1 -= 10; System.out.println(정수1);//100
		 정수1 /= 10; System.out.println(정수1);//10
		 
		 //P.100 : 조건 연산자 //char 조건
		 	int 점수 = 85;
		 	char 등급 = 점수 > 90?'A' :'B'; System.out.println(등급);//점수가 90점이상이면? 에이 아니면? 비
		 	char 등급2 = 점수 > 90?'A' : 점수 >80 ? 'B':'C'; System.out.println(등급2);
		 	
		 
	}

}//ce
