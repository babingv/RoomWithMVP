package com.oclocksoftware.sqlroom.webservice;

import com.google.gson.annotations.SerializedName;

/**
 * Created by babin on 11/18/2017.
 */

public class RequestQuestion {
    @SerializedName("Examid")
    private String Examid;

    public String getExamid() {
        return Examid;
    }

    public void setExamid(String examid) {
        Examid = examid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    @SerializedName("sessionid")
    private String sessionid;
}
