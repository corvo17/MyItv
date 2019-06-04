package dars17.corvo.example.com.myitv.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

import dars17.corvo.example.com.myitv.activities.main_activity.MainMvpView;
import dars17.corvo.example.com.myitv.activities.main_activity.MainPresenter;
import dars17.corvo.example.com.myitv.fragments.MainPageFrament;
import dars17.corvo.example.com.myitv.pojos.all_movies.MoviesItem;
import dars17.corvo.example.com.myitv.pojos.all_movies.ResponseBody;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<MoviesItem> moviesItems;
    MainPresenter presenter;
    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
        this.moviesItems = moviesItems;


    }
    @Override    public Fragment getItem(int position) {
        switch (position){
            case 0: return MainPageFrament.getInstance(1);
            case 1: return MainPageFrament.getInstance(2);
            case 2: return MainPageFrament.getInstance(3);
            case 3: return MainPageFrament.getInstance(4);
        }
        return null;
    }
    @Override
    public int getCount() {
        return 4;
    }
}
