package com.pactera.exception;

import com.pactera.enumPackage.CodeAndMsg;

/**
 * @author James
 * @date 2021/5/8
 * @decription
 */
public class MyException extends RuntimeException{
	private int code;
	
	private String msg;

	public MyException() {
	}

	public MyException(CodeAndMsg exception) {
		this.code = exception.getCode();
		this.msg=exception.getMsg();
	}

	public MyException(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MyException{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				'}';
	}
}
