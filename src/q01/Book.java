package q01;

public class Book {

		private int bid;
		private String aname;
		private double price;
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Book(int bid, String aname, double price) {
			super();
			this.bid = bid;
			this.aname = aname;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [bid=" + bid + ", author=" + aname + ", price=" + price + "]";
		}
		
	}



