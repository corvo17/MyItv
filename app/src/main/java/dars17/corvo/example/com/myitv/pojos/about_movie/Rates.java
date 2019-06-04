package dars17.corvo.example.com.myitv.pojos.about_movie;

import com.google.gson.annotations.SerializedName;

public class Rates{

	@SerializedName("imdb")
	private int imdb;

	@SerializedName("kinopoisk")
	private int kinopoisk;

	@SerializedName("itv")
	private Object itv;

	public void setImdb(int imdb){
		this.imdb = imdb;
	}

	public int getImdb(){
		return imdb;
	}

	public void setKinopoisk(int kinopoisk){
		this.kinopoisk = kinopoisk;
	}

	public int getKinopoisk(){
		return kinopoisk;
	}

	public void setItv(Object itv){
		this.itv = itv;
	}

	public Object getItv(){
		return itv;
	}

	@Override
 	public String toString(){
		return 
			"Rates{" + 
			"imdb = '" + imdb + '\'' + 
			",kinopoisk = '" + kinopoisk + '\'' + 
			",itv = '" + itv + '\'' + 
			"}";
		}
}