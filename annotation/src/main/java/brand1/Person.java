package brand1;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	 private int personalId;
	 
	 @Autowired
	 private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
}
