package dars17.corvo.example.com.myitv.pojos.all_movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MoviesItem implements Serializable {

	@SerializedName("year")
	private int year;

	@SerializedName("files")
	private Files files;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("params")
	private Params params;

	@SerializedName("genres_str")
	private String genresStr;

	@SerializedName("countries_str")
	private String countriesStr;

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
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

	public void setCountriesStr(String countriesStr){
		this.countriesStr = countriesStr;
	}

	public String getCountriesStr(){
		return countriesStr;
	}

	@Override
 	public String toString(){
		return 
			"MoviesItem{" + 
			"year = '" + year + '\'' + 
			",files = '" + files + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",params = '" + params + '\'' + 
			",genres_str = '" + genresStr + '\'' + 
			",countries_str = '" + countriesStr + '\'' + 
			"}";
		}
}