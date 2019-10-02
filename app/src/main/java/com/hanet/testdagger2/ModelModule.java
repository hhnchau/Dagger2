package com.hanet.testdagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {

    @Named("A")
    @Singleton
    @Provides
    User getUserA() {
        return new User("Nguyen Van A", "HCM");
    }


    @Named("B")
    @Singleton
    @Provides
    User getUserB() {
        return new User("Nguyen Van B", "HCM");
    }
}
