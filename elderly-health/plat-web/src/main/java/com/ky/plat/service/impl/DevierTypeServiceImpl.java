package com.ky.plat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ky.plat.bean.DevierType;
import com.ky.plat.exception.ServiceException;
import com.ky.plat.mapper.DevierTypeMapper;
import com.ky.plat.service.DevierTypeService;

@Service("devierTypeService")
public class DevierTypeServiceImpl implements DevierTypeService{
	
	@Autowired
	private DevierTypeMapper devierTypeMapper;
	
	public List<DevierType> queryAllList() throws ServiceException{
		try{
			return devierTypeMapper.queryAllList();
		}catch(Exception ex){
			throw new ServiceException(ex);
		}
	}
}
