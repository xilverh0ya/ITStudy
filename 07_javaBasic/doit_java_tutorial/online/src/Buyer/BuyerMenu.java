package Buyer;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BuyerMenu {
	private static final Scanner sc = new Scanner(System.in);
	
	//������ �޴�
    public void readMenu() throws SQLException {
        while (true) {
            System.out.print("""
                    1 : ��ǰ ��ȸ
                    2 : ��ٱ���
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
