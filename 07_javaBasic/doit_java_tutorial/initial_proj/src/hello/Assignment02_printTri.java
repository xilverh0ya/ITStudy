package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment02_printTri {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		
		// ���۷� �Է� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է¹��� �� int �� ��ȯ
		int n = Integer.parseInt(br.readLine());
		
		// 1. ũ�� : Ȯ��, ��������
		System.out.println("[ 1�� ��� ]");
		for (int i = 0 ; i < n ; i++ ) {
			for(int j = i + 1 ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===================");
		
		// 2. ũ�� : Ȯ��, ��������
		System.out.println("[ 2�� ��� ]");
		for (int i = 0 ; i < n ; i++ ) {
			for(int j = n - i ; j > 0 ; j-- ) 
				System.out.print(" ");
			for(int k = 0 ; k <= i ; k++ ) 
				System.out.print("*");
			System.out.println();
		}
		System.out.println("===================");
		
		// 3. ũ�� : �غ�, �߾�����
		System.out.println("[ 3�� ��� ]");
		for (int i = 0 ; i < n ; i++ ) {
			for(int j = n - i ; j > 0 ; j-- ) 
				System.out.print(" ");
			for(int k = 0 ; k <= i ; k++ ) 
				if (i != 0) {
					System.out.print("*");
					System.out.print(" ");
				} else {
				System.out.print("*");
				}
			System.out.println();
		}
		System.out.println("===================");
		
		// 4. ũ�� : �߰���, �߾����� // ������ ���
		System.out.println("[ 4�� ��� ]");
		for (int i = 0 ; i < n ; i++ ) {
			for(int j = n - i ; j > 0 ; j-- ) 
				System.out.print(" ");
			for(int k = 0 ; k <= i ; k++ ) 
				if (i != 0) {
					System.out.print("*");
					System.out.print(" ");
				} else {
				System.out.print("*");
				}
			System.out.println();
		}
		for (int i = n - 1 ; i > 0  ; i-- ) {
			for(int j = n - i + 1 ; j > 0 ; j-- ) 
				System.out.print(" ");
			for(int k = 0 ; k < i ; k++ ) 
				if (i != 0) {
					System.out.print("*");
					System.out.print(" ");
				} else {
				System.out.print("*");
				}
			System.out.println();
		}
		System.out.println("===================");		
	}

}
