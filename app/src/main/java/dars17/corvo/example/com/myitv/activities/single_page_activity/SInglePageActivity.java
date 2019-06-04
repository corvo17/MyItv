package dars17.corvo.example.com.myitv.activities.single_page_activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

import dars17.corvo.example.com.myitv.Config;
import dars17.corvo.example.com.myitv.MyApp;
import dars17.corvo.example.com.myitv.R;
import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.MoviesItem;

public class SInglePageActivity extends AppCompatActivity {
    private MoviesItem moviesItem;
    private static final String TAG = "SInglePageActivity";
    private TextView title, year, country, genre, descrption;
    private VideoView videoView;
    private SinglePresenter presenter;
    private ImageView img;
    private Button btnBack, btnForward, btnStop;
    private int currentPosition = 0;
    private ProgressBar progressBar;
    private int duration;
    private int current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_page);
        initViews();
    }


    private void initViews() {
        moviesItem = (MoviesItem) getIntent().getSerializableExtra("movie");
        title = findViewById(R.id.textView4);
        year = findViewById(R.id.textView5);
        country = findViewById(R.id.textView6);
        genre = findViewById(R.id.textView8);
        videoView = findViewById(R.id.videoView);
        descrption = findViewById(R.id.textView);
        img = findViewById(R.id.img);
        btnBack = findViewById(R.id.btnBack);
        btnForward = findViewById(R.id.btnForward);
        btnStop = findViewById(R.id.btnPlay);
        progressBar = findViewById(R.id.progress_horizontal);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        setActionsToTheBtns();

        title.setText(moviesItem.getTitle());
        year.setText(moviesItem.getYear() + "");
        country.setText(moviesItem.getCountriesStr());
        genre.setText(moviesItem.getGenresStr());

        Glide.with(this).load(moviesItem.getFiles().getPosterUrl()).into(img);
        presenter = new SinglePresenter(this, new SingleMvpView() {
            @Override
            public void onAllAboutMovieReady(MovieResponse movieResponse) {
                Uri uri;
               // MediaController mediaController= new MediaController(SInglePageActivity.this);
                //mediaController.setAnchorView(videoView);
                if (!moviesItem.getParams().isIsTvshow()) {
                    uri = Uri.parse(movieResponse.getData().getMovie().getFiles().getVideoHd().getVideoUrl());
                    videoView.setVideoURI(uri);
                }else {
                    uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.new_york);
                }

               // videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();
                duration = videoView.getDuration();
               checkProgressBar();

                if (movieResponse.getData().getMovie().getDescription() != null)
                    descrption.setText(movieResponse.getData().getMovie().getDescription());
            }
        });
        presenter.getAllAboutMovie(moviesItem.getId(), Config.KEY);
    }

    private void setActionsToTheBtns() {


        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView.isPlaying()){
                    btnStop.setBackground(getDrawable(R.drawable.ic_play));
                    videoView.pause();
                  //  currentPosition = videoView.getCurrentPosition();
                }else {
                    btnStop.setBackground(getDrawable(R.drawable.ic_pause));
                  //  videoView.seekTo(currentPosition);
                    videoView.start();
                }
            }
        });
        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition = videoView.getCurrentPosition();
                videoView.seekTo(currentPosition + 10000);
                videoView.start();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPosition = videoView.getCurrentPosition();
                videoView.seekTo(currentPosition - 10000);
                videoView.start();
            }
        });

//        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                duration = videoView.getDuration();
//            }
//        });


    }
    void checkProgressBar(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                current = videoView.getCurrentPosition();
                progressBar.setProgress((current/duration) * 100);
                checkProgressBar();
            }
        }, 10000);

    }

}
