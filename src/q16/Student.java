package q16;

public class Student  implements Comparable<Student>{

	private int sid;
	private int totalmarks;
	public Student(int sid, int totalmarks) {
		super();
		this.sid = sid;
		this.totalmarks = totalmarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", totalmarks=" + totalmarks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.totalmarks-o.totalmarks;
	}
	
}
