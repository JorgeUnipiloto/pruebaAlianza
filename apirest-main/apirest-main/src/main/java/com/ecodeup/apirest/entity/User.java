package com.ecodeup.apirest.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "firstName")
	private String name;
	
	private String SDate;
	private String EDate;
	
	private String email;
	
	private String phone;
	
	
	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//
	public String getSDate() {
		return SDate;
	}

	public void setSDate(String SDate) {
		this.SDate = SDate;
	}
	//
	//
	public String getEDate() {
		return EDate;
	}

	public void setEDate(String EDate) {
		this.EDate = EDate;
	}
	//

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//
	
	
	
	

	

}
