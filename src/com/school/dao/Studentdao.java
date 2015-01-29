package com.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;






import com.school.pojos.Marks;
import com.school.pojos.Student;
import com.school.pojos.Teacher;
import com.school.utility.Utility;


public class Studentdao {
	
	
	EntityManagerFactory emf = null;
	 EntityManager em = null;
	 
	 public void saveTeacher (Teacher teacher)
	 {
		 emf = Utility.provideEntity();
		 em= emf.createEntityManager();
		 em.getTransaction().begin();
		 em.persist(teacher);
		 em.getTransaction().commit();
		 em.close();
	 }

	 
	 public void saveStudent (Student student)
	 {
		 emf = Utility.provideEntity();
		 em= emf.createEntityManager();
		 em.getTransaction().begin();
		 em.persist(student);
		 em.getTransaction().commit();
		 em.close();
	 }
	 
	 public void saveMarks (Marks marks)
	 {
		 emf = Utility.provideEntity();
		 em= emf.createEntityManager();
		 em.getTransaction().begin();
		 em.persist(marks);
		 em.getTransaction().commit();
		 em.close();
	 }
	 
	 
	
}

