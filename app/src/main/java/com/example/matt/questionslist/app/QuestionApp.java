package com.example.matt.questionslist.app;

import com.example.matt.questionslist.db.AppDatabase;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


public class QuestionApp extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        AppDatabase.init(this);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
