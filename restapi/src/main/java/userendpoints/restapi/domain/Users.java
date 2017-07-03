package userendpoints.restapi.domain;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "USERS")
@NamedQueries
	({  @NamedQuery (name = "Users.findWithPhoneNumber", query = "SELECT usr FROM Users as usr WHERE usr.phone = :phone"), 
		@NamedQuery (name = "Users.findAll", query = "SELECT usr from Users as usr")
		})

public class Users implements Serializable{

	private static final long serialVersionUID = 5551707547269388327L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	private int id;
	
	@Column(nullable=false)
	private String firstName;
	private String middleName;
	@Column(nullable=false)
	private String lastName;
	private int age;
	private String gender;
	@Column(columnDefinition="numeric(10)", unique=true)
	private String phone;
	@Column(columnDefinition="numeric(5)")
	private String zip;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}


