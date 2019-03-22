package com.xworkz.hibernate.repositary;

import org.hibernate.Session;

import com.xworkz.hibernate.entity.AddressEntity;
import com.xworkz.hibernate.util.HibernateUtil;

public class AddressRepositary {

	public AddressRepositary() {
	System.out.println("created.....\t" + this.getClass().getSimpleName());	
	}
	
	public void save(AddressEntity entity) {
	
		
		
		Session session=null;
		org.hibernate.Transaction tx=null;
		System.out.println("address entity\t"+entity);
		try {
			session=HibernateUtil.getFactory().openSession();
			tx= session.beginTransaction();
			
			session.save(entity);
			tx.commit();

		} catch (Exception e) {
			System.err.println("exception created :\t"+e.getMessage());
			
		}

		finally {

			session.close();
		}
	}
}
