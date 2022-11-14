package N1db;

public class EmployeeMain {
	public static void main(String[] args)
	{
		EmployeeDAOImpl empdao=new EmployeeDAOImpl();
		empdao.createTableDB();	
		empdao.insertTableDB();
		}

}
