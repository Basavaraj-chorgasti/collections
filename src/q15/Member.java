package q15;

public class Member {
	
	private int mid;
	private String wingFlat_no;
	private String name;
	public Member(int mid, String wingFlat_no, String name) {
		super();
		this.mid = mid;
		this.wingFlat_no = wingFlat_no;
		this.name = name;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getWingFlat_no() {
		return wingFlat_no;
	}
	public void setWingFlat_no(String wingFlat_no) {
		this.wingFlat_no = wingFlat_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", wingFlat_no=" + wingFlat_no + ", name=" + name + "]";
	}
	

}
