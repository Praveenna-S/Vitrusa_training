package com.c4.annotation.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class PersonDetail {

private int    personDetailId;
private int    zipCode;
private String    job;
@Id
@GeneratedValue
@Column(name="persondetail_pk")
public int getPersonDetailId() {
    return personDetailId;
}
public void setPersonDetailId(int personDetailId) {
    this.personDetailId = personDetailId;
}
public int getZipCode() {
    return zipCode;
}
public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
}
public String getJob() {
    return job;
}
public void setJob(String job) {
    this.job = job;
}

 
}