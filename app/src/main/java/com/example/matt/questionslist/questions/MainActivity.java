package com.example.matt.questionslist.questions;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.matt.questionslist.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
    @BindView(R.id.questions)
    RecyclerView questions;

    QuestionAdapter questionAdapter = new QuestionAdapter();
    private MainViewModel mainViewModel;

    @Inject
    SharedPreferences sp;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate: " + sp);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        questions.setAdapter(questionAdapter);
        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel.class);
        mainViewModel.getQuestionLiveData().observe(this, questions -> questionAdapter.setQuestions(questions));
    }

    @OnClick(R.id.floatingActionButton)
    public void addNew() {
        mainViewModel.newQuestion();
    }
}
