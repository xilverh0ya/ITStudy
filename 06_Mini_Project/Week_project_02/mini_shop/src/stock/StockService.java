package stock;

import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class StockService {
	private StockDao dao;

	public StockService() {
		dao = new StockDao();
	}

	// ��ǰ ���
	public void addProduct(Scanner sc) {
		System.out.println("��ǰ ���");
		System.out.println("��ǰ ��ȣ:");
		int sID = sc.nextInt();

		System.out.println("��ǰ �̸�:");
		String sName = sc.next();

		System.out.println("��ǰ ����:");
		int sQTY = sc.nextInt();

		System.out.println("��ǰ ����:");
		int sPRICE = sc.nextInt();

		// vo�� ���� ��Ƽ� �迭 �߰�
		Stock s = new Stock(sID, sName, sQTY, sPRICE);
		dao.insert(s);
	}
	
	// �̸����� �˻�
		public void getStockByName(Scanner sc) {
			System.out.print("search name:");
			String name = sc.next();

			ArrayList<Stock> list = dao.selectByName(name);
			if (list.size() == 0) {
				System.out.println("���� ��ǰ");
			} else {
				System.out.println(list);
			}
		}

	// ��ü���
	public void printAll() {
		ArrayList<Stock> list = dao.selectAll();
		for (Stock s : list) {
			System.out.println(s);
		}
	}
}
