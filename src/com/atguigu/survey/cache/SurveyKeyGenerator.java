package com.atguigu.survey.cache;

import java.lang.reflect.Method;

import org.springframework.cache.interceptor.KeyGenerator;

public class SurveyKeyGenerator implements KeyGenerator{

	@Override
	public Object generate(Object target, Method method, Object... params) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(target.getClass().getName()).append(".");
		
		sb.append(method.getName()).append(".");
		
		if(params != null) {
			for (Object param : params) {
				sb.append(param).append(".");
			}
		}
		
		return sb.substring(0, sb.lastIndexOf("."));
	}

}
