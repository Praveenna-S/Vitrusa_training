package com.c2.embed;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class School {
    private int schoolId;
    private String schoolName;

private SchoolDetail schoolDetail;

@Id
@GeneratedValue
    public int getSchoolId() {
        return schoolId;
    }
    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    @Embedded
    public SchoolDetail getSchoolDetail() {
        return schoolDetail;
    }
    public void setSchoolDetail(SchoolDetail schoolDetail) {
        this.schoolDetail = schoolDetail;
    }






}