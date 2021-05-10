package com.pactera.domain;

/**
 * @author James
 * @date 2021/5/8
 * @decription
 */
public class CallResultMsg<T> {
	private boolean result;
	private int code;
	private String message;
	private T data;

	public CallResultMsg(boolean result, int code, String message, T data) {
		this.result = result;
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CallResultMsg{" +
				"result=" + result +
				", code=" + code +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}
}
