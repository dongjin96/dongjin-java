package Day02;//c s

// ����  : �ϳ��� ���� �����Ҽ� �ִ� �޸� ����
   // �޸�[�ֱ����ġ=ram] : ���� �������� ���� �׷� ���
				//���α׷� <---���μ��� [������]<-----��ɾ�[�ڵ� ]����
						//�������� ����---->�뷮����--->�ӵ�����
                 		// ���� ȿ���� => �ڷ���
  				// ���� ����
					//�ڷ��� ������ [����]
					//int age;
				// ������ ��Ģ
					//���ڷ� ���� x //��ҹ��� ���� 
				// ������ ����[ �����ʰ��� ���ʿ� ���� : ���� ������ =]
					// int score; // ���� ����
					// score = 90 : // ������ 90 �� ����
  
					//������ ����� ��� �������� ���ɰ����ϴ� [��ȣ ������ �̵�����// ��ȣ �����δ� �̵� �Ұ���~!]
public class Day02_2 {
	
	public static void main(String[] args) {
		//p.35 ��
		 int va��ue = 10 ; // int�� �ڷ��� value �������� ���� ���� ����� ���ÿ� 10 ����	//��Ʈ��� ���ڸ� �缭 ������� 10�� �����ϴ°�
		 int result = va��ue + 10 ; //���� +�� 20
		 System.out.println("��� : " + result);
		 
	
	
		 // p.38 �ڷ���
		 	//�ڷ������ ���� : �޸��� ȿ����[������ ���]
		 	// ��ǻ�ʹ� ���� ��� [0.1] ���� : bit =>0 �Ǵ� 1
		 	// bit =>8bit =>1����Ʈ [01010101=>1����Ʈ]
		    // byte => 1024byte=> 1kbyte
		 /*[��]
		  *  boolean 1����Ʈ 	true, false
		  * [����]
		  * char	2����Ʈ 	���� [�����ڵ�] �ƽ�Ű�� 1����Ʈ ��
		  * [����]
		  * byte 	1����Ʈ 	+-127
		  * char 	2����Ʈ 	����
		  * short 	2����Ʈ 	+-3������
		  * int 	4����Ʈ 	+-20������
		  * long 	8����Ʈ
		  * float	4����Ʈ    //�Ҽ��� 8�ڸ� ���� ǥ������
		  * double	8����Ʈ	 //�Ҽ��� 18�ڸ� ���� ǥ���̰���
		  * 
		  * 
		  */
		 
		 //p.40 byte[-128~ +127] ���� ������ ���ڷγ���
		 byte var1 = -128; System.out.println(var1);
		 byte var2 = -30;  System.out.println(var2);
		 byte var3 =  30;  System.out.println(var3);
		  //byte var4 =  128;  System.out.println(var4); //����
		 
		 // p. 43: char [���� 1��= �ѱ���] ���ڸ� ������ ���ڷγ���
		 char c1 = 'A'; 		System.out.println(c1);
		 char c2 =  65; 		System.out.println(c2);
		 char c3 = '\u0041'; 	System.out.println(c3);
		 
		 char c4 = '��'; 		System.out.println(c4);
		 char c5 = 44032; 		System.out.println(c5);
		 char c6 = '\uac00'; 	System.out.println(c6);
		//��ǻ�ʹ�[0.1] ��� ���ڸ� ó���ұ�?
		 //�ƽ�Ű�ڵ� :��ǻ�͸� �̿��Ͽ� �����ϱ����ؼ�  [0.1]��� ����� �ٲٴ°� �� ��� [����]�� �ٲٴ°� 
		        //�ƽ�Ű�ڵ� : �̱����� ����Ű� �����迡�� ����ϱ����� ����� //�����ڵ�(�ٱ��� ���� �뷮�̸���)
		 		//�����ڵ�[java] : ������ ���� �ٵ��ִ�
		 //P.44~45 : short [2����Ʈ] , int[�⺻ ���� �ڷ���/ 4����Ʈ] Ÿ��
		 short num1 = 30000; 	System.out.println( num1 );
		 
		 int num2 = 10; 		System.out.println(num2);
		 int num3 = 012; 		System.out.println(num3);//������
		 int num4 = 0xA; 		System.out.println(num4);//16����
		 	//���� ���� : ��ǻ�Ͱ� ǥ���Ҽ� �ִ� ���� �Ѱ� �ذ�
		 	// 2���� [0,1] : ����
		 	// 8���� [0~7] 						[0]�� ������ 8����
		 	//10 ���� [0~9] : ���					
		 	//16 ���� [0~9A V CDEF] :�پ��� ǥ������  [0x]�� ������ 16��������
		
		 
		 // P.46 : Long[8����Ʈ] : 20���̻�
		 Long num5 = 2000000000L;     System.out.println(num5);
		 
		 // P.47~48 : float , double [*�⺻ �Ǽ� �ڷ��� /8����Ʈ]
		 	double val = 3.14; System.out.println( val );
		 	//float val2 = 3.14; System.out.println( va2 ); //�̷��� �ȵ�
		 	float val2 = 3.14f; System.out.println( val2 ); //�տ� f�� ���̸� ������
		 	
		 double val3 = 0.123456789123456789; System.out.println( val3);
		 //�Ҽ��� 18�ڸ����� ǥ�������ϴ�
		 float val4 =  0.123456789123456789f;  System.out.println( val4);
		 
		 //boolean : ��Ʈ [0(false).1(true)]
		 boolean bo1 = true; System.out.println(bo1);
		
		 
		 // P. 49 : Ÿ�Ժ�ȯ ����ū���� �� �״��� ��Ʈ �״��� ��Ʈ �״��� ����Ʈ
		              // ���� 8����Ʈ�� �� 4 ��Ʈ�� ������� �����Ͱ� ©����.
		 
		   		//1. �ڵ� Ÿ�Ժ�ȯ [ũ��� : �������ڿ��� ū���ڷ� �̵� ����] 
		 				// ����Ʈ ->��Ʈ(char) ->��Ʈ  ->�� ->�÷�Ʈ ->���� //(�ݴ�δºҰ��ϴ�)
		      				byte bytevalue = 10;
		      				int intvalue = bytevalue; //�ڵ� ����ȯ [����]����Ʈ -> ��Ʈ
		      				//byte bytevalue2 = intvalue; // �Ұ�  ��Ʈ -> ����Ʈ
		      				
		 		//2. ���� Ÿ�Ժ�ȯ [�޸� �ս� => �����ͼս�]
		      				//P.54
		      				 byte bytevalue2 = (byte)intvalue;
		
		 
	}

}//c e
