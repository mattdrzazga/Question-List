package com.example.matt.questionslist.questions;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.example.matt.questionslist.db.Question;

import java.util.List;

import javax.inject.Inject;


public class MainViewModel extends ViewModel {
    private LiveData<List<Question>> questionLiveData;
    QuestionDataSource questionRepository;

    @Inject public MainViewModel(QuestionDataSource repository) {
        questionRepository = repository;
        questionLiveData = repository.getQuestions();
    }

    public LiveData<List<Question>> getQuestionLiveData() {
        return questionLiveData;
    }

    public void newQuestion() {
        questionRepository.newQuestion();
    }
}
