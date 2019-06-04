package dars17.corvo.example.com.myitv.activities.main_activity;

import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;

public interface MainMvpPresenter <V extends MainMvpView> {
    void getMoviesOnPages(String key, int page);
}
