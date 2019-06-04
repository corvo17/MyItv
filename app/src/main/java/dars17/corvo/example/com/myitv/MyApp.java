package dars17.corvo.example.com.myitv;

import android.app.Application;

import dars17.corvo.example.com.myitv.network.NetworkManager;

public class MyApp extends Application {
    private static NetworkManager networkManager = null;
    @Override
    public void onCreate() {
        super.onCreate();

    }
    public NetworkManager getNetworkManager(){
        if (networkManager == null){
            networkManager = new NetworkManager(this);
        }
        return networkManager;
    }
}
