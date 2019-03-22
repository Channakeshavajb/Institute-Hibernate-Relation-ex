package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.entity.AddressEntity;
import com.xworkz.hibernate.repositary.AddressRepositary;
import com.xworkz.hibernate.util.HibernateUtil;

public class AddressTester {

	public static void main(String[] args) {

		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setCity("bangalore");
		addressEntity.setPincode(573006);
		addressEntity.setState("karnataka");
		
		System.out.println("entity in main\t" + addressEntity);
		
		AddressRepositary addressRepositary = new AddressRepositary();
		addressRepositary.save(addressEntity);
		
		HibernateUtil.getFactory().close();
	}

}
