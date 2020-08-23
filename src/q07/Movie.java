package q07;

public class Movie {
	
		private int movieId;
		private String moviename;
		private int rating;
		public int getMovieId() {
			return movieId;
		}
		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}
		public String getMoviename() {
			return moviename;
		}
		public void setMoviename(String moviename) {
			this.moviename = moviename;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		@Override
		public String toString() {
			return "Movie [movieId=" + movieId + ", moviename=" + moviename + ", rating=" + rating + "]";
		}
		public Movie(int movieId, String moviename, int rating) {
			super();
			this.movieId = movieId;
			this.moviename = moviename;
			this.rating = rating;
		}
		
	


}
