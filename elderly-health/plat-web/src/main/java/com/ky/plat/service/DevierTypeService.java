package com.ky.plat.service;

import java.util.List;

import com.ky.plat.bean.DevierType;
import com.ky.plat.exception.ServiceException;


public interface DevierTypeService {
	
	public List<DevierType> queryAllList() throws ServiceException;
}
