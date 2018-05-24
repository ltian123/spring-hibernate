package dao.impl;

import org.hibernate.Session;

import dao.UserDao;
import entity.User;

public class UserDaoImpl2 extends GenericDaoImpl2<User, Integer> implements UserDao {

	public User selectByUsername(String username) {
		Session session=sessionFactory.getCurrentSession();
		String hql=new StringBuffer()
			.append("from User u ")
			.append("where u.username=:username ")
			.toString();
		return (User) session.createQuery(hql)
						     .setString("username", username)
						     .uniqueResult();
	}

	public User selectByUsernameAndPassword(String username, String password) {
		Session session=sessionFactory.getCurrentSession();
		String hql=new StringBuffer()
			.append("from User u ")
			.append("where u.username=:username ")
			.append("and u.password=:password ")
			.toString();
		return (User) session.createQuery(hql)
						     .setString("username", username)
						     .setString("password", password)
						     .uniqueResult();
	}

}
