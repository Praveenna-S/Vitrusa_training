package com.c5.annotation.onetomany;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

   private int collegeId;
   private String collegeName;
   List<Student> studentList;

   @Id
   @GeneratedValue
   public int getCollegeId() {
       return collegeId;
   }

   public void setCollegeId(int collegeId) {
       this.collegeId = collegeId;
   }

   public String getCollegeName() {
       return collegeName;
   }

   public void setCollegeName(String collegeName) {
       this.collegeName = collegeName;
   }

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "college", 
           fetch = FetchType.EAGER,targetEntity =Student.class )
   public List<Student> getStudentList() {
       return studentList;
   }

   public void setStudentList(List<Student> studentList) {
       this.studentList = studentList;
   }

}
