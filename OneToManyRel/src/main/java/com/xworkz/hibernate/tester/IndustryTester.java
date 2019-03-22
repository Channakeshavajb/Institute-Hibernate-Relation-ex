package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.entity.IndustryEntity;
import com.xworkz.hibernate.repositary.IndustryRepositary;
import com.xworkz.hibernate.repositary.JobRepositary;

public class IndustryTester {

	public static void main(String[] args) {
		
		
		IndustryEntity entity=new IndustryEntity();
		entity.setName("xworkz");
		entity.setLocation("rajajinagar");
		entity.setTechnology("java");
		
		IndustryRepositary industryRepositary=new IndustryRepositary();
		industryRepositary.save(entity);
	}

}
