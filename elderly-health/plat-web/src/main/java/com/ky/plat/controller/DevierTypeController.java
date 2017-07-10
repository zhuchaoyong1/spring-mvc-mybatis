package com.ky.plat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ky.plat.bean.DevierType;
import com.ky.plat.bean.RspStatus;
import com.ky.plat.exception.ServiceException;
import com.ky.plat.pojo.Result;
import com.ky.plat.service.DevierTypeService;

@Controller
public class DevierTypeController extends ExceptionController{
	
	@Autowired
	private DevierTypeService devierTypeService;
	
	@RequestMapping(value = "/get" ,method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result get() throws Exception{
		Result ret = new Result();
		try{
			List<DevierType> list = devierTypeService.queryAllList();
			ret.setData(list);
		}catch(Exception ex){
			throw ex;
		}
		return ret;
	}
	
	@RequestMapping(value = "/exce" ,method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public Result exce() throws ServiceException{
		throw new ServiceException(RspStatus.FAIL_501,"测试spring 异常集中处理。。。。");
	}
}
