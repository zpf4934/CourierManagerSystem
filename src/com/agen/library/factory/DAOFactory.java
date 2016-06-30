package com.agen.library.factory;

import com.agen.library.dao.IBorrowDAO;
import com.agen.library.dao.IUserDAO;
import com.agen.library.dao.proxy.IBorrowDAOImplProxy;
import com.agen.library.dao.proxy.IUserDAOImplProxy;

/**
 * 创建工厂类
 * 
 * @author Administrator
 * 
 */

public class DAOFactory {
	
	public static IBorrowDAO getIBorrowDAOInstance() {
		//借阅信息操作工厂
		return new IBorrowDAOImplProxy();
	}

	public static IUserDAO getIUserDAOInstance() {
		//用户信息操作工厂
		return new IUserDAOImplProxy();
	}

}
