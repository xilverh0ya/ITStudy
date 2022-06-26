package shop;

public class MemberVO {

    // private ������� ����
    private String memberID;
    private String name;
    private String type;


    // 2. ����� ��ȸ�Ѵ�.


    public String getMemberID() {
        return memberID;
    }

    //case2 ���
    public void setMemberID(String memberId)  {
        this.memberID = memberId;
    }

    //case1 �����ȸ
    public void setMemberId(String MEMBER_ID) {
        this.memberID = MEMBER_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public String getType() {
        return type;

    }

    public void setType(boolean type)  {
        this.type = type;
    }


    public MemberVO() {
    }

    public MemberVO(String memberID, String name)  {
        this.memberID = memberID;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "memberId='" + memberID + '\'' +
                        ", name='" + name + '\'';
    }

}
