package dars17.corvo.example.com.myitv.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import dars17.corvo.example.com.myitv.Config;
import dars17.corvo.example.com.myitv.R;
import dars17.corvo.example.com.myitv.activities.main_activity.MainMvpView;
import dars17.corvo.example.com.myitv.activities.main_activity.MainPresenter;
import dars17.corvo.example.com.myitv.adapters.RecyclerAdapter;
import dars17.corvo.example.com.myitv.pojos.about_movie.MovieResponse;
import dars17.corvo.example.com.myitv.pojos.all_movies.MoviesItem;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;

public class MainPageFrament extends Fragment implements MainMvpView {
    private static String pageNum = "movies";
    private ArrayList<MoviesItem> moviesItems;
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private int whichPage = 1;
    private MainPresenter presenter;
    private Context context;


    public MainPageFrament() {
        // Required empty public constructor
    }
    public static MainPageFrament getInstance(int whichPage){
           MainPageFrament frament = new MainPageFrament();
           Bundle bundle = new Bundle();
           bundle.putInt(pageNum,whichPage);
           frament.setArguments(bundle);
           return frament;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (getArguments() != null){
            this.whichPage =  getArguments().getInt(pageNum);
        }
        return inflater.inflate(R.layout.fragment_main_page_frament, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = view.getContext();
        getData();
        initViews(view);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recylerMovies);
    }

    private void getData() {
           presenter = new MainPresenter(context, this);
           presenter.getMoviesOnPages(Config.KEY, whichPage);
       }

    @Override
    public void onMoviesReady(ResponseBody responseBody) {
        moviesItems = (ArrayList<MoviesItem>) responseBody.getData().getMovies();
        adapter = new RecyclerAdapter(moviesItems, context);
        recyclerView.setAdapter(adapter);
    }
}
