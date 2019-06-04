package dars17.corvo.example.com.myitv.network;

import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface IService {
    @GET("api/content/main/2/list")
    Call<ResponseBody> getMovies(@Query("user") String key, @Query("page") int page);

    @GET("api/content/main/2/show/{movie_id}")
    Call<MovieResponse> getDetails(@Path(value = "movie_id", encoded = true) String userId, @Query("user") String key);
}
