package com.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private int id;
    private String username;
    private String email;
    private String passwordHash;
    private Date regiteredat;
    private String profile;
    private String image;
	public UserModel() {
		super();
	}
	public UserModel(int id, String username, String email, String passwordHash, Date regiteredat, String profile,
			String image) {
		super();
		this.id = id;
		this.username = username;
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
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public Date getRegiteredat() {
		return regiteredat;
	}
	public void setRegiteredat(Date regiteredat) {
		this.regiteredat = regiteredat;
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
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", passwordHash=" + passwordHash
				+ ", regiteredat=" + regiteredat + ", profile=" + profile + ", image=" + image + "]";
	}
		public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
