package Day02;

import javax.annotation.processing.SupportedSourceVersion;

public class Day02_5 {

	
	
	
	
	
	
	
	
	
	// ����: char ''
	// ���ڿ� : �ڷ��� ���� => string Ŭ���� ""
	public static void main(String[] args) {
	char ����1 = 'a';
			//.char ����1 = 'abc'; // char 2����Ʈ�� �ϳ��� ���ڸ� ���� �����ϴ�
	//1. string �̿��� ���ڿ� ����
	String ���ڿ�1="abc"; System.out.println(���ڿ�1);
	// 2. �迭�� �̿��� ���ڿ� ����
	char[] ���ڿ�2 = {'a','b','c'};
	System.out.println(���ڿ�2);
	
	//string : ���ڿ� ���� ���ִ� Ŭ����
	//��ü�� �񱳿��� �Ұ��ϴ� [. equals(���ڿ�)]<-��ü �� �޼ҵ� 
	String �̸� = "���缮";   //���� : 1����Ʈ //�ѱ� 2����Ʈ 
	String �̸�2 = new String("���缮");	
	
	// ��ü ����� new �޸𸮿� �Ҵ����ִ� ���̴�  �������ִ� �Ϳ��� �Ƚ�εȴ� char���� �Ⱥ��� �������� �ɺ���
	System.out.println(�̸�==�̸�2);
	System.out.println(�̸�. equals(�̸�2));
	
			
	}
	
	
	
	
}
