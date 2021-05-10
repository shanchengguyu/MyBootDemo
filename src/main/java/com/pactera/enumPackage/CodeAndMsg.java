package com.pactera.enumPackage;

/**
 * @author James
 * @date 2021/5/8
 * @decription
 */
public enum CodeAndMsg {
	SUCCESS(1000, "SUCCESS"),
	METHODFAIL(2000, "ENCOUNTER AN ERROR WHEN EXECUTE METHOD"),
	UNKNOWEXCEPTION(3000, "THIS IS AN UNKNOW EXCEPTION"),
	EXCEPTION(4000,"SERVER EXCEPTION");

	private int code;
	private String msg;

	CodeAndMsg(int code, String msg){
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
	
}
