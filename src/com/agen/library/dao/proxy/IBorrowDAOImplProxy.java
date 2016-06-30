package com.agen.library.dao.proxy;

import java.util.List;

import com.agen.library.dao.IBorrowDAO;
import com.agen.library.dao.dbc.DataBaseConnection;
import com.agen.library.dao.impl.IBorrowDAOImpl;
import com.agen.library.vo.Receive;
import com.agen.library.vo.Send;

/**
 * 借阅信息操作接口代理类
 * @author Administrator
 *
 */
public class IBorrowDAOImplProxy implements IBorrowDAO {
	private DataBaseConnection dbc = null;
	private IBorrowDAO dao = null;

	public IBorrowDAOImplProxy() {
		this.dbc = new DataBaseConnection();
		this.dao = new IBorrowDAOImpl(this.dbc.getConnection());
	}

	public boolean doCreate(Receive borrow) throws Exception {
		// 增加借阅信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doCreate(borrow);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}
/*
	public boolean doUpdate(Receive borrow) throws Exception {
		// 更新借阅信息(代理实现)
		boolean flag = true;
		try {
			flag = this.dao.doUpdate(borrow);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

	public boolean doDelete(int id) throws Exception {
		// 删除借阅信息(代理实现)
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

	public Receive findById(String id) throws Exception {
		//查找借阅信息-ID查找(代理实现)
		Receive borrow = null;
		try {
			borrow = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return borrow;
	}

	public Receive findById(int id) throws Exception {
		//查找借阅信息-ID查找(代理实现)
		Receive borrow = null;
		try {
			borrow = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return borrow;
	}
	
	public List<Receive> findAll(String keyword) throws Exception {
		//查找借阅信息-关键字查找(代理实现)
		List<Receive> all = null;
		try {
			all = this.dao.findAll(keyword);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return all;
	}*/

	public boolean doSend(Send send) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = true;
		try {
			flag = this.dao.doSend(send);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
		return flag;
	}

}
