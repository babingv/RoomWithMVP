package com.oclocksoftware.sqlroom.database;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.oclocksoftware.sqlroom.model.QuestionResponse;

import java.util.List;

/**
 * Created by babin on 11/23/2017.
 */
@android.arch.persistence.room.Dao
public interface Dao {

    @Query("SELECT * FROM QuestionResponse")
    QuestionResponse getQuestion();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTask(QuestionResponse task);

    @Update
    int updateTask(QuestionResponse task);
}
