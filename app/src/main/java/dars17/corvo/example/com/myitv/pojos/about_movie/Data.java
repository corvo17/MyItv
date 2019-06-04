package dars17.corvo.example.com.myitv.pojos.about_movie;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("movie")
	private Movie movie;

	public void setMovie(Movie movie){
		this.movie = movie;
	}

	public Movie getMovie(){
		return movie;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"movie = '" + movie + '\'' + 
			"}";
		}
}