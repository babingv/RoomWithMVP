package com.oclocksoftware.sqlroom.converters;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oclocksoftware.sqlroom.model.QuestionsItem;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by babin on 12/2/2017.
 */

public class QuestionsItemConverter {
    @TypeConverter
    public static ArrayList<QuestionsItem> stringToQuestionItem(String value) {
        Type listType = new TypeToken<ArrayList<QuestionsItem>>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String QuestionItemToString(ArrayList<String> list) {
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
}
