package gr.cosmart.interview.dto;

import java.sql.Timestamp;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.domain.Role;
import gr.cosmart.interview.resource.rest.View;

public class UserDTO {
	@JsonView(View.Summary.class)
	private Integer userID;
	@JsonView(View.Summary.class)
    private String email;
	@JsonView(View.Summary.class)
    private String password;
	@JsonView(View.Summary.class)
    private int enabled;
	@JsonView(View.Summary.class)
    private Timestamp registerDate;

        
//    public UserDTO(String email, String password, int enabled, Timestamp registerDate) {
//    	this.email = email;
//    	this.password = password;
//    	this.enabled = enabled;
//    	this.registerDate = registerDate;
//    }

//	public Set<Role> getUserRoles() {
//		return user_roles;
//	}
//
//	public void setUserRoles(Set<Role> user_roles) {
//		this.user_roles = user_roles;
//	}
//
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}
	
}
