package Day_05;

import java.util.Scanner;

public class Day05_03 {
// P. 181 Ȯ�ι���
	//1.2
	//�� : ������ ���� ��
	//���� : �����̸� ����
	//3. == != ��ü �ּҰ� �� [��ü ���빰 ��x]
			//.equals [��ü ���빰 �� o]
	
	//2. 3
	     //1. ���α׷� ������ ���ÿ� ������ �޸� �ʱ�ȭ 
		//3. �������� �ʴ� ��ü�� �ڵ� �Ҹ�
	
	
	//3.2[���ڿ� �����ص� ��ü�� �ٸ������ֱ� ����]
	
	//4.2 int[] array ={1,2,3}]
	
	//5. 3 [boolean Ÿ�� �迭�� �ʱⰪ�� false]
	// ���� =0, �Ǽ�=0,0 , �� =false , ���ڿ�[��ü]= null
	//7.
	/*
	 * for (int i = 0 ; i<arry.length; i++){ // i�� �ε��� 0���� 4���� 1�������ϸ鼭 �ݺ�
	 * 
	 * 				if(array [i]> max)max=array[i // i��° �ε��� ���� max ���� ũ�� max�� i ���� �ε��� ��]
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	//8.[�迭��  ��� �ε����� �����ϱ� ���ؼ� for Ȱ��]
	/* int count = 0 ; // ���� ����
	 * // �� �ݺ�
	 * for(int i=0; i<array.length;i++){
	 * ���ݺ�
	 * for (int j =0. ; j<array[j].length ; j++){
	 * �ش� �ε��� �� �����ͼ� sum �����հ� ���ϱ�
	 * sum+= array[i][j];
	 * }
	 * count += array[i].length ; //2+3+5}
	 * avg = (double)sum / count;
	 * 
	 * 
	 */
	public static void main(String[] args) {//ms
		Scanner scanner = new Scanner(System.in);
		boolean run = true; // while ���� ���� ���� ����
		int studentNum =0;
		int[] scores =null;
		
		
		
		while(run) {//���ѷ��� [5�� �Է��ϸ� ���ѷ��� ����]}
			System.out.println("---------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3��������Ʈ|4.�м�|5.����");
			System.out.println("---------------------------------------");
			System.out.println("���� :");
			
			int selctNo =scanner.nextInt();
			if(selctNo==1) {
				System.out.println("�л��� :"); studentNum = scanner.nextInt();
				scores = new int[studentNum]; // �Է¹��� ������ŭ �迭���� �Ҵ�
			}
			else if(selctNo==2) {
				//�迭�� �Ҵ�� ��� �ε����� ���ֱ�=> for
				for(int i =0 ; i<selctNo ; i++) {
					System.out.println("scores["+i+"]");
					scores[i]=scanner.nextInt(); // �Է¹��� ���� i ���� ����
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
	
	/*int �л��� =0;
	int �л�����=0;
	Scanner scanner = new Scanner(System.in);
	while(true) {
	System.out.println("1.�л��� : 2.�л����� : 3. ��������Ʈ 4.�м� 5.����");
	System.out.print("���� :");
	
	int �÷��̾� = scanner.nextInt();
	
	if(�÷��̾�==1)
	{ System.out.println("�л���" +�л���);}
	else if (�÷��̾� ==2) {System.out.println("�л�����"+�л�����);
		
	}
	else if (�÷��̾� ==3) {System.out.println("��������Ʈ");}
	else if (�÷��̾� ==4) {System.out.println("�м�");}
	else if(�÷��̾�==5)
	{System.out.println("[����]");}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//w e
}

private static void else if (�÷��̾� ==2) {
		
	}(boolean b) {
// TODO Auto-generated method stub
*/
	
	
	
	
	
	
	
}
