package q07;

public class Theatre{
	
		private int Theatreid;
		private String Theatrename;
		private String location;
		private Movie m;
		public int getTheatreid() {
			return Theatreid;
		}
		public void setTheatreid(int theatreid) {
			Theatreid = theatreid;
		}
		public String getTheatrename() {
			return Theatrename;
		}
		public void setTheatrename(String theatrename) {
			Theatrename = theatrename;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Movie getM() {
			return m;
		}
		public void setM(Movie m) {
			this.m = m;
		}
		@Override
		public String toString() {
			return "Theatre [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
					+ m + "]";
		}
		public Theatre(int theatreid, String theatrename, String location, Movie m) {
			super();
			Theatreid = theatreid;
			Theatrename = theatrename;
			this.location = location;
			this.m = m;
		}
		
	


}
