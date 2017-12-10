package com.example.matt.questionslist.questions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.matt.questionslist.R;
import com.example.matt.questionslist.db.Question;

import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {
    private List<Question> questions = Collections.emptyList();


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Question question = questions.get(position);
        holder.number.setText(String.valueOf(position + 1));
        holder.editText.setText(question.question);
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public void setQuestions(@NonNull List<Question> questions) {
        this.questions = questions;
        notifyDataSetChanged();
        Log.d("TAG", "setQuestions: " + questions.size());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.numberTextView)
        TextView number;

        @BindView(R.id.editText)
        EditText editText;

        @BindView(R.id.deleteButton)
        ImageButton deleteButton;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
