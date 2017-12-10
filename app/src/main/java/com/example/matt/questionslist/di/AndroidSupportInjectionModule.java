package com.example.matt.questionslist.di;

import android.support.v4.app.Fragment;

import java.util.Map;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.internal.Beta;
import dagger.multibindings.Multibinds;

@Beta
@Module(includes = AndroidInjectionModule.class)
public abstract class AndroidSupportInjectionModule {
    @Multibinds
    abstract Map<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>> supportFragmentInjectorFactories();

    private AndroidSupportInjectionModule() {}
}
