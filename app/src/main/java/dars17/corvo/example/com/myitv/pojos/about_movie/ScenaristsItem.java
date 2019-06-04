package dars17.corvo.example.com.myitv.pojos.about_movie;

import com.google.gson.annotations.SerializedName;

public class ScenaristsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("photo_url")
	private Object photoUrl;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setPhotoUrl(Object photoUrl){
		this.photoUrl = photoUrl;
	}

	public Object getPhotoUrl(){
		return photoUrl;
	}

	@Override
 	public String toString(){
		return 
			"ScenaristsItem{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",photo_url = '" + photoUrl + '\'' + 
			"}";
		}
}