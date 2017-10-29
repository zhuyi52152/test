package com.singon.common;


@SuppressWarnings("serial")
public class APIError extends RuntimeException {
	String code;
	String details;
	
	public APIError() {
		
	}
	
	public APIError(String code) {
		
	}
	
	public APIError(String code, String details) {
		this.code = code;
		this.details = details;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append("code:").append(code).append(" description:").append(details);

		return ret.toString();
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public APIError clone() {
		APIError error = new APIError();
		error.setCode(this.code);
		error.setDetails(this.details);
		return error;

	}
	
	
}
