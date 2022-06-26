package cart;

import java.util.ArrayList;
import java.util.Scanner;

import stock.Stock;

public class CartService {
	private CartDao dao;

	public CartService() {
		dao = new CartDao();
	}

	// ��ٱ��� ���
	public void addCart(Scanner sc) {
		System.out.println("��ٱ��Ͽ� ���� ��ǰ��:");
		String cNAME = sc.next();
		System.out.println("�ֹ� ����:");
		int cQTY = sc.nextInt();
		boolean cSTATUS = false;
		dao.insert(new Cart(cNAME, cQTY, cSTATUS));
	}

	// ��ٱ��� ����
	public void getCart(Scanner sc) {
		ArrayList<Cart> list = dao.selectAll();
		if (list.size() == 0) {
			System.out.println("���� ��ǰ");
		} else {
			System.out.println(list);
		}
	}

	public void printAll() {
		ArrayList<Cart> list = dao.selectAll();
		for (Cart c : list) {
			System.out.println(c);
		}
	}
}
