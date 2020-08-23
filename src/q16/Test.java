package q16;

import java.util.Arrays;

public class Test {
	private int tid;
	private int sid;
	private int mark[];
	public Test(int tid, int sid, int[] mark) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.mark = mark;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int[] getMark() {
		return mark;
	}
	public void setMark(int[] nark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", mark=" + Arrays.toString(mark) + "]";
	}
	
	

}
