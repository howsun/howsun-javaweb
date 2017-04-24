/**
 * 
 */
package org.howsun.embeddb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月22日 上午9:18:20
 */
public class JDBCtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection("jdbc:hsqldb:file:mydb", "SA", "");
			String createSQL = "create table person ("
					+ "id integer not null generated always as identity (start with 1, increment by 1),   "
					+ "name varchar(30) not null, email varchar(30), " 
					+ "phone varchar(10),"
					+ "constraint primary_key primary key (id))";

			stmt = connection.createStatement();
			stmt.execute(createSQL);

			pstmt = connection.prepareStatement("insert into person(name,email,phone) values(?,?,?)");

			pstmt.setString(1, "Hagar the Horrible");
			pstmt.setString(2, "hagar@somewhere.com");
			pstmt.setString(3, "1234567890");
			pstmt.executeUpdate();

			rs = stmt.executeQuery("select * from person");
			while (rs.next()) {
				System.out.printf("%d %s %s %s\n",
						rs.getInt(1), 
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4));
			}

			stmt.execute("drop table person");

			System.out.println(connection.getSchema());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
