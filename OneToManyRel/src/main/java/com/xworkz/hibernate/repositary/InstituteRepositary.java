package com.xworkz.hibernate.repositary;

import org.hibernate.Session;

import com.xworkz.hibernate.entity.InstituteEntity;
import com.xworkz.hibernate.util.HibernateUtil;

public class InstituteRepositary {

	public InstituteRepositary() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}
	
	public void save(InstituteEntity entity) {
		
		Session session=null;
		org.hibernate.Transaction tx=null;
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
