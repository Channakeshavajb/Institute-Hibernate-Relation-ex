package com.xworkz.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "address")
public class AddressEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "A_id")
	private Integer aid;
	@Column(name = "A_city")
	private String city;
	@Column(name = "A_state")
	private String state;
	@Column(name = "A_pincode")
	private Integer pincode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "institute")
	private InstituteEntity instituteEntity;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "trainer")
	private TrainerEntity trainerEntity;

	public AddressEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	
	public InstituteEntity getInstituteEntity() {
		return instituteEntity;
	}

	public void setInstituteEntity(InstituteEntity instituteEntity) {
		this.instituteEntity = instituteEntity;
	}

	public TrainerEntity getTrainerEntity() {
		return trainerEntity;
	}

	public void setTrainerEntity(TrainerEntity trainerEntity) {
		this.trainerEntity = trainerEntity;
	}

	@Override
	public String toString() {
		return "AddressEntity [aid=" + aid + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", instituteEntity=" + instituteEntity + ", trainerEntity=" + trainerEntity + "]";
	}

	
	
}
