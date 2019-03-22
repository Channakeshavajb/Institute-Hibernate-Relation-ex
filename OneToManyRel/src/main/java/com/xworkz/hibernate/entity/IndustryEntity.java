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
@Table(name = "industry")
public class IndustryEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "I_id")
	private Integer iid;
	@Column(name = "I_name")
	private String name;
	@Column(name = "I_technology")
	private String technology;
	@Column(name = "I_location")
	private String location;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job")
	private JobEntity jobEntity;

	public IndustryEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public JobEntity getJobEntity() {
		return jobEntity;
	}

	public void setJobEntity(JobEntity jobEntity) {
		this.jobEntity = jobEntity;
	}

	@Override
	public String toString() {
		return "IndustryEntity [iid=" + iid + ", name=" + name + ", technology=" + technology + ", location=" + location
				+ ", jobEntity=" + jobEntity + "]";
	}

}
