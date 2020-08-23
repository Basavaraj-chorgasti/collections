package q01;

public	class Booksale{
		private Book b;
		private int copisold;
		public Book getB() {
			return b;
		}
		public void setB(Book b) {
			this.b = b;
		}
		public int getCopisold() {
			return copisold;
		}
		public void setCopisold(int copisold) {
			this.copisold = copisold;
		}
		public Booksale(Book b, int copisold) {
			super();
			this.b = b;
			this.copisold = copisold;
		}
		@Override
		public String toString() {
			return "BookSale [b=" + b + ", copisold=" + copisold + "]";
		}
		public Booksale() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}


