package com.hanet.testdagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = {AppModule.class, ModelModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
    void inject(Main2Activity activity);
}
