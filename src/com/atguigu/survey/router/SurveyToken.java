package com.atguigu.survey.router;

public class SurveyToken {
	
	private static ThreadLocal<SurveyToken> local = new ThreadLocal<>();
	
	private Integer surveyId;
	
	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}
	
	public Integer getSurveyId() {
		return surveyId;
	}
	
	public static SurveyToken getSurveyToken() {
		return local.get();
	}
	
	public void bind(SurveyToken surveyToken) {
		local.set(surveyToken);
	}
	
	public void remove() {
		local.remove();
	}

}
