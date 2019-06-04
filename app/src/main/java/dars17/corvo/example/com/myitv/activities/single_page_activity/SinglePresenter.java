package dars17.corvo.example.com.myitv.activities.single_page_activity;

import android.content.Context;

import dars17.corvo.example.com.myitv.MyApp;
import dars17.corvo.example.com.myitv.activities.main_activity.MainMvpPresenter;
import dars17.corvo.example.com.myitv.activities.main_activity.MainMvpView;
import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SinglePresenter<V extends SingleMvpView>  implements SingleMvpPresenter {
    private Context context;
    private SingleMvpView mainMvpView;
    private MyApp myApp;
    public SinglePresenter(Context context, SingleMvpView mainMvpView) {
    this.context = context;
    myApp = (MyApp) context.getApplicationContext();
    this.mainMvpView = mainMvpView;
    }

    @Override
    public void getAllAboutMovie(int moviewId, String key) {
        myApp.getNetworkManager()
                .getService()
                .getDetails(moviewId + "", key)
                .enqueue(new Callback<MovieResponse>() {
                    @Override
                    public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                        mainMvpView.onAllAboutMovieReady(response.body());
                    }

                    @Override
                    public void onFailure(Call<MovieResponse> call, Throwable t) {

                    }
                });
    }
}
