package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

import Buyer.*;
import Seller.*;
import project.MemberDAO;
import project.MemberVO;

public class LoginMenu {
	private static final Scanner sc = new Scanner(System.in);
	
	// �α��� �޴�
	static void readMenu() throws SQLException {
		
        while (true) {
            System.out.print("""
                    1 : �α���
                    2 : ȸ������
                    0 : �����ϱ�
                    """);
            int task = sc.nextInt();

            switch (task) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                	System.out.println("ID�� �Է��ϼ��� : ");
                	String input_id = sc.next();
                	System.out.println("PW�� �Է��ϼ��� : ");
                	int input_pw = sc.nextInt();
                	Login.loginCheck(input_id, input_pw);
                	
                	}
                case 2 -> {
//                	SellerMenu cm = new CartMenu(); 
//                    Cart.readMenu();
                }
                default -> readMenu();
            }
        }
    }
	
	//ȸ�� ��� ��ȸ
    public static void getMemberList() {
        MemberDAO dao = new MemberDAO();

        List<MemberVO> memberList = dao.getMemberList();
        if (memberList.isEmpty()) {
            System.out.println("��ϵ� ȸ���� �����ϴ�.");
        } else {
            System.out.println("���� ��ϵ� ȸ�� ����Դϴ�.");
            System.out.println("---> Member" + memberList);
        }
    }
    
	// �α����ϱ�
	public void Login(String id, int pw) {
		boolean fg = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT mID, mPW FROM Member WHERE mID = ?, mPW = ?";
			
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
	}
	
	// ���� ����(�α��� �Ϸ� �� ȭ�� �̵�)
	public void loginFlag(String id) throws SQLException {
		boolean f = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT mTYPE FORM Member WHERE mID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next() && rs.getBoolean(1) == true) {	//��ȸ ����� 1�̸� Admin ����
				f = true;
				// �Ǹ��� ���� �޴��� �̵�
				SellerMenu s = new SellerMenu();
				s.readMenu();
			}
			
			else {
				//������ ���� �޴��� �̵�
				BuyerMenu b = new BuyerMenu();
				b.readMenu();
			}
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
	}
}
