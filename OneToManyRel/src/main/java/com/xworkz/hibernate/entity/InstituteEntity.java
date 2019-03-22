package com.xworkz.hibernate.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "institute")
public class InstituteEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "I_id")
	private Integer id;
	@Column(name = "I_name")
	private String name;
	@Column(name = "I_location")
	private int noOfTechnology;
	@Column(name = "I_technology")
	private String technology;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "institute")
	private Collection<TrainerEntity> trainer;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private AddressEntity addressEntity;

	public InstituteEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getNoOfTechnology() {
		return noOfTechnology;
	}

	public void setNoOfTechnology(int noOfTechnology) {
		this.noOfTechnology = noOfTechnology;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Collection<TrainerEntity> getTrainer() {
		return trainer;
	}

	public void setTrainer(Collection<TrainerEntity> trainer) {
		this.trainer = trainer;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	@Override
	public String toString() {
		return "InstituteEntity [id=" + id + ", name=" + name + ", noOfTechnology=" + noOfTechnology + ", technology=" + technology
				+ ", trainer=" + trainer + ", addressEntity=" + addressEntity + "]";
	}

}
