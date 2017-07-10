package com.ky.plat.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ky.plat.bean.RspStatus;
import com.ky.plat.exception.ServiceException;
import com.ky.plat.pojo.Result;

public class ExceptionController {
	
	@ExceptionHandler
	@ResponseBody
	public Result exec(HttpServletRequest request, Exception ex){
		if(ex instanceof ServiceException){
			ServiceException se = (ServiceException)ex;
			return new Result(se.getErrCode(), se.getMessage());
		}
		return new Result(RspStatus.FAIL_201,ex.getMessage());
	}
}
