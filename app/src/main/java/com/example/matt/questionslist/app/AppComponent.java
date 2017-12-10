package com.example.matt.questionslist.app;

import com.example.matt.questionslist.di.AndroidSupportInjectionModule;
import com.example.matt.questionslist.di.ApplicationScope;
import com.example.matt.questionslist.di.DataModule;
import com.example.matt.questionslist.di.PrefModule;
import com.example.matt.questionslist.di.ViewModelModule;

import dagger.Component;
import dagger.android.AndroidInjector;


@ApplicationScope
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AndroidBindingModule.class,
        AppModule.class,
        PrefModule.class,
        ViewModelModule.class,
        DataModule.class
})
public interface AppComponent extends AndroidInjector<QuestionApp> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<QuestionApp> {
    }
}
