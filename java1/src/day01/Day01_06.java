package day01;

import java.util.Scanner;

public class Day01_06 {// c s
public static void main(String[] args) {
	Scanner �Է°�ü = new Scanner(System.in);
	 // 2. �Է¹ޱ�
	System.out.println("�ۼ��� : "); String writer = �Է°�ü.next();
	System.out.println("���� : "); String contents = �Է°�ü.nextLine();//���� ���� o
		// scanner.nextLine(); // next ��������  nextLine ���� ���� �߻�
		// �ذ���  : next �� nextLine ���̿� nextLine() �߰�
	System.out.println("��¥"); String date = �Է°�ü.next();
	
	// 3. ���
	System.out.println("--------------�湮��-------------");
	System.out.println("|���� | �ۼ��� | ���� \t ��¥ |");
	System.out.println("| 1  | "+writer+"|"+contents + "\t | " + date + "|");
	System.out.println("----------------------------------");

}
}// c e
