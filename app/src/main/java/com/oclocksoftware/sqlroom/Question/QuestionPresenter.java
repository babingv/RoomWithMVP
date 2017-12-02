package com.oclocksoftware.sqlroom.Question;

import android.content.Context;
import android.util.Log;

import com.oclocksoftware.sqlroom.database.QuestionDatabase;
import com.oclocksoftware.sqlroom.model.QuestionResponse;
import com.oclocksoftware.sqlroom.model.Questions;
import com.oclocksoftware.sqlroom.webservice.APIClient;
import com.oclocksoftware.sqlroom.webservice.APIInterface;
import com.oclocksoftware.sqlroom.webservice.RequestQuestion;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by babin on 11/17/2017.
 */

public class QuestionPresenter implements QuestionContract.Presenter {

    private final QuestionContract.View mQuestionView;
    APIInterface apiInterface;
    private QuestionDatabase database;
    private Context mContext;

    public QuestionPresenter(Context mContext, QuestionContract.View mQuestionView) {
        this.mQuestionView=mQuestionView;
        this.mContext=mContext;
        database = QuestionDatabase.getInstance(this.mContext);
    }

    @Override
    public void loadQuestions(RequestQuestion questionRequestQuery) {
        APIInterface apiConnection = APIClient.getClient().create(APIInterface.class);
        Log.d(":::::","::::"+questionRequestQuery.toString());
        Call<QuestionResponse> call = apiConnection.doGetListResources("14","a95b1159afe4e6f8b552470d0650a32e");
        call.enqueue(new Callback<QuestionResponse>() {
            @Override
            public void onResponse(Call<QuestionResponse> call, Response<QuestionResponse> response) {
                if (response.body() != null) {
                    Log.d(":::::","::::"+response.body().getQuestions());
                    Questions question=response.body().getQuestions();
                    if(question!=null){
                        String exam_name=question.getExamName();
                        Log.d(":::::","::::"+exam_name);



                    }
                    //mQuestionView.onAPIRegisterSuccess();
                } else {
                   // iRegistrationView.onAPIRegisterFailed("Invalid response");
                }
            }

            @Override
            public void onFailure(Call<QuestionResponse> call, Throwable t) {
                //iRegistrationView.onAPIRegisterFailed("Failed");
            }
        });

    }

    @Override
    public void start() {

    }
}
