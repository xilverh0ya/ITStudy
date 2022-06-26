package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    // JDBC ���� ����
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    // MEMBER ���̺� ���� SQL ��ɾ�
    private final String MEMBER_LIST = "SELECT * FROM member";
    private final String MEMBER_INSERT = "INSERT INTO member VALUES (?, ?, ?)";
    private final String MEMBER_DELETE = "DELETE member WHERE member_id = ?";


    // MEMBER ���̺� ���� CRUD �޼ҵ�

    // ȸ�� ����
    public void deleteMember(String memberID) {
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(MEMBER_DELETE);
            stmt.setString(1, memberID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt, conn);
        }
    }

    // ȸ�� ���

    public void insertMember(MemberVO vo) throws SQLException {
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(MEMBER_INSERT);
            stmt.setString(1, vo.getMemberID());
            stmt.setString(2, vo.getName());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt, conn);
        }
    }


    // ȸ����� ��ȸ
    public List<MemberVO> getMemberList()  {
        List<MemberVO> memberList = new ArrayList<MemberVO>();
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(MEMBER_LIST);
            rs = stmt.executeQuery();
            while (rs.next()) {
                MemberVO memberVO = new MemberVO();
                memberVO.setMemberId(rs.getString("ID"));
                memberVO.setName(rs.getString("NAME"));
                memberList.add(memberVO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return memberList;
    }

}