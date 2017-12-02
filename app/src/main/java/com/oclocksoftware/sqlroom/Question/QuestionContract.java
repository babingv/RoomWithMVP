package com.oclocksoftware.sqlroom.Question;

import com.oclocksoftware.sqlroom.BasePresenter;
import com.oclocksoftware.sqlroom.BaseView;
import com.oclocksoftware.sqlroom.webservice.RequestQuestion;

/**
 * Created by babin on 11/17/2017.
 */

public interface QuestionContract {

    interface View extends BaseView<Presenter> {
        void setLoadingIndicator(boolean active);

        void showList();

        void showError();

        RequestQuestion getQuestionRequestQuery();

    }

    interface Presenter extends BasePresenter {

        void loadQuestions(RequestQuestion questionRequestQuery);

    }
}
