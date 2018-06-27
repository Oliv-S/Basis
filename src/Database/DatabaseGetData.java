package Database;

import java.sql.*;

public class DatabaseGetData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:derby:test";
		try(	Connection connection = DriverManager.getConnection(url);
				Statement statement = connection.createStatement()){
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Users");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)+" - "+resultSet.getString(2)+" - "+resultSet.getString(3)+" - "+resultSet.getString(4));
			}				
		}
	}
}
