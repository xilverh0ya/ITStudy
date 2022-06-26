package hw.store;

//�ֹ� vo
//����(�ֹ���ȣ(�ڵ��Ҵ�), �ֹ���ǰ��ü(Product), �ֹ�����, �����ݾ�, ��������, �������
public class Order {
	private int num;
	private int pnum; //��ǰ��ȣ, �ܰ�
	private int amount;
	private int payment;
	private boolean isPay; //false
	private boolean isOut; //false
	
	public Order() {
	}
	
	public Order(int pnum, int amount) {
		this.pnum = pnum;
		this.amount = amount;
	}
	
	public Order(int num, int pnum, int amount, int payment, boolean isPay, boolean isOut) {
		this.num = num;
		this.pnum = pnum;
		this.amount = amount;
		this.payment = payment;
		this.isPay = isPay;
		this.isOut = isOut;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public boolean isPay() {
		return isPay;
	}

	public void setPay(boolean isPay) {
		this.isPay = isPay;
	}

	public boolean isOut() {
		return isOut;
	}

	public void setOut(boolean isOut) {
		this.isOut = isOut;
	}
	
	@Override
	public String toString() {
		return "Order [num = " + num + ", pnum=" + pnum + ", amount=" + amount + ", payment=" + payment + ", isPay="
							+ isPay + ", isOut=" + isOut + "]";
	}

}
