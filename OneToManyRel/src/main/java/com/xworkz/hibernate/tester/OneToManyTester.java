package com.xworkz.hibernate.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hibernate.entity.AddressEntity;
import com.xworkz.hibernate.entity.IndustryEntity;
import com.xworkz.hibernate.entity.InstituteEntity;
import com.xworkz.hibernate.entity.JobEntity;
import com.xworkz.hibernate.entity.TrainerEntity;
import com.xworkz.hibernate.repositary.InstituteRepositary;

public class OneToManyTester {

	public static void main(String[] args) {
		
		InstituteEntity instituteEntity=new InstituteEntity();
		instituteEntity.setName("odc");
		instituteEntity.setTechnology("java");
		instituteEntity.setNoOfTechnology(3);
	
		TrainerEntity trainerEntity=new TrainerEntity();
		trainerEntity.setName("a");
		trainerEntity.setGoodIn("java");
		trainerEntity.setExp(9);
		
		TrainerEntity trainerEntity1=new TrainerEntity();
		trainerEntity1.setName("b");
		trainerEntity1.setGoodIn("jdbc");
		trainerEntity1.setExp(9);
		
		TrainerEntity trainerEntity12=new TrainerEntity();
		trainerEntity12.setName("c");
		trainerEntity12.setGoodIn("servlet");
		trainerEntity12.setExp(9);
		
		TrainerEntity trainerEntity3=new TrainerEntity();
		trainerEntity3.setName("d");
		trainerEntity3.setGoodIn("jsp");
		trainerEntity3.setExp(9);
		
		JobEntity jobEntity=new JobEntity();
		jobEntity.setName("fullstack-developer");
		jobEntity.setTechnology("js");
		jobEntity.setExperience(3);
		
		IndustryEntity industryEntity=new IndustryEntity();
		industryEntity.setName("microsoft");
		industryEntity.setTechnology("phython");
		industryEntity.setLocation("whitefield");
		
		AddressEntity addressEntity=new AddressEntity();
		addressEntity.setCity("blr");
		addressEntity.setState("karnataka");
		addressEntity.setPincode(573909);
		
		AddressEntity addressEntity1=new AddressEntity();
		addressEntity1.setCity("rj-nagar");
		addressEntity1.setState("karnataka");
		addressEntity1.setPincode(573258);
		
		List<TrainerEntity> listTrainer=new ArrayList<TrainerEntity>();
		listTrainer.add(trainerEntity);
		listTrainer.add(trainerEntity1);
		listTrainer.add(trainerEntity12);
		listTrainer.add(trainerEntity3);
		
		//mapping reference in institute
		instituteEntity.setAddressEntity(addressEntity);
		instituteEntity.setTrainer(listTrainer);
		
		
		//mapping reference in trainer
		trainerEntity.setAddressEntity(addressEntity1);
		trainerEntity.setInstituteEntity(instituteEntity);
		trainerEntity.setJobEntity(jobEntity);
		
		trainerEntity1.setAddressEntity(addressEntity1);
		trainerEntity1.setInstituteEntity(instituteEntity);
		trainerEntity1.setJobEntity(jobEntity);
		
		trainerEntity12.setAddressEntity(addressEntity1);
		trainerEntity12.setInstituteEntity(instituteEntity);
		trainerEntity12.setJobEntity(jobEntity);
		
		trainerEntity3.setAddressEntity(addressEntity1);
		trainerEntity3.setInstituteEntity(instituteEntity);
		trainerEntity3.setJobEntity(jobEntity);
		
		//mapping reference in job
		jobEntity.setIndustryEntity(industryEntity);
		jobEntity.setTrainerEntity(trainerEntity);
		
		//mapping reference in industry
		industryEntity.setJobEntity(jobEntity);
		
		//Address
		addressEntity.setInstituteEntity(instituteEntity);
		addressEntity1.setTrainerEntity(trainerEntity);
		
		InstituteRepositary inst=new InstituteRepositary();
		inst.save(instituteEntity);
		
		
		
	}

}
