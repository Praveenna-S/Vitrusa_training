package springmvc_annotation.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import springmvc_annotation.validation.EmailIdCheck;

public class Employee {

	@Min(1)
	private int id;
	@NotNull
	@NotEmpty(message="Name must not be empty")
	private String name;
	private String lastname;
	@EmailIdCheck
	private String emailId;
	private String  selectExperienceLevel;

	public Employee(int id, String name, String lastname, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.emailId = emailId;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

	public String getSelectExperienceLevel() {
		return selectExperienceLevel;
	}

	public void setSelectExperienceLevel(String selectExperienceLevel) {
		this.selectExperienceLevel = selectExperienceLevel;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", emailId=" + emailId + "]";
	}
	
	
}