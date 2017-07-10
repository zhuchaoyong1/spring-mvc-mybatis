package com.ky.plat.pojo;

import java.io.Serializable;

import com.ky.plat.bean.RspStatus;

public class Result implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private int retCode = RspStatus.SUCCESS_200;
	
	private Object data;
	
	private String errMsg;
	
	private Object other;
	
	public Result(){
		
	}
	
	public Result(int retCode){
		this.retCode = retCode;
	}
	public Result(int retCode,Object data){
		this(retCode);
		this.data = data;
	}
	
	public Result(int retCode,String errMsg){
		this(retCode);
		this.errMsg = errMsg;
	}
	
	public Result(int retCode,String errMsg,Object data){
		this(retCode,errMsg);
		this.data = data;
	}
	
	public Result(int retCode,String errMsg,Object data,Object other){
		this(retCode,errMsg,data);
		this.other = other;
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Object getOther() {
		return other;
	}

	public void setOther(Object other) {
		this.other = other;
	}
}
