package com.example.matt.questionslist.di;

import com.example.matt.questionslist.questions.QuestionDataSource;
import com.example.matt.questionslist.questions.QuestionRepository;

import dagger.Binds;
import dagger.Module;

@Module
public interface DataModule {
    @Binds
    QuestionDataSource provideQuestionRepository(QuestionRepository repository);
}
