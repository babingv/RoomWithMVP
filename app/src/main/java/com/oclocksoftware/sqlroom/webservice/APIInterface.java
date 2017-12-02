package com.oclocksoftware.sqlroom.webservice;

import com.oclocksoftware.sqlroom.model.QuestionResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by babin on 11/17/2017.
 */

public interface APIInterface {
    @GET("api/getQuestions.php?")
    Call<QuestionResponse> doGetListResources(@Query("Examid") String examid, @Query("sessionid") String sessionid);
}
