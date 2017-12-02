package com.oclocksoftware.sqlroom.model;

import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.oclocksoftware.sqlroom.converters.OptionsItemConverter;
import com.oclocksoftware.sqlroom.model.OptionsItem;
@TypeConverters(OptionsItemConverter.class)
public class QuestionsItem{

	@SerializedName("Options")
	@Expose
	private List<OptionsItem> options;

	@SerializedName("userStatus")
	@Expose
	private int userStatus;

	@SerializedName("ExplanationsContenttype")
	@Expose
	private String explanationsContenttype;

	@SerializedName("userAnswer")
	@Expose
	private String userAnswer;

	@SerializedName("Contenttype")
	@Expose
	private String contenttype;

	@SerializedName("Explanations")
	@Expose
	private List<Object> explanations;

	@SerializedName("UserAnswervalue")
	@Expose
	private List<Object> userAnswervalue;

	@SerializedName("CorrectAnswervalue")
	@Expose
	private List<String> correctAnswervalue;

	@SerializedName("Question")
	@Expose
	private List<String> question;

	@SerializedName("AnswerType")
	@Expose
	private String answerType;

	@SerializedName("Id")
	@Expose
	private String id;

	@SerializedName("CorrectAnswer")
	@Expose
	private String correctAnswer;

	@SerializedName("refrences")
	@Expose
	private String refrences;

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}

	public void setUserStatus(int userStatus){
		this.userStatus = userStatus;
	}

	public int getUserStatus(){
		return userStatus;
	}

	public void setExplanationsContenttype(String explanationsContenttype){
		this.explanationsContenttype = explanationsContenttype;
	}

	public String getExplanationsContenttype(){
		return explanationsContenttype;
	}

	public void setUserAnswer(String userAnswer){
		this.userAnswer = userAnswer;
	}

	public String getUserAnswer(){
		return userAnswer;
	}

	public void setContenttype(String contenttype){
		this.contenttype = contenttype;
	}

	public String getContenttype(){
		return contenttype;
	}

	public void setExplanations(List<Object> explanations){
		this.explanations = explanations;
	}

	public List<Object> getExplanations(){
		return explanations;
	}

	public void setUserAnswervalue(List<Object> userAnswervalue){
		this.userAnswervalue = userAnswervalue;
	}

	public List<Object> getUserAnswervalue(){
		return userAnswervalue;
	}

	public void setCorrectAnswervalue(List<String> correctAnswervalue){
		this.correctAnswervalue = correctAnswervalue;
	}

	public List<String> getCorrectAnswervalue(){
		return correctAnswervalue;
	}

	public void setQuestion(List<String> question){
		this.question = question;
	}

	public List<String> getQuestion(){
		return question;
	}

	public void setAnswerType(String answerType){
		this.answerType = answerType;
	}

	public String getAnswerType(){
		return answerType;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCorrectAnswer(String correctAnswer){
		this.correctAnswer = correctAnswer;
	}

	public String getCorrectAnswer(){
		return correctAnswer;
	}

	public void setRefrences(String refrences){
		this.refrences = refrences;
	}

	public String getRefrences(){
		return refrences;
	}
}