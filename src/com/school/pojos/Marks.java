package com.school.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Marks")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) 
public class Marks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MarkId")
	private long markId;
	
	
	//@Column(name="SubjectName")
    //private String subjName;
	
	@Column(name="SubjectName")
	private String marksSubjectname;
	
	@Column(name="DateReleased")
	private Date DateReleased;
	
	
	public Marks() {}

	public Marks(String marksSubjectname, Date dateReleased) {
		this.marksSubjectname = marksSubjectname;
		DateReleased = dateReleased;
	}
	
	public String getMarksSubjectname() {
		return marksSubjectname;
	}
	public void setMarksSubjectname(String marksSubjectname) {
		this.marksSubjectname = marksSubjectname;
	}
	public Date getDateReleased() {
		return DateReleased;
	}
	public void setDateReleased(Date dateReleased) {
		DateReleased = dateReleased;
	}
	
	

}
