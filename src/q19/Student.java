package q19;

public class Student {
	
	private int sid;
	private String name;
	private String Qua;
	private int yop;
	private boolean placed;
	public Student(int sid, String name, String qua, int yop, boolean placed) {
	
		this.sid = sid;
		this.name = name;
		Qua = qua;
		this.yop = yop;
		this.placed = placed;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQua() {
		return Qua;
	}
	public void setQua(String qua) {
		Qua = qua;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public boolean isPlaced() {
		return placed;
	}
	public void setPlaced(boolean placed) {
		this.placed = placed;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", Qua=" + Qua + ", yop=" + yop + ", placed=" + placed + "]";
	}
	
	

}
