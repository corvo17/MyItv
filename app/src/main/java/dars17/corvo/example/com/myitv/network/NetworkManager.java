package dars17.corvo.example.com.myitv.network;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.readystatesoftware.chuck.ChuckInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {
    private IService service;

    public NetworkManager(Context context) {


        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        OkHttpClient client = new OkHttpClient.Builder()
                //.addInterceptor(new ChuckInterceptor(context))
                .connectTimeout(10000, TimeUnit.MILLISECONDS)
                .writeTimeout(10000, TimeUnit.MILLISECONDS)
                .readTimeout(10000, TimeUnit.MILLISECONDS)
                //.addInterceptor(logging)
                //.addInterceptor(new ChuckInterceptor(context))
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl("https://api.itv.uz/")
                .build();
        service = retrofit.create(IService.class);

    }

    public IService getService() {
        return service;
    }

}
