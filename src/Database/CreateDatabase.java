package Database;

import java.sql.*;

public class CreateDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:derby:test;create=true";
		try(	Connection connection = DriverManager.getConnection(url);
				Statement statement = connection.createStatement()){
			String sql = 
					"CREATE TABLE Users("
					+ "id INTEGER PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
					+ "name VARCHAR(30),"
					+ "pass VARCHAR(30),"
					+ "birthdate TIMESTAMP)"; 
					
			//statement.executeUpdate(sql);	
			statement.executeUpdate("INSERT INTO Users (name, pass, birthdate) VALUES ('Alex', 'pass2', '2015-10-05 01:01:10')");
			System.out.println("Success!!!");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Users");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1)+" - "+resultSet.getString(2)+" - "+resultSet.getString(3));
				
			}
		}

	}

}
