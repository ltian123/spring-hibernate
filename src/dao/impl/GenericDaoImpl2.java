package dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.GenericDao;

public abstract class GenericDaoImpl2<E extends Serializable,PK extends Serializable> implements GenericDao<E, PK> {

	protected Class<E> entityClass;
	protected SessionFactory sessionFactory;
	
	public GenericDaoImpl2() {
		entityClass=(Class<E>) ((ParameterizedType)(this.getClass()
										                .getGenericSuperclass()))
										           .getActualTypeArguments()[0];
	}

	public void delete(E e) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(e);
	}

	public void deleteById(PK id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(session.get(entityClass, id));
	}

	public void insert(E e) {
		Session session=sessionFactory.getCurrentSession();
		session.save(e);
	}

	public List<E> selectAll() {
		Session session=sessionFactory.getCurrentSession();
		return session.createCriteria(entityClass)
					  .list();
	}

	public E selectById(PK id) {
		Session session=sessionFactory.getCurrentSession();
		return (E) session.get(entityClass, id);
	}

	public void update(E e) {
		Session session=sessionFactory.getCurrentSession();
		session.update(e);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
