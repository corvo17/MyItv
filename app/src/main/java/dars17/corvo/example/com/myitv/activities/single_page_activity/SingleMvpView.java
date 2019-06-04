package dars17.corvo.example.com.myitv.activities.single_page_activity;

import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;

public interface SingleMvpView {
    void onAllAboutMovieReady(MovieResponse movieResponse);
}
