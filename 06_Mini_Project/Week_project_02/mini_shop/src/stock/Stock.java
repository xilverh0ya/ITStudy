package stock;

//vo. ��ǰ Ŭ����
public class Stock {
	private int sID;
	private String sNAME;
	private int sQTY;
	private int sPRICE;
	
	public Stock() {
		
	}
	
	//��ǰ��� �� ����� ������
	public Stock(int sID, String sNAME, int sQTY, int sPRICE) {
		this.sID = sID;
		this.sNAME = sNAME;
		this.sQTY = sQTY;
		this.sPRICE = sPRICE;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsNAME() {
		return sNAME;
	}

	public void setsNAME(String sNAME) {
		this.sNAME = sNAME;
	}

	public int getsQTY() {
		return sQTY;
	}

	public void setsQTY(int sQTY) {
		this.sQTY = sQTY;
	}

	public int getsPRICE() {
		return sPRICE;
	}

	public void setsPRICE(int sPRICE) {
		this.sPRICE = sPRICE;
	}

	@Override
	public String toString() {
		return "Stock [sID=" + sID + ", sNAME=" + sNAME + ", sQTY=" + sQTY + ", sPRICE=" + sPRICE + "]";
	}
}
	