package org.elati;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USERDETAILS")
public class User_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "street", column = @Column(name = "OFFICE_STREET_NM")),
			@AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NM")),
			@AttributeOverride(name = "country", column = @Column(name = "OFFICE_COUNTRY_NM")),
			@AttributeOverride(name = "zip", column = @Column(name = "OFFICE_ZIP")) })
	private Address office_address;
	@Embedded
	private Address home_address;
	private String description;

	
	
	public Address getOffice_address() {
		return office_address;
	}

	public void setOffice_address(Address office_address) {
		this.office_address = office_address;
	}

	public Address getHome_address() {
		return home_address;
	}

	public void setHome_address(Address home_address) {
		this.home_address = home_address;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
