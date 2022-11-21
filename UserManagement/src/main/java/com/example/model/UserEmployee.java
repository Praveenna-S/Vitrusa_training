package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEmployee {
		@Id
		@Column
	 	private int userId;
		private String firstName;
	    private String lastName;
	    private String emailId;
	    
	    public UserEmployee() {}
	    
	    public UserEmployee(int userId, String firstName, String lastName, String emailId) { 
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
		}
	    
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
}
