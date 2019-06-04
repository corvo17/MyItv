package dars17.corvo.example.com.myitv.activities.main_activity;

import android.content.Context;

import dars17.corvo.example.com.myitv.Config;
import dars17.corvo.example.com.myitv.MyApp;
import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter <V extends MainMvpView>  implements MainMvpPresenter {
    private Context context;
    private MainMvpView mainMvpView;
    private MyApp myApp;
    private static INotifyProgressBar notifyProgressBar;
    public MainPresenter(Context context, MainMvpView mainMvpView) {
    this.context = context;
    myApp = (MyApp) context.getApplicationContext();
    this.mainMvpView = mainMvpView;
    }

    @Override
    public void getMoviesOnPages(String key, int page) {
        myApp.getNetworkManager()
                .getService()
                .getMovies(key, page)
                .enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        if (response.isSuccessful()){
                            mainMvpView.onMoviesReady(response.body());
                            notifyProgressBar.notifyProgressBa();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
    }
    public static void setProgressBar(INotifyProgressBar notifyProgressBar1){
        notifyProgressBar = notifyProgressBar1;
    }
    interface  INotifyProgressBar{
        void notifyProgressBa ();
    }
}
