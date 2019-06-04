package dars17.corvo.example.com.myitv.pojos.all_movies;

import com.google.gson.annotations.SerializedName;

public class ResponseBody{

	@SerializedName("need_update")
	private boolean needUpdate;

	@SerializedName("code")
	private int code;

	@SerializedName("data")
	private Data data;

	@SerializedName("subscription_status")
	private String subscriptionStatus;

	@SerializedName("language")
	private String language;

	@SerializedName("message")
	private String message;

	public void setNeedUpdate(boolean needUpdate){
		this.needUpdate = needUpdate;
	}

	public boolean isNeedUpdate(){
		return needUpdate;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setSubscriptionStatus(String subscriptionStatus){
		this.subscriptionStatus = subscriptionStatus;
	}

	public String getSubscriptionStatus(){
		return subscriptionStatus;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ResponseBody{" + 
			"need_update = '" + needUpdate + '\'' + 
			",code = '" + code + '\'' + 
			",data = '" + data + '\'' + 
			",subscription_status = '" + subscriptionStatus + '\'' + 
			",language = '" + language + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}