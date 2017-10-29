/**
 * 
 */
package com.singon.controller;

/**
 * @author cavly
 *
 */
public class ResultMsg  {

	
	private String msgCode = "0";
	
	private boolean result = true;
	
	private String message = "操作成功!";
	
	private Object resultObj;

	/**
	 * @return the msgCode
	 */
	public String getMsgCode() {
		return msgCode;
	}

	/**
	 * @param msgCode the msgCode to set
	 */
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}

	/**
	 * @return the result
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(boolean result) {
		this.result = result;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the resultObj
	 */
	public Object getResultObj() {
		return resultObj;
	}

	/**
	 * @param resultObj the resultObj to set
	 */
	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	
	
}
