package com.school.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {
	
	private static final EntityManagerFactory entityManangerFactory=createEntity();

	private static EntityManagerFactory createEntity() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Nomsa");
		return emf;
	}
	public static  EntityManagerFactory provideEntity()
	{
		return entityManangerFactory;
	}
	
	

}
