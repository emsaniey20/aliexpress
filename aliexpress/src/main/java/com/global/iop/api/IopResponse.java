package com.global.iop.api;

import com.global.iop.infra.mapping.AeDefaultErrorField;
import com.global.iop.infra.mapping.DefaultErrorField;

import java.io.Serializable;
import java.util.Map;

/**
 * International Open Platform API basic response.
 * 
 * @author carver.gu
 * @since Feb 4, 2018
 */
public class IopResponse implements Serializable {

	private static final long serialVersionUID = 5014379068811962022L;

	@DefaultErrorField("type")
	@AeDefaultErrorField("type")
	private String gopErrorType;
	@DefaultErrorField("code")
	@AeDefaultErrorField(value = "code")
	private String gopErrorCode;
	@DefaultErrorField("message")
	@AeDefaultErrorField("msg")
	private String gopErrorMessage;
	@AeDefaultErrorField("sub_code")
	private String gopErrorSubCode;
	@AeDefaultErrorField("sub_msg")
	private String gopErrorSubMsg;
	@AeDefaultErrorField("request_id")
	@DefaultErrorField("request_id")
	private String gopRequestId;
	private String gopResponseBody;

	private Map<String, String> gopRequestParams;

	/**
	 * API请求URL(不包含body)
	 */
	private String gopRequestUrl;

	public Map<String, String> getGopRequestParams() {
		return gopRequestParams;
	}

	public void setGopRequestParams(Map<String, String> gopRequestParams) {
		this.gopRequestParams = gopRequestParams;
	}

	public String getGopRequestUrl() {
		return gopRequestUrl;
	}

	public void setGopRequestUrl(String gopRequestUrl) {
		this.gopRequestUrl = gopRequestUrl;
	}

	public String getGopErrorSubCode() {
		return gopErrorSubCode;
	}

	public void setGopErrorSubCode(String gopErrorSubCode) {
		this.gopErrorSubCode = gopErrorSubCode;
	}

	public String getGopErrorSubMsg() {
		return gopErrorSubMsg;
	}

	public void setGopErrorSubMsg(String gopErrorSubMsg) {
		this.gopErrorSubMsg = gopErrorSubMsg;
	}

	public String getGopErrorType() {
		return gopErrorType;
	}

	public void setGopErrorType(String gopErrorType) {
		this.gopErrorType = gopErrorType;
	}

	public String getGopErrorCode() {
		return gopErrorCode;
	}

	public void setGopErrorCode(String gopErrorCode) {
		this.gopErrorCode = gopErrorCode;
	}

	public String getGopErrorMessage() {
		return gopErrorMessage;
	}

	public void setGopErrorMessage(String gopErrorMessage) {
		this.gopErrorMessage = gopErrorMessage;
	}

	public String getGopRequestId() {
		return gopRequestId;
	}

	public void setGopRequestId(String gopRequestId) {
		this.gopRequestId = gopRequestId;
	}

	public String getGopResponseBody() {
		return gopResponseBody;
	}

	public void setGopResponseBody(String gopResponseBody) {
		this.gopResponseBody = gopResponseBody;
	}

	public boolean isSuccess() {
		return  gopErrorCode == null
				|| "".equals(gopErrorCode)
				|| "0".equals(gopErrorCode);
	}

}
