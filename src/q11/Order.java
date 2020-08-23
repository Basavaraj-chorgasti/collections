package q11;

public class Order {
	
	private int oid;
	private String oname;
	private double price;
	private int qty;
	public Order(int oid, String oname, double price, int qty) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.price = price;
		this.qty = qty;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
