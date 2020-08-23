package q05;

import java.util.Arrays;

public class Customer implements Comparable<Customer>{
	
	private int cid;
	private String cname;
	private int[] items;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int[] getItems() {
		return items;
	}
	public void setItems(int[] items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", items=" + Arrays.toString(items) + "]";
	}
	public Customer(int cid, String cname, int[] items) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.items = items;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Customer other = (Customer) obj;
		if (cid != other.cid)
			return false;
		return true;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getItems().length-o.getItems().length;
	}
	
	
	
	

}
