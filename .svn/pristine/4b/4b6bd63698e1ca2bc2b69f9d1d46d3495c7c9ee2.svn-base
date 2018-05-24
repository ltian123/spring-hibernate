package dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.GenericDao;

public abstract class GenericDaoImpl<E extends Serializable,PK extends Serializable> extends HibernateDaoSupport implements GenericDao<E, PK> {

	protected Class<E> entityClass;
	
	public GenericDaoImpl() {
		entityClass=(Class<E>) ((ParameterizedType)(this.getClass()
										                .getGenericSuperclass()))
										           .getActualTypeArguments()[0];
	}
	
	public void delete(E e) {
		getHibernateTemplate().delete(e);
	}

	public void deleteById(PK id) {
		getHibernateTemplate().delete(getHibernateTemplate().get(entityClass, id));
	}

	public void insert(E e) {
		getHibernateTemplate().save(e);
	}

	public List<E> selectAll() {
		return getHibernateTemplate().loadAll(entityClass);
	}

	public E selectById(PK id) {
		return (E) getHibernateTemplate().get(entityClass, id);
	}

	public void update(E e) {
		getHibernateTemplate().update(e);
	}

}
