package jdbc;

import java.util.Scanner;

public class Service {
	private Dao dao;
	public static String LoginId = "";
	public static boolean mType = true;

	public Service() {
		dao = new Dao();
	}

	// ȸ������
	public void AddMember(Scanner sc) {
		System.out.println("ȸ������");
		System.out.println("ID:");
		String mID = sc.next();
		System.out.println("PW:");
		int mPW = sc.nextInt();
		System.out.println("�̸�:");
		String mName = sc.next();
		dao.insert(new Member(mID, mPW, false, mName));
	}

	// �α���
	public boolean Login(Scanner sc) {
		System.out.println("�α���");

		System.out.print("ID:");
		String mID = sc.next();
		System.out.print("PW:");
		int mPW = sc.nextInt();
		Member m = dao.select(mID);
		if (m == null) {
			System.out.println("���Ե��� ���� ȸ��");
		} else {
			if (m.getmPW()==(mPW)) {
				System.out.println("�α��� ����");
				// �α��� ó��
				LoginId = m.getmID();
				mType = m.ismType();
				return true;
				
			}
		}
		return false;
	}
}
