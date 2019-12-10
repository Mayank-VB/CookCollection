package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.*;

@Entity
@Table(name="admin")
public class AdminPojo {

	Integer aId;
	String name;
	String mobileno;
	String password;
	
	//no-argument constructor
	public AdminPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor
	public AdminPojo(String name, String mobileno, String password) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.password = password;
	}

	//auto-generation of id
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Admin_Id")
	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	@Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=10)
	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Column(length=20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminPojo [aId=" + aId + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
	
}
