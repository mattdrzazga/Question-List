package com.example.matt.questionslist.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.support.annotation.NonNull;

import java.util.List;

@Dao
public interface QuestionDao {
    @Query("SELECT * FROM question")
    LiveData<List<Question>> getAll();

    @Insert
    void insertAll(@NonNull Question... questions);

    @Insert
    void insert(@NonNull Question question);

    @Update
    void update(@NonNull Question question);

    @Delete
    void delete(@NonNull Question question);

}
