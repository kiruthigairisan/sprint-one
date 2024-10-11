package com.mit.userservice;
import jakarta.persistence.*;



@Entity

public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    private String companyName;
    private String position;
    private String location;
    // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Long id, String name, String email, String companyName, String position, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.companyName = companyName;
		this.position = position;
		this.location = location;
	}
	
    
    
}
