package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.entity.InstituteEntity;
import com.xworkz.hibernate.repositary.InstituteRepositary;
import com.xworkz.hibernate.util.HibernateUtil;

public class InstituteTester {

	public static void main(String[] args) {

		InstituteEntity entity = new InstituteEntity();
		entity.setName("xworkz");
		entity.setNoOfTechnology(5);
		entity.setTechnology("java");

		InstituteRepositary repositary = new InstituteRepositary();
		repositary.save(entity);
		HibernateUtil.getFactory().close();

	}

}
