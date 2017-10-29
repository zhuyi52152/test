package com.singon.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class APIContext {

	static private APIContext apiContext = new APIContext();
	private ThreadLocal<HttpServletRequest> currentHttpRequest = new ThreadLocal<HttpServletRequest>();
	private ThreadLocal<HttpServletResponse> currentHttpResponse = new ThreadLocal<HttpServletResponse>();
//	private ThreadLocal<UserInfo> currentToken = new ThreadLocal<UserInfo>();//用户token信息绑定
	Logger log = LoggerFactory.getLogger(APIContext.class);
	
	static public APIContext getInstance() {
		return apiContext;
	}

	public ThreadLocal<HttpServletRequest> getCurrentHttpRequest() {
		return currentHttpRequest;
	}

	public void setCurrentHttpRequest(ThreadLocal<HttpServletRequest> currentHttpRequest) {
		this.currentHttpRequest = currentHttpRequest;
	}

	public ThreadLocal<HttpServletResponse> getCurrentHttpResponse() {
		return currentHttpResponse;
	}

	public void setCurrentHttpResponse(ThreadLocal<HttpServletResponse> currentHttpResponse) {
		this.currentHttpResponse = currentHttpResponse;
	}

//	public ThreadLocal<UserInfo> getCurrentToken() {
//		log.info("currentToken:" + currentToken);
//		return currentToken;
//	}
//
//	public void setCurrentToken(ThreadLocal<UserInfo> currentToken) {
//		this.currentToken = currentToken;
//	}

	
}
