package org.elati;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	@ElementCollection
	@Embedded
	@JoinTable(name="USERADD",
			joinColumns = @JoinColumn(name="USRID")
			)
	private Set<Address> listofAddress = new HashSet<Address>();

	private String description;

	public Set<Address> getListofAddress() {
		return listofAddress;
	}

	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
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
