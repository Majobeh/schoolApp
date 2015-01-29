package com.school.pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Teacher")
@XmlRootElement(name = "Teacher")
@XmlAccessorType(XmlAccessType.FIELD)
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="StaffNumber")
	private long staffNo;
	
	@Column(name="TeacherName")
	private String TeachName;
	
	@Column(name="TeacherSurname")
	private String TeachSurname;
	
	@Column(name="TeacherGender")
	private String TeachGender;
	
	@Column(name="TeacherGrade")
	private String TeachGrade;
	
	@Column(name="TeacherSubject")
	private String TeachSubject;
	
	@Column(name="TeacherContact")
	private String TeachContact;
	
	@Column(name="TeacherRace")
	private String TeachRace;
	
	@Column(name="TeacherEmail")
	private String TeachEmail;
	
	@Column(name="TeacherAdress")
	private String TeachAdress;
	
	 @OneToMany(targetEntity=Student.class,mappedBy="teacher",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	//@OneToMany( mappedBy="teacher")
	 private Set<Student>students; 
	 
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Teacher(){
		
	}
	public Teacher( String teachName, String teachSurname,
			String teachGender, String teachGrade, String teachSubject,
			String teachContact, String teachRace, String teachEmail,
			String teachAdress) {
		
		TeachName = teachName;
		TeachSurname = teachSurname;
		TeachGender = teachGender;
		TeachGrade = teachGrade;
		TeachSubject = teachSubject;
		TeachContact = teachContact;
		TeachRace = teachRace;
		TeachEmail = teachEmail;
		TeachAdress = teachAdress;
	}
	public long getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(long staffNo) {
		this.staffNo = staffNo;
	}
	public String getTeachName() {
		return TeachName;
	}
	public void setTeachName(String teachName) {
		TeachName = teachName;
	}
	public String getTeachSurname() {
		return TeachSurname;
	}
	public void setTeachSurname(String teachSurname) {
		TeachSurname = teachSurname;
	}
	public String getTeachGender() {
		return TeachGender;
	}
	public void setTeachGender(String teachGender) {
		TeachGender = teachGender;
	}
	public String getTeachGrade() {
		return TeachGrade;
	}
	public void setTeachGrade(String teachGrade) {
		TeachGrade = teachGrade;
	}
	public String getTeachSubject() {
		return TeachSubject;
	}
	public void setTeachSubject(String teachSubject) {
		TeachSubject = teachSubject;
	}
	public String getTeachContact() {
		return TeachContact;
	}
	public void setTeachContact(String teachContact) {
		TeachContact = teachContact;
	}
	public String getTeachRace() {
		return TeachRace;
	}
	public void setTeachRace(String teachRace) {
		TeachRace = teachRace;
	}
	public String getTeachEmail() {
		return TeachEmail;
	}
	public void setTeachEmail(String teachEmail) {
		TeachEmail = teachEmail;
	}
	public String getTeachAdress() {
		return TeachAdress;
	}
	public void setTeachAdress(String teachAdress) {
		TeachAdress = teachAdress;
	}
	
	
	
	
	
	
	
	
	

	

}
