package com.example.matt.questionslist.app;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module abstract class AppModule {
    @Binds abstract Context bindApplicationContext(QuestionApp application);
    @Binds abstract Application bindApplication(QuestionApp application);
}
