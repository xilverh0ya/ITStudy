package Seller;

import java.sql.SQLException;
import java.util.Scanner;

public class SellerMenu {
	private static final Scanner sc = new Scanner(System.in);
	
	//�Ǹ��� �޴�
    public void readMenu() throws SQLException {
        while (true) {
            System.out.print("""
                    1 : ��ǰ ��ȸ
                    2 : �Ǹ� ���
                    0 : �����ϱ�
                    """);
            int task = sc.nextInt();

            switch (task) {
                case 0 -> {
                    return;
                }
                case 1 -> {
//                    Lookup.readMenu();
                }
                case 2 -> {
//                    Cart.readMenu();
                }
                default -> readMenu();
            }
        }
    }
}
