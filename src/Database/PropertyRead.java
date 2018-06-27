package Database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.sql.*;

public class PropertyRead {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("C:\\Users\\User\\eclipse-workspace\\GitHub\\Basis\\src\\Database\\db.property"));
			for (Map.Entry<Object, Object> entry :properties.entrySet()) {
				System.out.println(entry.toString());
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			return;
			// TODO: handle exception
		}
		
		String url = properties.getProperty("db.url");
		String sql = "SELECT * FROM " + properties.getProperty("db.table");
		System.out.println(sql);
		Connection connection = DriverManager.getConnection(url);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1)+" - " + resultSet.getString(2)+" - " + resultSet.getString(3)+" - " + resultSet.getString(4)+" - ");
			
		}
		
	}
}
