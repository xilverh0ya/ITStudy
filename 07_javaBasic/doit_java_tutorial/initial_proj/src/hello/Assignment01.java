package hello;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score;
		float avg;
			
		score = new int[4];
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("����, ����, ���� ������ ���ʴ�� �Է��Ͻÿ� : ");
			
		for(int i=0 ; i < score.length - 1 ; i++) { 
			score[i] = sc.nextInt();
			score[3] += score[i];
		}
			avg = score[3] / 3.f;
			
			
		// ��� ����
			
		String []str = {"����","����","����","����"};
			
		for(int i=0;i<score.length;i++) {
			System.out.println(str[i]+" : "+score[i]);
				
		}
		System.out.println("��� : "+avg);
		
	}

}
