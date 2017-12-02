package com.oclocksoftware.sqlroom.database;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.oclocksoftware.sqlroom.model.QuestionResponse;

/**
 * Created by babin on 11/23/2017.
 */
@Database(entities = {QuestionResponse.class}, version = 1)
public abstract class QuestionDatabase extends RoomDatabase {
    private static QuestionDatabase INSTANCE;

    public abstract Dao taskDao();

    private static final Object sLock = new Object();

    public static QuestionDatabase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        QuestionDatabase.class, "QuestionDatabase.db")
                        .build();
            }
            return INSTANCE;
        }
    }
}
