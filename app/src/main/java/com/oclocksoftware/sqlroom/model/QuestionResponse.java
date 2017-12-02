package com.oclocksoftware.sqlroom.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "QuestionResponse")
public class QuestionResponse {

	@SerializedName("Questions")
	@Embedded
	private Questions questions;

	public void setQuestions(Questions questions){
		this.questions = questions;
	}

	public Questions getQuestions(){
		return questions;
	}
}