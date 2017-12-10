package com.example.matt.questionslist.db;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

@Database(entities = {Question.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DATABASE_NAME = "tuku-tuku.db";

    public abstract QuestionDao questionDao();

    private static AppDatabase sInstance;

    public static AppDatabase getInstance() {
        if (sInstance == null) throw new IllegalStateException("You must first initialize database!");
        return sInstance;
    }

    public static AppDatabase init(@NonNull final Context context) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sInstance = Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME)
                            .build();
                }
            }
        }
        return sInstance;
    }
}
