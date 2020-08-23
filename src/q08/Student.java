package q08;

import java.util.List;

public class Student {

	private int sid;
	private String sname;
	private List<String> hobby;
	public Student() {
	
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getHobby() {
		return hobby;
	}
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", hobby=" + hobby + "]";
	}
	
	
}
