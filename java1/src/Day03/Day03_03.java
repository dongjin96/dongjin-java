package Day03;

import javax.swing.event.SwingPropertyChangeSupport;

import com.sun.java_cup.internal.runtime.Scanner;

public class Day03_03 {

	//if(������) swich (������ ����)
	   // ����Ǽ��� ������ �ִ°��  => switch [�ӵ��� ����]
	// ����Ǽ��� ������ ���� �ʴ� ��� => if[��]
	 /* ���� : switch(key : �˻���){
					case �˻� : ���๮;
					case �˻� : ���๮;
					case �˻� : ���๮;	
					default : ���๮;
					
	*/
	//�� )
	// break : switch Ȥ�� �ݺ����� Ż��� ���Ǵ� Ű���� (���� ����� �߰�ȣ Ż��)
	public static void main(String[] args) {
		
		int ���� = 80; 
		switch (����) {//������ �˻�
		case  90 : System.out.println("A��� �Դϴ�");break;
		case  80 : System.out.println("B��� �Դϴ�");break;
		case  70 : System.out.println("C��� �Դϴ�");break;

		default: System.out.println("Ż���Դϴ�");
			
		
		
		
	//P.118 char switch ��
		String position = "����";
		switch (position) {
		case "����":
			
			break;

		default:
			break;
		};
	// ���� ���� ���� ������ �� �Է¹޾� ����� 90�� �̻��̸� "A" 80���̻��̸� "B" �������� Ż��
	
	Scanner �Է°�ü = new Scanner(System.in);
	
		}
	
	
	
	
	
	
	
	
	
	}	
}
