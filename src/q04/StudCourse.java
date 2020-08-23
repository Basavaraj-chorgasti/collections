package q04;

public class StudCourse {
	
		private int sid;
		private String name;
		private String course;
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
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public StudCourse(int sid, String name, String course) {
			super();
			this.sid = sid;
			this.name = name;
			this.course = course;
		}
		@Override
		public String toString() {
			return "StudCourse [sid=" + sid + ", name=" + name + ", course=" + course + "]";
		}
		
	}


