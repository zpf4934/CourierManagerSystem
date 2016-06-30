package com.agen.library.dao.proxy;

import java.util.List;

import com.agen.library.dao.IUserDAO;
import com.agen.library.dao.dbc.DataBaseConnection;
import com.agen.library.dao.impl.IUserDAOImpl;
import com.agen.library.vo.User;

/**
 * 用户信息操作接口代理类
 * @author Administrator
 *
 */
public class IUserDAOImplProxy implements IUserDAO {
	private DataBaseConnection dbc = null;
	private IUserDAO dao = null;

	public IUserDAOImplProxy() {
		this.dbc=new DataBaseConnection();
		this.dao=new IUserDAOImpl(this.dbc.getConnection());
	}

	public boolean doCreate(User user) throws Exception {
		// 增加用户信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doCreate(user);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	public boolean doUpdate(User user) throws Exception {
		// 更新用户信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doUpdate(user);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	public boolean doDelete(String id) throws Exception {
		//删除用户信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doDelete(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	public User findById(String id) throws Exception {
		//查找用户信息-ID查找(代理实现)
		User user = null;
		try {
			user = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return user;
	}

	public List<User> findAll(String keyword) throws Exception {
		//查找用户信息-关键字查找(代理实现)
		List<User> all = null;
		try {
			all = this.dao.findAll(keyword);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return all;
	}

	public User findByIds(String id) throws Exception {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user = this.dao.findByIds(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return user;
	}

}
