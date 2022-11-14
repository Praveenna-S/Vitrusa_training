package springmvc_annotation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import springmvc_annotation.model.Employee;

@Repository("userspringjdbcdao")
public class UserLoginDao implements IUserDaoIntf {

	
		JdbcTemplate template;
 
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		} 
    ResultSetExtractor<List<Employee>> resultSetExt = (rs) -> {
    	
    	
        List<Employee> list=new ArrayList<Employee>();  
        while(rs.next()){  
        Employee e=new Employee();  
        e.setId(rs.getInt(1));  
        e.setName(rs.getString(2));  
        e.setLastname(rs.getString(3));  
        e.setEmailId(rs.getString(4));  

        list.add(e); 
        }
        return list;
};

RowMapper<Employee> employeeRowMapper = (rs, rowNum) ->
new Employee(
        rs.getInt("id"),
        rs.getString("first_name"),
        rs.getString("last_name"),
        rs.getString("email")
);
 
 
    

    @Override
    public void saveHib(Employee emp) {
        // TODO Auto-generated method stub
 
    }
 
    public int save(Employee emp) {
 
        String sql = "insert into employee(first_name,last_name,email) values('"
                        +emp.getName()+"',"
                        +emp.getLastname()+",'"
                        +emp.getEmailId()+"')";  
        return template.update(sql);
    }
 
    public int update(Employee emp) {
 
        String sql = "update employee set name='"
                        +emp.getName()
                        +"', salary="+emp.getLastname()
                        +",designation='"+emp.getEmailId()
                        +"' where id="+emp.getId()+"";  
        return template.update(sql);
    }
 
    public int delete(int id) {
 
        String sql = "delete from employee where id="+id+"";  
        return template.update(sql);
    }
 
    public Employee getEmpById(int id) {
 
        String sql = "select * from employee where id=?";
        return template.queryForObject(sql, new Object[] { id}, new BeanPropertyRowMapper<Employee>(Employee.class));
 
    }
 
    // Select stmts - General Way
    public List<Employee> getAllEmployeesResultSetExtractor() {
 
        return template.query("Select * from employee", new ResultSetExtractor<List<Employee>>() {
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
 
                List<Employee> list = new ArrayList<Employee>();
                while (rs.next()) {
                    Employee e = new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setLastname(rs.getString(3));
                    e.setEmailId(rs.getString(4));
 
                    list.add(e);
                }
                return list;
            }
        });
 
    }
 
    public List<Employee> getEmployeesRowMapper() {
 
        return template.query("select * from employee", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee e = new Employee();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setLastname(rs.getString(3));
                e.setEmailId(rs.getString(4));
                return e;
            }
        });
 
    }
 
    // Select stmts - Java 8 - Maprow
 
    public List<Employee> getEmployeesJava8() {
 
        return template.query("select * from employee", (rs, row) -> {
            Employee e = new Employee();
            e.setId(rs.getInt(1));
            e.setName(rs.getString(2));
            e.setLastname(rs.getString(3));
            e.setEmailId(rs.getString(4));
            return e;
        });
 
    }
 
    // Select with seperate lambda assignment
 
    public List<Employee> getAllEmployeesResultSetExtractorLambda() {
 
        return template.query("select * from employee", resultSetExt);
 
    }
    @Override
    public List<Employee> getEmployees() {
    	
        return getAllEmployeesResultSetExtractorLambda();
    }
}