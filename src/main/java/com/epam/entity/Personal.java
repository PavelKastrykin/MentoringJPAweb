package com.epam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Personal")
public class Personal implements Serializable {

	private Integer personalID;
	private String firstName;
	private String lastName;
	private Date birthDate;

	public Personal() {}

	public Personal(Integer personalID, String firstName, String lastName, Date birthDate) {
		this.personalID = personalID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	@Id
	@Column(name = "personalID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getPersonalID() {
		return personalID;
	}

	public void setPersonalID(Integer personalID) {
		this.personalID = personalID;
	}

	@Column(name = "firstName", nullable = false, length = 30)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", nullable = false, length = 30)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birthDate", nullable = false)
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Personal{" +
				"personalID=" + personalID +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", birthDate=" + birthDate +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Personal personal = (Personal) o;
		return Objects.equals(personalID, personal.personalID) &&
				Objects.equals(firstName, personal.firstName) &&
				Objects.equals(lastName, personal.lastName) &&
				Objects.equals(birthDate, personal.birthDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personalID, firstName, lastName, birthDate);
	}
}
