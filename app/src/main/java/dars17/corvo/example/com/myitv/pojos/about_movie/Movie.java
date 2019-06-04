package dars17.corvo.example.com.myitv.pojos.about_movie;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Movie{

	@SerializedName("title_eng")
	private String titleEng;

	@SerializedName("year")
	private int year;

	@SerializedName("scenarists")
	private List<ScenaristsItem> scenarists;

	@SerializedName("rates")
	private Rates rates;

	@SerializedName("directors")
	private List<DirectorsItem> directors;

	@SerializedName("description")
	private String description;

	@SerializedName("title")
	private String title;

	@SerializedName("params")
	private Params params;

	@SerializedName("genres_str")
	private String genresStr;

	@SerializedName("producers")
	private List<ProducersItem> producers;

	@SerializedName("movies")
	private List<MoviesItem> movies;

	@SerializedName("actors")
	private List<ActorsItem> actors;

	@SerializedName("files")
	private Files files;

	@SerializedName("id")
	private int id;

	@SerializedName("countries_str")
	private String countriesStr;

	public void setTitleEng(String titleEng){
		this.titleEng = titleEng;
	}

	public String getTitleEng(){
		return titleEng;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setScenarists(List<ScenaristsItem> scenarists){
		this.scenarists = scenarists;
	}

	public List<ScenaristsItem> getScenarists(){
		return scenarists;
	}

	public void setRates(Rates rates){
		this.rates = rates;
	}

	public Rates getRates(){
		return rates;
	}

	public void setDirectors(List<DirectorsItem> directors){
		this.directors = directors;
	}

	public List<DirectorsItem> getDirectors(){
		return directors;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setParams(Params params){
		this.params = params;
	}

	public Params getParams(){
		return params;
	}

	public void setGenresStr(String genresStr){
		this.genresStr = genresStr;
	}

	public String getGenresStr(){
		return genresStr;
	}

	public void setProducers(List<ProducersItem> producers){
		this.producers = producers;
	}

	public List<ProducersItem> getProducers(){
		return producers;
	}

	public void setMovies(List<MoviesItem> movies){
		this.movies = movies;
	}

	public List<MoviesItem> getMovies(){
		return movies;
	}

	public void setActors(List<ActorsItem> actors){
		this.actors = actors;
	}

	public List<ActorsItem> getActors(){
		return actors;
	}

	public void setFiles(Files files){
		this.files = files;
	}

	public Files getFiles(){
		return files;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCountriesStr(String countriesStr){
		this.countriesStr = countriesStr;
	}

	public String getCountriesStr(){
		return countriesStr;
	}

	@Override
 	public String toString(){
		return 
			"Movie{" + 
			"title_eng = '" + titleEng + '\'' + 
			",year = '" + year + '\'' + 
			",scenarists = '" + scenarists + '\'' + 
			",rates = '" + rates + '\'' + 
			",directors = '" + directors + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",params = '" + params + '\'' + 
			",genres_str = '" + genresStr + '\'' + 
			",producers = '" + producers + '\'' + 
			",movies = '" + movies + '\'' + 
			",actors = '" + actors + '\'' + 
			",files = '" + files + '\'' + 
			",id = '" + id + '\'' + 
			",countries_str = '" + countriesStr + '\'' + 
			"}";
		}
}