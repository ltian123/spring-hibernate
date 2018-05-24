package dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 * 通用的数据访问对象
 * @author 李恒
 *
 * @param <E> 实体类型
 * @param <PK> 主键类型
 */
public interface GenericDao<E extends Serializable,PK extends Serializable> {
	/**
	 * 保存一个实体对象
	 * @param e 实体对象
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public void insert(E e);
	
	/**
	 * 根据主键删除
	 * @param id 主键
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public void deleteById(PK id);
	
	/**
	 * 删除一个对象
	 * @param e 实体对象
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public void delete(E e);
	
	/**
	 * 更新一个对象
	 * @param e 实体对象
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public void update(E e);
	
	/**
	 * 根据主键查询一个对象
	 * @param id 主键
	 * @return 实体对象，如果不存在返回null
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public E selectById(PK id);
	
	/**
	 * 查询所有对象
	 * @return 实体对象集合，如果不存在返回空集合
	 * @throws DataAccessException 数据访问失败异常，当此持久化操作未成功时，抛出此异常
	 */
	public List<E> selectAll();
}
