package hello;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner �Է� ���� Ŭ����. ��ü�� ���� �Ҵ�޾ƾ� ��.
		// ���� �޸� �Ҵ� ������ new

		// �Է� ���� ��ĳ�� ����
		Scanner sc = new Scanner(System.in);

		// next(): ������� ���ڿ� �Ѱ� �Է�
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.next(); // �ܾ� �Ѱ� �Է¹���
		System.out.println("name:" + name);
		
		System.out.println("������ �Է��Ͻÿ�");
		int score = sc.nextInt();
		
		System.out.println("����� �Է��Ͻÿ�");
		double avg = sc.nextDouble();
		
		System.out.println("score:" + score);
		System.out.println("avg:" + avg);
		
		System.out.println("�ּҸ� �Է��Ͻÿ�");
		sc.nextLine();// ���ۿ� ���� ���� ����
		String addr = sc.nextLine();//���� �ٽ� �Է¹���
		System.out.println("addr:" + addr);
	}
}
 
