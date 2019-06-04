package dars17.corvo.example.com.myitv.pojos.all_movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Files implements Serializable {

	@SerializedName("poster_url")
	private String posterUrl;

	public void setPosterUrl(String posterUrl){
		this.posterUrl = posterUrl;
	}

	public String getPosterUrl(){
		return posterUrl;
	}

	@Override
 	public String toString(){
		return 
			"Files{" + 
			"poster_url = '" + posterUrl + '\'' + 
			"}";
		}
}