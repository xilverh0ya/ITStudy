package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PikachuGame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ī�� ������ �����մϴ�.");
		int hp = 30;
		int exp = 0;
		int lv = 1;
		boolean flag = true;
		
		while(flag) {
			System.out.println("1.�� �Ա� 2.���ڱ� 3.��� 4.��ϱ� 5.����Ȯ�� 6.����");
			
			// ���۷� �Է¹ޱ�
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// �Է� ���� �� int������ ��ȯ
			int K = Integer.parseInt(br.readLine());
			
			switch(K) {
			
			case 1:
				hp += 5;
				break;
				
			case 2:
				hp += 13;
				break;
				
			case 3:
				hp -= 8;
				if (hp < 0) {
					System.out.println("��ī�� ����߽��ϴ�. ������ �����մϴ�.");
					flag = false;
				} else {
					exp += 5;
					if (exp >= 20) {
						lv++;
						exp -= 20;
					}
				}
				break;
			case 4:
				hp -= 13;
				if (hp < 0) {
					System.out.println("��ī�� ����߽��ϴ�. ������ �����մϴ�.");
					flag = false;
				} else {
					exp += 10;
					if (exp >= 20) {
						lv++;
						exp -= 20;
					}
				}
				break;
				
			case 5:
				System.out.println("[ ��ī�� ���� ]");
				System.out.println("HP : " + hp);
				System.out.println("EXP : " + exp);
				System.out.println("Level : " + lv);
				break;
				
			case 6:
				System.out.println("������ �����մϴ�.");
				flag = false;
				break;
			}
		}
	}

}
