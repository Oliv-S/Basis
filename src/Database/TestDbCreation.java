package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbCreation {
	public static void main(String... args) throws SQLException {
		String url = "jdbc:derby:test;create=true";
		String sql = "CREATE TABLE User2("
				+ "id INT not null primary key" 
				+ "        GENERATED ALWAYS AS IDENTITY" 
				+ "        (START WITH 1, INCREMENT BY 1),"
				+ "name VARCHAR(30),"
				+ "pass VARCHAR(30))";
		
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		//statement.executeUpdate(sql);
		statement.executeUpdate("INSERT INTO User2 (name, pass) VALUES ('alex', 'pass1')");
		statement.executeUpdate("INSERT INTO User2 (name, pass) VALUES ('alex2', 'pass13')");
		statement.executeUpdate("INSERT INTO User2 (name, pass) VALUES ('alex3', 'pass14')");
		statement.executeUpdate("INSERT INTO User2 (name, pass) VALUES ('alex4', 'pass15')");
		ResultSet resultSet = statement.executeQuery("SELECT count(*) FROM User2");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1));
		}
	}

}
