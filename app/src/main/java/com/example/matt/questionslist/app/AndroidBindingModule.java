package com.example.matt.questionslist.app;

import com.example.matt.questionslist.questions.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface AndroidBindingModule {
    @ContributesAndroidInjector MainActivity mainActivity();
}
