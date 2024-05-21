package com.mounika.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="technician")
public class TechnicianEntity {
	  @Id
	  private String techid;
      private String name;
      private Long mobile;
      private String email;
      private String address;
      private String gender;
      private LocalDate dob;
      private String specialization;
      private Integer experience;
      private String qualification;
      private String department;
      private String hod;
      private String pwd;
      private String confirmPwd;
      private String declaration;
      
	
      
      public TechnicianEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnicianEntity(String techid, String name, Long mobile, String email, String address, String gender,
			LocalDate dob, String specialization, Integer experience, String qualification, String department,
			String hod, String pwd, String confirmPwd, String declaration) {
		super();
		this.techid = techid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.specialization = specialization;
		this.experience = experience;
		this.qualification = qualification;
		this.department = department;
		this.hod = hod;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
		this.declaration = declaration;
	}

	public String getTechid() {
		return techid;
	}

	public void setTechid(String techid) {
		this.techid = techid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}     
}
