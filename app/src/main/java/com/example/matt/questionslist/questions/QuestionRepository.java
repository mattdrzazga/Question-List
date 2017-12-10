package com.example.matt.questionslist.questions;


import android.arch.lifecycle.LiveData;

import com.example.matt.questionslist.db.AppDatabase;
import com.example.matt.questionslist.db.Question;
import com.example.matt.questionslist.db.QuestionDao;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class QuestionRepository implements QuestionDataSource {
    final AppDatabase appDatabase;

    @Inject
    public QuestionRepository() {
        appDatabase = AppDatabase.getInstance();
    }

    @Override
    public LiveData<List<Question>> getQuestions() {
        return appDatabase.questionDao().getAll();
    }

    @Override
    public void newQuestion() {
        final QuestionDao dao = appDatabase.questionDao();
        Completable.fromAction(() -> dao.insert(new Question()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(() -> {
                });
    }
}
