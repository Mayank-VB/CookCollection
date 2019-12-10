package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="package")
public class PackagePojo {

	Integer pId;
	double pAmt;
	String pName;
	String pType;
	String pDesc;
	//CountryPojo country;
	HotelPojo hotel;
	
	//default constructor
	public PackagePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterised constructor w/o pId
	public PackagePojo(double pAmt, String pName, String pType, String pDesc, /*CountryPojo country,*/HotelPojo hotel) {
		super();
		this.pAmt = pAmt;
		this.pName = pName;
		this.pType = pType;
		this.pDesc = pDesc;
		//this.country = country;
		this.hotel = hotel;
	}

	//auto-generation of pId
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public double getpAmt() {
		return pAmt;
	}

	public void setpAmt(double pAmt) {
		this.pAmt = pAmt;
	}
	
	@Column(name="Pkg_name",length=50)
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Column(name="Pkg_Type",length=50)
	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	@Column(name="Pkg_Description")
	public String getpDesc() {
		return pDesc;
	}

	
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	//pkg-country relation (many(pkgs) have one(country))
	  /*@ManyToOne
	  public CountryPojo getCountry() {
		  return country;
		  }
	  
	  public void setCountry(CountryPojo country) {
		  this.country = country;
		  }*/
	 

	//pkg to hotel relation (one(pkg) has many(hotels))
	@OneToMany(mappedBy="pkg",cascade=CascadeType.ALL)
	public HotelPojo getHotel() {
		return hotel;
	}

	public void setHotel(HotelPojo hotel) {
		this.hotel = hotel;
	}
	
}
