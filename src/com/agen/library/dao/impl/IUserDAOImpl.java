package com.agen.library.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.agen.library.dao.IUserDAO;
import com.agen.library.vo.User;

/**
 * 用户信息操作接口实现类
 * @author Administrator
 *
 */
public class IUserDAOImpl implements IUserDAO {
	private Connection conn=null;
	public IUserDAOImpl(Connection conn){
		this.conn=conn;
	}
	public boolean doCreate(User user) throws Exception {
		//增加用户信息
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO library_user(login_id,name ,pass,is_admin)VALUES(?,?,?,?)";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, user.getLogin_id());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPass());
			pstmt.setInt(4, user.getIs_admin());
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

	public boolean doUpdate(User user) throws Exception {
		//更新用户信息
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "UPDATE library_user SET pass=?,is_admin=? WHERE login_id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, user.getPass());
			pstmt.setInt(2, user.getIs_admin());
			pstmt.setString(3,user.getLogin_id());
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

	public boolean doDelete(String id) throws Exception {
		//删除用户信息
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM library_user WHERE login_id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, id);
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

	public User findById(String id) throws Exception {
		//查找用户信息-ID查找
		User user = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM library_user WHERE name=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				//user.setId(rs.getInt(1));
				user.setLogin_id(rs.getString(1));
				user.setName(rs.getString(2));
				user.setPass(rs.getString(3));
				user.setIs_admin(rs.getInt(4));
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
		return user;
	}

	public List<User> findAll(String keyword) throws Exception {
		//查找用户信息-关键字查找
		List<User> all=new ArrayList<User>();
		PreparedStatement pstmt = null;
		String sql="SELECT login_id,name,pass,is_admin FROM library_user WHERE name LIKE ? OR login_id LIKE ?";
		try{
			pstmt=this.conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setString(2, "%"+keyword+"%");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				User user = new User();
				//user.setId(rs.getInt(1));
				user.setLogin_id(rs.getString(1));
				user.setName(rs.getString(2));
				user.setPass(rs.getString(3));
				user.setIs_admin(rs.getInt(4));
				all.add(user);
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
	public User findByIds(String id) throws Exception {
		// TODO Auto-generated method stub
		User user = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM library_user WHERE login_id=?";
		try {
			pstmt = this.conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				//user.setId(rs.getInt(1));
				user.setLogin_id(rs.getString(1));
				user.setName(rs.getString(2));
				user.setPass(rs.getString(3));
				user.setIs_admin(rs.getInt(4));
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
		return user;
	}



}
