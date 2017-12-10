package com.example.matt.questionslist.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

@Module
public class PrefModule {
    @Provides
    @ApplicationScope
    SharedPreferences providesPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}
