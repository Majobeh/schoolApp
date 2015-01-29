package com.school.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name ="Student")
@XmlRootElement(name ="Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="StudentNumber")
	private long  Studentno;
	
	@Column(name="StudentName")
	private String Studname;
	
	@Column(name="StudentSurname")
	private String StudentSurname;
	
	@Column(name="StudentGender")
	private String StudGender;
	
	@Column(name="StudentAdress")
	private String StudAdress;
	
	@Column(name="StudentRace")
	private String StudRace;
	
	@Column(name="StudentEmail")
	private String StudEmail;
	
    @Column(name="StudentPassword")
	private String Studpassword;
	
	@Column(name="StudentGrade")
	private String StudGrade;
	
	@Column(name="StudentYear")
	private String StudYear;
	
	@ManyToOne
	@JoinColumn(name="staffNo")
	private Teacher teacher;
	
	
	
	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student() {
	}
	
	
	public Student(String studname, String studentSurname, String studGender,
			String studAdress, String studRace, String studEmail,
			String studpassword, String studGrade, String studYear) {
		Studname = studname;
		StudentSurname = studentSurname;
		StudGender = studGender;
		StudAdress = studAdress;
		StudRace = studRace;
		StudEmail = studEmail;
		Studpassword = studpassword;
		StudGrade = studGrade;
		StudYear = studYear;
	}

	public long getStudentno() {
		return Studentno;
	}
	public void setStudentno(long studentno) {
		Studentno = studentno;
	}
	public String getStudname() {
		return Studname;
	}
	public void setStudname(String studname) {
		Studname = studname;
	}
	public String getStudentSurname() {
		return StudentSurname;
	}
	public void setStudentSurname(String studentSurname) {
		StudentSurname = studentSurname;
	}
	public String getStudGender() {
		return StudGender;
	}
	public void setStudGender(String studGender) {
		StudGender = studGender;
	}
	public String getStudAdress() {
		return StudAdress;
	}
	public void setStudAdress(String studAdress) {
		StudAdress = studAdress;
	}
	public String getStudRace() {
		return StudRace;
	}
	public void setStudRace(String studRace) {
		StudRace = studRace;
	}
	public String getStudEmail() {
		return StudEmail;
	}
	public void setStudEmail(String studEmail) {
		StudEmail = studEmail;
	}
	public String getStudpassword() {
		return Studpassword;
	}
	public void setStudpassword(String studpassword) {
		Studpassword = studpassword;
	}
	public String getStudGrade() {
		return StudGrade;
	}
	public void setStudGrade(String studGrade) {
		StudGrade = studGrade;
	}
	public String getStudYear() {
		return StudYear;
	}
	public void setStudYear(String studYear) {
		StudYear = studYear;
	}
	
	
	

	
	

}
