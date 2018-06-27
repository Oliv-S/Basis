package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class TestDbConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:derby:test";
		String sql = "SELECT * FROM Users";
		
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		System.out.println(resultSet);
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString(2));
		}

	}

}
