package PrintMain;
public class PrintMain{
	
	public static void main(String[] args){
		System.out.println("abcd"); //�ܼ�â�� �� ����ϰ� �ٹٲ�
		// ln = line
		
		System.out.print("1234");  // �ܼ�â�� �� ���
		
		System.out.printf("%.2f",123.6548324);
		System.out.println();
		//Ư������ �ø���
		// \t - tabŰ
		// \n = new line
		// \r - carriage return
		// \r\n ���� ����
		// \\,(," - Ư������(/,(," ��) �������
		// \b - �齺���̽�(1byte) *java���� 2byte
		System.out.println("����\n:�������� 5��6���̶��ϴ�.");
		System.out.println("�ð���\r:����10�ú��� ����1�ñ����Դϴ�.");
		System.out.println("\\(^^)/");
		System.out.println("\\(\" \")/");
		System.out.println("------------------------------------------------");
		//����
		System.out.printf("����%d",3);
		System.out.println("2022-04-20");
		System.out.printf("����:%03d\n",3);
		
		//�Ǽ�	float
		System.out.printf("���ھ�%f",123.6548);
	}
}