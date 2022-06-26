package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//��ٱ��ϴ��, ��ٱ��� ���, ����, Ÿ��
public class Dao {
	private MysqlConnect dbconn;

	public Dao() {
		dbconn = MysqlConnect.getInstance();
	}

	public void insert(Member m) {
		// 1. db����
		Connection conn = dbconn.getConn();

		// 2. sql
		String sql = "insert into Member(mID, mPW, mNAME) values(?, ?, ?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getmID());
			pstmt.setInt(2, m.getmPW());
			pstmt.setString(3, m.getmNAME());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// ID�� ���� ��� �˻�.
	public Member select(String mID) { // mID�� primary key
		ResultSet rs; // �˻���� Ÿ��
		Member m = null;

		// db����
		Connection conn = dbconn.getConn();

		// ������ sql��
		String sql = "select * from Member where mID=?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);

			// ��Ī
			pstmt.setString(1, mID);

			// sql ����
			rs = pstmt.executeQuery(); // ��ȯ���� ResultSet

			if (rs.next()) {
				String mID1 = rs.getString(1);
				int mPW = rs.getInt(2);
				boolean mType = rs.getBoolean(3);
				String mNAME = rs.getString(4);
				m = new Member(mID1, mPW, mType, mNAME);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return m;
	}

}
