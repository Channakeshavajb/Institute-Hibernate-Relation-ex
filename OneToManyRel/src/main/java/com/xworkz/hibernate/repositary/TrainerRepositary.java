package com.xworkz.hibernate.repositary;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.entity.TrainerEntity;
import com.xworkz.hibernate.util.HibernateUtil;

public class TrainerRepositary {

	public TrainerRepositary() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void save(TrainerEntity entity) {

		Session session = null;
		org.hibernate.Transaction tx = null;
		try {
			System.out.println("save invoked with\t" + entity);
			session = HibernateUtil.getFactory().openSession();
			tx = session.beginTransaction();
			session.save(entity);
			tx.commit();

		} catch (Exception e) {
			System.err.println("exception created :\t" + e.getMessage());

		}

		finally {

			session.close();
		}
	}

}
