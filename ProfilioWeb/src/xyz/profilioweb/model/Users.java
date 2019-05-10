package xyz.profilioweb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	private String usrUsername;
	private String usrPassword;
	private String usrFirstname;
	private String usrLastname;
	private String usrGender;
	private Date usrDob;
	
	@Id
	@Column(name = "usr_username")
	public String getUsrUsername() {
		return usrUsername;
	}
	public void setUsrUsername(String usrUsername) {
		this.usrUsername = usrUsername;
	}
	
	@Column(name = "usr_password")
	public String getUsrPassword() {
		return usrPassword;
	}
	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
	}
	
	@Column(name = "usr_firstname")
	public String getUsrFirstname() {
		return usrFirstname;
	}
	public void setUsrFirstname(String usrFirstname) {
		this.usrFirstname = usrFirstname;
	}
	
	@Column(name = "usr_lastname")
	public String getUsrLastname() {
		return usrLastname;
	}
	public void setUsrLastname(String usrLastname) {
		this.usrLastname = usrLastname;
	}
	
	@Column(name = "usr_gender")
	public String getUsrGender() {
		return usrGender;
	}
	public void setUsrGender(String usrGender) {
		this.usrGender = usrGender;
	}
	
	@Column(name = "usr_dob")
	public Date getUsrDob() {
		return usrDob;
	}
	public void setUsrDob(Date usrDob) {
		this.usrDob = usrDob;
	}
}
