package com.xworkz.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "job")
public class JobEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "J_id")
	private Integer jid;
	@Column(name = "J_name")
	private String name;
	@Column(name = "J_technology")
	private String technology;
	@Column(name = "J_experience")
	private Integer experience;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private IndustryEntity industryEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "trainer")
	private TrainerEntity trainerEntity;

	public JobEntity() {
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

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public IndustryEntity getIndustryEntity() {
		return industryEntity;
	}

	public void setIndustryEntity(IndustryEntity industryEntity) {
		this.industryEntity = industryEntity;
	}

	public TrainerEntity getTrainerEntity() {
		return trainerEntity;
	}

	public void setTrainerEntity(TrainerEntity trainerEntity) {
		this.trainerEntity = trainerEntity;
	}

	@Override
	public String toString() {
		return "JobEntity [jid=" + jid + ", name=" + name + ", technology=" + technology + ", experience=" + experience
				+ ", industryEntity=" + industryEntity + ", trainerEntity=" + trainerEntity + "]";
	}

}
