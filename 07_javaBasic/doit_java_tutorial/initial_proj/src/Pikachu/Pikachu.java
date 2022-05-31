package Pikachu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pikachu {

	private int hp;
	private int exp;
	private int lv;
	
	// ��ī��
	public Pikachu(int hp, int exp, int lv) {
		this.hp = hp;
		this.exp = exp;
		this.lv = lv;
	}
	
	// ���� Ȯ��
	public void getStatus() {
		System.out.println("��ī���� �� ����");
		System.out.println("HP : " + hp);
		System.out.println("EXP : " + exp);
		System.out.println("Level :" + lv);
	}
	
	// �� �Ա�
	public void eatMeal() {
		hp += 5;
	}
	
	// ���ڱ�
	public void sleep() {
		hp += 10;
	}
	
	// ���
	public void play() {
		hp -= 8;
		if (hp < 0) {
			System.out.println("��ī�� ����߽��ϴ�. ������ �����մϴ�.");
			System.exit(0);
		} else {
			exp += 5;
			if (exp >= 20) {
				lv++;
				System.out.println("Level Up!");
				exp -= 20;
			}
		}
	}
	
	// ��ϱ�
	public void exercise() {
		hp -= 13;
		if (hp < 0) {
			System.out.println("��ī�� ����߽��ϴ�. ������ �����մϴ�.");
			System.exit(0);
		} else {
			exp += 10;
			if (exp >= 20) {
				lv++;
				System.out.println("Level Up!");
				exp -= 20;
			}
		}
	}

}
