
package cop2805;

import java.sql.*;

public class HomeworkSeven {

	public static void main(String[] args) {
		
		Connection connection;
		try {
			ResultSet results = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","cop2805");
			//TODO: Run a select statement and print out the ResultSet
			Statement statement = connection.createStatement();
			ResultSet resultSet = null;
			resultSet = statement.executeQuery("SELECT * FROM Employees;");
			
			while (resultSet.next()) // LOOP FOR RESULT SET
			{
				int id = resultSet.getInt("employeeId");
				String firstName = resultSet.getString("firstName");
				String lastName = resultSet.getString("lastName");
				String space = " ";
				System.out.println(id +":"+ space + firstName + space + lastName + "\n"); // OUTPUT
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
