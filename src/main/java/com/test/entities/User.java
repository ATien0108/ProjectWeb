package com.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "passwordHash")
    private String passwordHash;
    @Column(name = "registeredAt")
    private Date regiteredat;
    @Column(name = "profile")
    private String profile;
    @Column(name = "image")
    private String image;
    
	public String getPasswordHash() {
		// TODO Auto-generated method stub
		return passwordHash;
	}
	public void setPasswordHash(String hashpw) {
		// TODO Auto-generated method stub
		this.passwordHash = hashpw;
	}
	public void setRegiteredat(Date date) {
		// TODO Auto-generated method stub
		this.regiteredat = date;
	}
	public User() {
		super();
	}
	public User(int id, String username, String email, String passwordHash, Date regiteredat, String profile,
			String image) {
		super();
		this.id = id;
		this.name = username;
		this.email = email;
		this.passwordHash = passwordHash;
		this.regiteredat = regiteredat;
		this.profile = profile;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getRegiteredat() {
		return regiteredat;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + name + ", email=" + email + ", passwordHash=" + passwordHash
				+ ", regiteredat=" + regiteredat + ", profile=" + profile + ", image=" + image + "]";
	}
	
	
}
