package com.oclocksoftware.sqlroom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.oclocksoftware.sqlroom.Question.QuestionContract;
import com.oclocksoftware.sqlroom.Question.QuestionPresenter;
import com.oclocksoftware.sqlroom.webservice.RequestQuestion;

import static android.support.v4.util.Preconditions.checkNotNull;

public class MainActivity extends AppCompatActivity implements QuestionContract.View{

    private QuestionContract.Presenter mPresenter;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new QuestionPresenter(mContext,this);
        if(getQuestionRequestQuery()!=null){
            mPresenter.loadQuestions(getQuestionRequestQuery());
        }
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showList() {

    }

    @Override
    public void showError() {

    }

    @Override
    public RequestQuestion getQuestionRequestQuery() {
        RequestQuestion mRequestQuestion=new RequestQuestion();
        mRequestQuestion.setExamid("14");
        mRequestQuestion.setSessionid("a95b1159afe4e6f8b552470d0650a32e");
        return mRequestQuestion;
    }

    @Override
    public void setPresenter(@NonNull QuestionContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.start();
    }
}
