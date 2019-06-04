package dars17.corvo.example.com.myitv.pojos.about_movie;

import com.google.gson.annotations.SerializedName;

public class Params{

	@SerializedName("is_4k")
	private boolean is4k;

	@SerializedName("is_new")
	private boolean isNew;

	@SerializedName("is_free")
	private boolean isFree;

	@SerializedName("is_3d")
	private boolean is3d;

	@SerializedName("is_tvshow")
	private boolean isTvshow;

	@SerializedName("is_hd")
	private boolean isHd;

	public void setIs4k(boolean is4k){
		this.is4k = is4k;
	}

	public boolean isIs4k(){
		return is4k;
	}

	public void setIsNew(boolean isNew){
		this.isNew = isNew;
	}

	public boolean isIsNew(){
		return isNew;
	}

	public void setIsFree(boolean isFree){
		this.isFree = isFree;
	}

	public boolean isIsFree(){
		return isFree;
	}

	public void setIs3d(boolean is3d){
		this.is3d = is3d;
	}

	public boolean isIs3d(){
		return is3d;
	}

	public void setIsTvshow(boolean isTvshow){
		this.isTvshow = isTvshow;
	}

	public boolean isIsTvshow(){
		return isTvshow;
	}

	public void setIsHd(boolean isHd){
		this.isHd = isHd;
	}

	public boolean isIsHd(){
		return isHd;
	}

	@Override
 	public String toString(){
		return 
			"Params{" + 
			"is_4k = '" + is4k + '\'' + 
			",is_new = '" + isNew + '\'' + 
			",is_free = '" + isFree + '\'' + 
			",is_3d = '" + is3d + '\'' + 
			",is_tvshow = '" + isTvshow + '\'' + 
			",is_hd = '" + isHd + '\'' + 
			"}";
		}
}