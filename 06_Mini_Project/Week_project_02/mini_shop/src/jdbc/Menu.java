package jdbc;

import java.util.Scanner;

import stock.StockService;
import cart.CartService;

public class Menu {
	private Service service;
	private StockService sservice;
	private CartService cservice;

	public Menu() {
		service = new Service();
		sservice = new StockService();
		cservice = new CartService();
	}

	// �����޴�
	public void run(Scanner sc) {
		boolean flag = true;
		int m;
		while (flag) {
			System.out.println("1.�α��� 2.ȸ������ 3.����");
			m = sc.nextInt();
			switch (m) {
			case 1:
				boolean x = service.Login(sc);
				if (x) {
					if (Service.mType == false) {
						runCart(sc);
					} else {
						System.out.println("������ ����");
						break;
					}
				}
				break;
			case 2:
				service.AddMember(sc);
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}

	// ȸ�� �ֹ�
	public void runCart(Scanner sc) {
		boolean flag = true;
		int m = 0;
		while (flag) {
			System.out.println("1.��ǰ ��� 2.��ǰ������ �˻� 3.��ٱ��� ��� 4.��ٱ��� ��� 5.����");
			// System.out.printAll();
			m = sc.nextInt();
			switch (m) {
			case 1:
				sservice.printAll();
				break;
			case 2:
				sservice.getStockByName(sc);
				break;
			case 3:
				cservice.addCart(sc);
				break;
			case 4:
				cservice.getCart(sc);
				break;
			case 5:
				flag = false;
				break;
			}
		}
	}
}