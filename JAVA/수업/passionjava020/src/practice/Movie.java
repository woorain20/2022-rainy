package practice;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	List<String> movie=new ArrayList<>();

	
	public List<String> getMovie() {
		return movie;
	}


	public void setMovie(List<String> movie) {
		this.movie = movie;
	}


	public void addMovie(String title) {
		movie.add(title);
	}
}
