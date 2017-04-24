/**
 * 
 */
package org.howsun.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.howsun.dao.BaseDao;
import org.howsun.domain.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月21日 下午8:45:31
 */
public class SpringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		/*
		Archive archive1 = applicationContext.getBean(Archive.class);
		System.out.println(archive1);
		if(archive1 != null){
			System.out.println(archive1.getId() + "\t" + archive1.getTitle());
			System.out.println(archive1.getCreated());
			System.out.println(archive1.getConfigs());
			archive1.setId(2);
			archive1.setTitle("标题2");
		}
		*/
		
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		System.out.println("dataSource == " + dataSource);

		
		SessionFactory sessionFactory = applicationContext.getBean(SessionFactory.class);
		System.out.println("sessionFactory == " + sessionFactory);
		
		BaseDao dao = applicationContext.getBean(BaseDao.class);
		System.out.println(dao.get(Category.class, 1));
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

	
	public void connection(){
		Connection connection = null;
		DataSource dataSource = null;
		try {
			connection = dataSource.getConnection();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
