package com.oclocksoftware.sqlroom.model;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;
import android.arch.persistence.room.TypeConverters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.oclocksoftware.sqlroom.converters.QuestionsItemConverter;

@TypeConverters(QuestionsItemConverter.class)
public class Questions{

	@SerializedName("ShowExaplanation")
	@Expose
	private String showExaplanation;

	@SerializedName("ExamDuration")
	@Expose
	private String examDuration;

	@SerializedName("Questions")
	@Expose
	private List<QuestionsItem> questions;

	@SerializedName("ExamId")
	@Expose
	private String examId;

	@SerializedName("ExamName")
	@Expose
	private String examName;

	@SerializedName("ShowReference")
	@Expose
	private String showReference;

	public void setShowExaplanation(String showExaplanation){
		this.showExaplanation = showExaplanation;
	}

	public String getShowExaplanation(){
		return showExaplanation;
	}

	public void setExamDuration(String examDuration){
		this.examDuration = examDuration;
	}

	public String getExamDuration(){
		return examDuration;
	}

	public void setQuestions(List<QuestionsItem> questions){
		this.questions = questions;
	}

	public List<QuestionsItem> getQuestions(){
		return questions;
	}

	public void setExamId(String examId){
		this.examId = examId;
	}

	public String getExamId(){
		return examId;
	}

	public void setExamName(String examName){
		this.examName = examName;
	}

	public String getExamName(){
		return examName;
	}

	public void setShowReference(String showReference){
		this.showReference = showReference;
	}

	public String getShowReference(){
		return showReference;
	}
}