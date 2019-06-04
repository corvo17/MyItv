package dars17.corvo.example.com.myitv.activities.main_activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

import com.ToxicBakery.viewpager.transforms.ZoomOutTranformer;

import java.util.ArrayList;

import dars17.corvo.example.com.myitv.CustomPagerTransformer;
import dars17.corvo.example.com.myitv.MyApp;
import dars17.corvo.example.com.myitv.R;
import dars17.corvo.example.com.myitv.adapters.RecyclerAdapter;
import dars17.corvo.example.com.myitv.adapters.ViewPagerAdapter;
import dars17.corvo.example.com.myitv.network.NetworkManager;
import dars17.corvo.example.com.myitv.pojos.all_movies.MoviesItem;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MainPresenter.INotifyProgressBar, MainMvpView {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPagerAdapter pagerAdapter;
    private ProgressBar progressBar;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setSupportActionBar(toolbar);

    }

    private void initViews() {
        toolbar = findViewById(R.id.toolBar);
        viewPager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tabDots);
        progressBar = findViewById(R.id.progressBar);

        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        MainPresenter.setProgressBar(this);
        tabLayout.setupWithViewPager(viewPager,true);
        viewPager.setPageTransformer(true,new CustomPagerTransformer());

    }

    @Override
    public void notifyProgressBa() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onMoviesReady(ResponseBody responseBody) {

    }
}
