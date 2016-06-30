package com.agen.library.dao;

import java.util.List;
/**
 * 用户信息操作接口
 */
import com.agen.library.vo.User;

public interface IUserDAO {
	/**
	 * 数据库的增加操作
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(User user)throws Exception;
	/**
	 * 数据库的更新操作
	 * @param book
	 * @return
	 * @throws Exception
	 */
	public boolean doUpdate(User user)throws Exception;
	/**
	 * 数据库的删除操作
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public boolean doDelete(String id)throws Exception;
	/**
	 * 数据库的查找操作(按id查找)
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findById(String id)throws Exception;
	/**
	 * 数据库的查找操作(按关键字查找)
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public User findByIds(String id)throws Exception;
	public List<User> findAll(String keyword)throws Exception;

}
