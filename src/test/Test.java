package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import entity.User;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		
		UserDao userDao=(UserDao) ac.getBean("userDao2");
		
		
//		User user=new User();
//		user.setUsername("bbb");
//		user.setPassword("222");
//		
//		userDao.insert(user);
		
		User user=userDao.selectByUsername("abc");
		
		System.out.println(user.getId());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		
		
		
		
//		DataSource dataSource=(DataSource) ac.getBean("dataSource");
//		
//		Connection con=dataSource.getConnection();
//		
//		System.out.println(con);
//		System.out.println(con.hashCode());
//		
//		con.close();
//		
//		
//		
//		Connection con2=dataSource.getConnection();
//		
//		System.out.println(con2);
//		System.out.println(con2.hashCode());
//		
//		Connection con3=dataSource.getConnection();
//		
//		System.out.println(con3);
//		System.out.println(con3.hashCode());
//		
//		con2.close();
		
		
		
		
		
	}
}
