package com.singon.common;


/**
 * 
* @ClassName: APIConstants 
* @Description: 公共常量类
* @author zjr 
* @date 2016年9月12日 上午10:05:28 
*
 */
public class APIConstants {
	
	public static final String _TOKEN = "TOKEN";
	
	/*
	 * APIResult常量
	 */
	public static final String SUCCESS = "0";
	public static final String SUCCESS_DETAILS = "OK";
	
	public static final String FAIL = "1";
	public static final String FAIL_DETAILS = "失败";
	
	public static final String NOTLOGIN = "2";
	public static final String NOTLOGIN_DETAILs = "未登录";
	
	public static final String RELOGIN = "3";
	public static final String RELOGIN_DETAILs = "由于长时间未操作，需重新新登录";
	
	public static final String ISILLEGAL_REQUEST = "-1";
	public static final String ISILLEGAL_REQUESTDETAILs = "请求非法，予以拦截";
	
	//登录方式
	public static final String LOGIN_TYPE_BD = "0";
	public static final String LOGIN_TYPE_QQ = "1";
	public static final String LOGIN_TYPE_WX = "2";
	
	
}
