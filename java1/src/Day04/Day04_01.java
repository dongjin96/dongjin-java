package Day04;


public class Day04_01 {public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System. in);
// ���ѷ���=> while �̿� �� ���ѹݺ� ���� ���� Ʈ�縦 ������ ���ѹݺ��̵ȴ�
	// Ű���带 �̿��� ��������
	//���ѷ��� ������� : 1. ������ false 2. break
while(true) {System.out.println("���ѷ���");
	int ���� = scanner.nextInt();
	if(���� == 4) break;
}
// ���� [����] ����
// 1. ���� Ŭ���� // 2. math  Ŭ���� 
 // random ��ü
			 // .next() : int �� ǥ�� �Ҽ� ������ŭ ���� ����
			 // random.nextInt(����) 0~ ���������� ����
			 //. random.nextInt(10)+�ʱⰪ <- �ʱⰪ�� �ϳ����� �Ϻ��ͳ��� (�׼��ڸ�ŭ����)

 Random random = new Random();
 System.out.println( random.nextInt(10)+1);
 
 // ����������
 		//1. ����ڷκ��� ���� ���� �� �� �ϳ��� �Է¹ޱ�
 		//2. ��ǻ�ʹ� �������� ���� ���� �� �� �ϳ� ����
 	    //3. �¸��� �÷��̾� ȣ��
 		//+ : ���� ������ �Է��ϸ� ��������
 		//+ : ���������� ���Ӽ��� �����¸� [���帹�� �̱� �÷��̾�]






}

	
}
