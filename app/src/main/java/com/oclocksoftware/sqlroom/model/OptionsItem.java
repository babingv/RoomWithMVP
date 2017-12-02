package com.oclocksoftware.sqlroom.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OptionsItem{

	@SerializedName("Contenttype")
	@Expose
	private String contenttype;

	@SerializedName("Value")
	@Expose
	private List<String> value;

	@SerializedName("Option")
	@Expose
	private String option;

	public void setContenttype(String contenttype){
		this.contenttype = contenttype;
	}

	public String getContenttype(){
		return contenttype;
	}

	public void setValue(List<String> value){
		this.value = value;
	}

	public List<String> getValue(){
		return value;
	}

	public void setOption(String option){
		this.option = option;
	}

	public String getOption(){
		return option;
	}
}