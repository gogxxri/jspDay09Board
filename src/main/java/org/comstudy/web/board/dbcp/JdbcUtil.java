package org.comstudy.web.board.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	private static Connection conn;
	
	private static Connection getConnection() {// 외부에서 connection 사용할  수 있도록
		if(conn == null) {
			// web에서는 JDBC보다 아파치에서 제공하는 Jndi를 사용하는 것이 좋음
			// jdbc는 웹이 아닌 일반 어플리캐이션 환경에서도 사용 가능
			// Jndi는 톰켓에서 제공 (웹환경에서 사용하는 것이 필수)
			
		}
		return conn;
	}
	
	public void close(Connection o) {
		if( o != null)
			try {
				o.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(Statement o) {
		if( o != null)
			try {
				o.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(ResultSet o) {
		if( o != null)
			try {
				o.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn);
		close(stmt);
		close(rs);
	}
}
