package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.entity.JobEntity;
import com.xworkz.hibernate.repositary.JobRepositary;

public class JobTester {

	public static void main(String[] args) {
		
		JobEntity entity=new JobEntity();
		entity.setName("teaching");
		entity.setTechnology("java");
		entity.setExperience(3);
		
		JobRepositary jobRepositary=new JobRepositary();
		jobRepositary.save(entity);

	}

}
