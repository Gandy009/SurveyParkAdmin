package com.atguigu.survey.e;

/**
 * 声明自定义异常，用来表示在删除调查时遇到了外键约束失败的问题
 * @author Creathin
 *
 */
public class CascadDelSurveyException extends RuntimeException{

	private static final long serialVersionUID = 1L;

}
