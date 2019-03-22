 package com.xworkz.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "trainer")
public class TrainerEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "T_id")
	private Integer tid;
	@Column(name = "T_name")
	private String name;
	@Column(name = "T_goodIn")
	private String goodIn;
	@Column(name = "T_exp")
	private Integer exp;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private AddressEntity addressEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private JobEntity jobEntity;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "institute")
	private InstituteEntity instituteEntity;

	public TrainerEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoodIn() {
		return goodIn;
	}

	public void setGoodIn(String goodIn) {
		this.goodIn = goodIn;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public JobEntity getJobEntity() {
		return jobEntity;
	}

	public void setJobEntity(JobEntity jobEntity) {
		this.jobEntity = jobEntity;
	}

	public InstituteEntity getInstituteEntity() {
		return instituteEntity;
	}

	public void setInstituteEntity(InstituteEntity instituteEntity) {
		this.instituteEntity = instituteEntity;
	}

	@Override
	public String toString() {
		return "TrainerEntity [tid=" + tid + ", name=" + name + ", goodIn=" + goodIn + ", exp=" + exp
				+ ", addressEntity=" + addressEntity + ", jobEntity=" + jobEntity + ", instituteEntity="
				+ instituteEntity + "]";
	}

}
