package dars17.corvo.example.com.myitv.pojos.about_movie;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Files{

	@SerializedName("video_hd")
	private VideoHd videoHd;

	@SerializedName("snapshots")
	private List<Object> snapshots;

	@SerializedName("video_sd")
	private VideoSd videoSd;

	@SerializedName("video_3d")
	private Video3d video3d;

	@SerializedName("poster_url")
	private String posterUrl;

	@SerializedName("video_4k")
	private Video4k video4k;

	@SerializedName("trailers")
	private List<Object> trailers;

	public void setVideoHd(VideoHd videoHd){
		this.videoHd = videoHd;
	}

	public VideoHd getVideoHd(){
		return videoHd;
	}

	public void setSnapshots(List<Object> snapshots){
		this.snapshots = snapshots;
	}

	public List<Object> getSnapshots(){
		return snapshots;
	}

	public void setVideoSd(VideoSd videoSd){
		this.videoSd = videoSd;
	}

	public VideoSd getVideoSd(){
		return videoSd;
	}

	public void setVideo3d(Video3d video3d){
		this.video3d = video3d;
	}

	public Video3d getVideo3d(){
		return video3d;
	}

	public void setPosterUrl(String posterUrl){
		this.posterUrl = posterUrl;
	}

	public String getPosterUrl(){
		return posterUrl;
	}

	public void setVideo4k(Video4k video4k){
		this.video4k = video4k;
	}

	public Video4k getVideo4k(){
		return video4k;
	}

	public void setTrailers(List<Object> trailers){
		this.trailers = trailers;
	}

	public List<Object> getTrailers(){
		return trailers;
	}

	@Override
 	public String toString(){
		return 
			"Files{" + 
			"video_hd = '" + videoHd + '\'' + 
			",snapshots = '" + snapshots + '\'' + 
			",video_sd = '" + videoSd + '\'' + 
			",video_3d = '" + video3d + '\'' + 
			",poster_url = '" + posterUrl + '\'' + 
			",video_4k = '" + video4k + '\'' + 
			",trailers = '" + trailers + '\'' + 
			"}";
		}
}