/**
 * 
 */
package org.howsun.embeddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.howsun.domain.Category;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月22日 上午8:58:18
 */
public class HibernateTest {

	Session session;
	Statement st;
	
	public HibernateTest() throws Exception{
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		/**/
		// Load the JDBC driver.
		Class.forName("org.hsqldb.jdbcDriver");
		System.out.println("Driver Loaded.");
		// Establish the connection to the database.
		String url = "jdbc:hsqldb:file:mydb";
		
		Category category = new Category();
		category.setName("军事");
		session.save(category);

		
	}
	
	public Session getSession(){
		return session;
	}
	
	public void executeSQLCommand(String sql) throws Exception {
		st.executeUpdate(sql);
	}

	public void checkData(String sql) throws Exception {
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData metadata = rs.getMetaData();

		for (int i = 0; i < metadata.getColumnCount(); i++) {
			System.out.print("\t"+ metadata.getColumnLabel(i + 1)); 
		}
		System.out.println("\n----------------------------------");

		while (rs.next()) {
			for (int i = 0; i < metadata.getColumnCount(); i++) {
				Object value = rs.getObject(i + 1);
				if (value == null) {
					System.out.print("\t       ");
				} else {
					System.out.print("\t"+value.toString().trim());
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		try {
			HibernateTest test = new HibernateTest();
			test.executeSQLCommand("create table survey (id int,name varchar);");
			test.checkData("");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
