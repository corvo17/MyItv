package dars17.corvo.example.com.myitv.activities.single_page_activity;

import dars17.corvo.example.com.myitv.activities.main_activity.MainMvpView;

public interface SingleMvpPresenter<V extends SingleMvpView> {
    void getAllAboutMovie(int moviewId, String key);
}
