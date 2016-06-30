package com.agen.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.agen.library.dao.IBorrowDAO;
import com.agen.library.util.DateUtil;
import com.agen.library.vo.Receive;
import com.agen.library.vo.Send;

/**
 * 借阅信息操作接口实现类
 * @author Administrator
 *
 */
public class IBorrowDAOImpl implements IBorrowDAO {
	private Connection conn = null;
	public IBorrowDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public boolean doCreate(Receive borrow) throws Exception {
		//增加借阅信息
		boolean flag = false;
		Date date = DateUtil.getStringToDate(DateUtil.getDate());
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO receive(id,name ,managerid,signs,receivedate,receivephone,"
				+ "receivename,receiveadress,scanid,sends,sendname,dotime,doname,signtime,"
				+ "settlement,cost,daicost,yingcost,shicost,"
				+ "beizhu,riqi)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, borrow.getId());
			pstmt.setString(2, borrow.getname());
			pstmt.setInt(3, borrow.getmanagerid());
			pstmt.setString(4, borrow.getsigns());
			pstmt.setString(5, borrow.getreceivedate());
			pstmt.setString(6, borrow.getreceivephone());
			pstmt.setString(7, borrow.getreceivename());
			pstmt.setString(8, borrow.getreceiveadress());
			pstmt.setString(9, borrow.getscanid());
			pstmt.setString(10, borrow.getsends());
			pstmt.setString(11,borrow.getsendname());
			pstmt.setString(12,borrow.getdotime());
			pstmt.setString(13, borrow.getdoname());
			pstmt.setString(14, borrow.getsigntime());
			pstmt.setString(15, borrow.getsettlement());
			pstmt.setFloat(16, borrow.getcost());
			pstmt.setFloat(17,borrow.getdaicost());
			pstmt.setFloat(18,borrow.getyingcost());
			pstmt.setFloat(19, borrow.getshicost());
			pstmt.setString(20, borrow.getbeizhu());
			pstmt.setDate(21,new java.sql.Date(date.getTime()));
			if (pstmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e) {
			}
		}

		return flag;
	}
	
	public boolean doSend(Send send) throws Exception {
		//增加借阅信息
		boolean flag = false;
		Date date = DateUtil.getStringToDate(DateUtil.getDate());
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO send(id,name ,sendtime,sendname,sendphone,sendadress,"
				+ "senddanwei,receivename,receivephone,receivedanwei,receiveadress,"
				+ "price,sheng,shi,quxian,signs,neirong,zhongliang,yunfei,settlement,"
				+ "managerid,scanid,beizhu,riqi)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, send.getid());
			pstmt.setString(2, send.getname());
			pstmt.setString(3, send.getjijianshijian());
			pstmt.setString(4, send.getjijianxingming());
			pstmt.setString(5, send.getjijiandianhua());
			pstmt.setString(6, send.getjijiandizhi());
			pstmt.setString(7, send.getjijiandanwei());
			pstmt.setString(8, send.getshoujianxingming());
			pstmt.setString(9, send.getshoujiandianhua());
			pstmt.setString(10, send.getshoujiandanwei());
			pstmt.setString(11,send.getshoujiandizhi());
			pstmt.setFloat(12,send.getjiage());
			pstmt.setString(13, send.getsheng());
			pstmt.setString(14, send.getshi());
			pstmt.setString(15, send.getxian());
			pstmt.setString(16, send.getsigns());
			pstmt.setString(17, send.getneirong());
			pstmt.setFloat(18,send.getzhong());
			pstmt.setFloat(19,send.getyunfei());
			pstmt.setString(20, send.getsettlement());
			pstmt.setString(21, send.getdoname());
			pstmt.setString(22, send.getscanid());
			pstmt.setString(23, send.getbeizhu());
			pstmt.setDate(24,new java.sql.Date(date.getTime()));
			if (pstmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e) {
			}
		}

		return flag;
	}

	public boolean doUpdate(Receive borrow) throws Exception {
		//更新借阅信息
		/*
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "UPDATE receive SET book_id=?,borrow_date=?,back_date=?,is_back=? WHERE reader_id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, borrow.getBook_id());
			pstmt.setDate(2, new java.sql.Date(borrow.getBorrow_date().getTime()));
			pstmt.setDate(3, new java.sql.Date(borrow.getBack_date().getTime()));
			pstmt.setInt(4, borrow.getIs_back());
			pstmt.setString(5, borrow.getReader_id());
			if (pstmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e) {
			}
		}

		return flag;
		*/
		return true;
	}
	

	public boolean doDelete(int id) throws Exception {
		//删除借阅信息
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM receive WHERE id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			if (pstmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e) {
			}
		}

		return flag;
	}

	public Receive findById(String id) throws Exception {
		// 查找借阅信息-ID查找
		Receive borrow = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM receive WHERE reader_id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				borrow = new Receive();
				//borrow.setId(rs.getInt(1));
				//borrow.setReader_id(rs.getString(1));
				//borrow.setBook_id(rs.getString(2));
			//	borrow.setBorrow_date(rs.getDate(3));
			//	borrow.setBack_date(rs.getDate(4));
			//	borrow.setIs_back(rs.getInt(5));
			}
			rs.close();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e) {
			}
		}
		return borrow;
	}
	

	public Receive findById(int id) throws Exception {
		// 查找借阅信息-ID查找
		Receive borrow = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM receive WHERE reader_id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				borrow = new Receive();
				//borrow.setId(rs.getInt(1));
				//borrow.setReader_id(rs.getString(1));
			//	borrow.setBook_id(rs.getString(2));
				//borrow.setBorrow_date(rs.getDate(3));
				//borrow.setBack_date(rs.getDate(4));
			//	borrow.setIs_back(rs.getInt(5));
			}
			rs.close();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (Exception e) {
			}
		}
		return borrow;
	}

	public List<Receive> findAll(String keyword) throws Exception {
		//查找借阅信息-关键字查找
		List<Receive> all=new ArrayList<Receive>();
		PreparedStatement pstmt = null;
		String sql="SELECT reader_id,book_id,borrow_date,back_date,is_back FROM receive WHERE reader_id LIKE ? OR book_id LIKE ? OR borrow_date LIKE ? OR back_date LIKE ? OR is_back LIKE ?";
		try{
			pstmt=this.conn.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword+"%");
			pstmt.setString(2, "%"+keyword+"%");
			pstmt.setString(3, "%"+keyword+"%");
			pstmt.setString(4, "%"+keyword+"%");
			pstmt.setString(5, "%"+keyword+"%");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Receive borrow = new Receive();
				//borrow.setId(rs.getInt(1));
				//borrow.setReader_id(rs.getString(1));
				//borrow.setBook_id(rs.getString(2));
				//borrow.setBorrow_date(rs.getDate(3));
				//borrow.setBack_date(rs.getDate(4));
				//borrow.setIs_back(rs.getInt(5));
				//all.add(borrow);
			}
			rs.close();
		}catch(Exception e){
		  throw e;
		}finally{
			try{
				if(pstmt!=null){
					pstmt.close();
				}
				
			}catch(Exception e){}
		}
		return all;
	}

}
