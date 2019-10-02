package com.hanet.testdagger2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private MyApplication myApplication;

    public AppModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Singleton
    @Provides
    Context getMyContext() {
        return myApplication;
    }

    @Provides
    Resources getResources(Context context) {
        return context.getResources();
    }

    @Singleton
    @Provides
    SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("MyPref", Context.MODE_PRIVATE);
    }
}
