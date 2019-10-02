package com.hanet.testdagger2;

import android.app.Application;

public class MyApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .modelModule(new ModelModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
