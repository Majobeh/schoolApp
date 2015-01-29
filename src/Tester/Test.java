package Tester;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.school.pojos.Marks;
import com.school.pojos.Student;
import com.school.pojos.Teacher;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nomsa");
		EntityManager em= emf.createEntityManager();
		
		
		
		
		//Student stud = new Student ("Slindokuhle","Kohliso","Female","04011","Coloured","sli@gmail.com","75856","grade 11","2010");
		//Student stud = new Student ("Dakalo","Ndou","male","bella","venda","dk@gmail.com","8520","grade 12","2013");
		//Student stud = new Student ("Cedric","tzavanyendza","female","bella","Limpopo","cd@gmail.com","2589","grade 10","2012");
		Student stud = new Student ("Pat","Thile","male","Parrow","Bloomfontein","pat@gmail.com","9632","grade twelve","2046");
		
		
		//Teacher Teac = new Teacher("Mama","Jobe","female","grade 9","Maths","0874596874","white","mama@gmail.com","Mashu");
	//Teacher teac2=new Teacher("Paul","Walker","male","12","Geography","0874596120","Indian","pwalker@outlook.com","Durban");
		//Teacher tea=new Teacher("Snothando","Zungu","female","15","biology","076985214","african","pwalker@outlook.com","Pinetown");
		//Teacher tea=new Teacher("Mbalie","zuma","female","10","Geography","0123654789","white","pwalker@outlook.com","Eascourt");
		Teacher tea=new Teacher("Nomusa","Sithole","Female","ten","maths","0214659871","Indian","nomsa@outlook.com","Mooiriver");
		
		Marks mark = new Marks();
		mark.setMarksSubjectname("Maths");
		mark.setDateReleased (new Date());
		
		
		
		stud.setTeacher(tea);
		
		  em.getTransaction().begin();
		 // em.persist(Teac);
		  em.persist(tea);
		  em.persist(stud);
		  em.persist(mark);
		  em.getTransaction().commit(); 
		  
		  
		
	}

}
