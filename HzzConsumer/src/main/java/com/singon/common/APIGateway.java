package com.singon.common;

import java.io.IOException;
import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import net.sf.json.JSONObject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.DispatcherServlet;



public class APIGateway extends DispatcherServlet{

	Logger log = LoggerFactory.getLogger(APIGateway.class);
	private static final long serialVersionUID = -2158848818840768937L;

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		APIContext.getInstance().getCurrentHttpRequest().set(request);
		APIContext.getInstance().getCurrentHttpResponse().set(response);
		
		try{
			//header头伪码验证，过滤非法请求
			String path = request.getRequestURI();
			log.info(" user request:"+path);
//	        if(true){
	        	log.info("API access name:{}", path);
	        	@SuppressWarnings("unchecked")
				Enumeration<String> params = request.getParameterNames();
	        	while(params.hasMoreElements()) {
	        		String param = params.nextElement();
	        		log.info("the valoe of param [{}] is [{}]", param, request.getParameter(param));
	        	}
	        	long serviceStartTime = System.currentTimeMillis();
    			super.service(request, response);
    			log.info("API of '{}' execute {} 毫秒", path, (System.currentTimeMillis() - serviceStartTime));
    			
//	        } else {
//	        	log.error("date{"+date+"}"+",path{"+xpath+"}"+",key{"+vaKey+"}");
	        	// 请求非法，予以拦截
//				JSONObject m = new JSONObject();
//				m.put("code", APIConstants.ISILLEGAL_REQUEST);
//				m.put("details", APIConstants.ISILLEGAL_REQUESTDETAILs);
//				response.getWriter().write(new JSONSerializer().serialize(m));
//	        }

			
		}catch(Exception e) {
			if(e.getCause() instanceof APIError)
			{
				APIError error = (APIError)(e.getCause());
//				Map<String,Object> m = new HashMap<String, Object>();
//				m.put("code", error.getCode());
//				m.put("details", error.getDetails());
				response.getWriter().write(error.getDetails());
			} else {
				log.error(e.toString());
				for(StackTraceElement ste : e.getStackTrace()){
					log.error("\tat "+ste);
				}
				throw new RuntimeException(e);
			}
		}
		
		
	}
	 


}
