package dars17.corvo.example.com.myitv.pojos.about_movie;

import com.google.gson.annotations.SerializedName;

public class VideoSd{

	@SerializedName("seconds")
	private int seconds;

	@SerializedName("video_url")
	private String videoUrl;

	@SerializedName("file_id")
	private int fileId;

	public void setSeconds(int seconds){
		this.seconds = seconds;
	}

	public int getSeconds(){
		return seconds;
	}

	public void setVideoUrl(String videoUrl){
		this.videoUrl = videoUrl;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	public void setFileId(int fileId){
		this.fileId = fileId;
	}

	public int getFileId(){
		return fileId;
	}

	@Override
 	public String toString(){
		return 
			"VideoSd{" + 
			"seconds = '" + seconds + '\'' + 
			",video_url = '" + videoUrl + '\'' + 
			",file_id = '" + fileId + '\'' + 
			"}";
		}
}