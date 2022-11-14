package N1db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import N1model.Employee;


public class EmployeeDAOImpl {

	public EmployeeDAOImpl() {}
	
	public boolean createTableDB() 
	{
		String mysqlDBUrl="jdbc:mysql://localhost:3306/dbuniversity";
		String username="root";
		String pwd="veenna!06";
		
		Connection conn=null;
		Statement stmt =null;
		
		String createquery="CREATE TABLE DEPARTMENT(\r\n"
				+ "ID INT AUTO_INCREMENT NOT NULL,\r\n"
				+ "DEPT_NAME VARCHAR(50) NOT NULL,\r\n"
				+ "PRIMARY KEY(ID)\r\n"
				+ ");";
		
		
		try
		{
		conn=DriverManager.getConnection(mysqlDBUrl,username,pwd);
		
		stmt=conn.createStatement();
		
		stmt.executeUpdate(createquery);
		}
		
		catch (SQLException e) {


	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    finally {

	        try {
	            if(stmt!=null) {
	                stmt.close();
	                }
	                if(conn!=null) {
	                conn.close();
	                }
	        } catch (SQLException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	    }
		return true;
	}
		
		public boolean insertTableDB()
		{
			String mysqlDBUrl="jdbc:mysql://localhost:3306/dbuniversity";
			String username="root";
			String pwd="veenna!06";
			
			
			Connection conn=null;
		    PreparedStatement stmt = null;

		    try {
		    conn = DriverManager.getConnection(mysqlDBUrl, username, pwd);
		    stmt = conn.prepareStatement("insert into department(DEPT_NAME) values(?)");
		    stmt.setString(1, "Data science");
		    int status =    stmt.executeUpdate();
		    System.out.println("data inserted: "+status);
		    } 
		    catch (SQLException e) {

		        try {
		            stmt.close();
		            conn.close();
		        } catch (SQLException e1) {
		            // TODO Auto-generated catch block
		            e1.printStackTrace();
		        }
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    
			
		return true;
				
	}
		
		
		public Employee selectFromDB(String name)

{
			String mysqlDBUrl="jdbc:mysql://localhost:3306/dbuniversity";
			String username="root";
			String pwd="veenna!06";
			ResultSet rs=null;
			Employee empobj=null;
			try(Connection conn = DriverManager.getConnection(mysqlDBUrl, username, pwd);
				    PreparedStatement stmt = conn.prepareStatement("select first_name from employee where id=(?)");
					)
			{
				stmt.setString(1, name);
				rs=stmt.executeQuery();
				while(rs.next())
				{
					empobj.setName(rs.getString(1));
					System.out.println("first name: "+rs.getString(1));
				}
				
			}
			catch(SQLException excep) {
		        System.out.println(" Excep occurred"+excep.getMessage());

		    }
}
}
