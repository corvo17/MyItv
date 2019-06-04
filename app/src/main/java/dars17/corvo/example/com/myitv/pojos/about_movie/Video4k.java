package dars17.corvo.example.com.myitv.pojos.about_movie;

import com.google.gson.annotations.SerializedName;

public class Video4k{

	@SerializedName("seconds")
	private int seconds;

	@SerializedName("video_url")
	private Object videoUrl;

	@SerializedName("file_id")
	private Object fileId;

	public void setSeconds(int seconds){
		this.seconds = seconds;
	}

	public int getSeconds(){
		return seconds;
	}

	public void setVideoUrl(Object videoUrl){
		this.videoUrl = videoUrl;
	}

	public Object getVideoUrl(){
		return videoUrl;
	}

	public void setFileId(Object fileId){
		this.fileId = fileId;
	}

	public Object getFileId(){
		return fileId;
	}

	@Override
 	public String toString(){
		return 
			"Video4k{" + 
			"seconds = '" + seconds + '\'' + 
			",video_url = '" + videoUrl + '\'' + 
			",file_id = '" + fileId + '\'' + 
			"}";
		}
}