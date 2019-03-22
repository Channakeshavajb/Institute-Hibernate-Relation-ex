package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.entity.TrainerEntity;
import com.xworkz.hibernate.repositary.TrainerRepositary;
import com.xworkz.hibernate.util.HibernateUtil;

public class TrainerTester {

	public static void main(String[] args) {
		
		TrainerEntity entity=new TrainerEntity();
		entity.setName("madhu");
		entity.setGoodIn("java");
		entity.setExp(3);
		
		System.out.println(entity);
		TrainerRepositary repositary=new TrainerRepositary();
		repositary.save(entity);
		HibernateUtil.getFactory().close();
		
		
	}

}
