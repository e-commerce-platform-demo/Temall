package cn_tm_Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private static Connection conn = null;
	private BaseDao(){}
	static{
		System.out.println("我只执行了一次");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn  = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Tmall", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getconn(){
		return conn;
	}
	
	public static void close(PreparedStatement sta,ResultSet rs){		
		try {
			if(rs != null){
				rs.close();
			}
			if(sta != null){
				sta.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
