package dars17.corvo.example.com.myitv.pojos.all_movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data{

	@SerializedName("items_per_page")
	private int itemsPerPage;

	@SerializedName("movies")
	private List<MoviesItem> movies;

	@SerializedName("total_items")
	private int totalItems;

	public void setItemsPerPage(int itemsPerPage){
		this.itemsPerPage = itemsPerPage;
	}

	public int getItemsPerPage(){
		return itemsPerPage;
	}

	public void setMovies(List<MoviesItem> movies){
		this.movies = movies;
	}

	public List<MoviesItem> getMovies(){
		return movies;
	}

	public void setTotalItems(int totalItems){
		this.totalItems = totalItems;
	}

	public int getTotalItems(){
		return totalItems;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"items_per_page = '" + itemsPerPage + '\'' + 
			",movies = '" + movies + '\'' + 
			",total_items = '" + totalItems + '\'' + 
			"}";
		}
}