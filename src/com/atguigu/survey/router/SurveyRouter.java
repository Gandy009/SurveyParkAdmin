package com.atguigu.survey.router;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class SurveyRouter extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		
		//1.从当前线程上获取Token
		SurveyToken token = SurveyToken.getSurveyToken();
		
		//2.读取surveyId的值
		if(token != null) {
			Integer surveyId = token.getSurveyId();
			
			//3.将token对象从当前线程上移除
			token.remove();
			
			return (surveyId % 2 == 0)?"even":"odd";
		}
		
		return null;
	}

}
