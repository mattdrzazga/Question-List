package com.example.matt.questionslist.di;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.matt.questionslist.ViewModelFactory;
import com.example.matt.questionslist.questions.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    ViewModel bindMainViewModel(MainViewModel viewModel);

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
