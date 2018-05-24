package dao;

import org.springframework.dao.DataAccessException;

import entity.User;

/**
 * 用户数据访问对象
 * @author 李恒
 *
 */
public interface UserDao extends GenericDao<User, Integer> {
	/**
	 * 根据用户名查询一个用户
	 * @param username 用户名
	 * @return 封装了用户信息的用户对象，如果不存在返回null
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public User selectByUsername(String username);
	
	/**
	 * 根据用户名和密码查询一个用户
	 * @param username 用户名
	 * @param password 密码
	 * @return 封装了用户信息的用户对象，如果不存在返回null
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public User selectByUsernameAndPassword(String username,String password);
}

