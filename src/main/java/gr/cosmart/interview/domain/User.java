package gr.cosmart.interview.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.resource.rest.View;

import java.sql.Timestamp;

/**
 * Entity that describes the user. Information includes name and last name,
 * unique email, encrypted password, role (0 for administrator and 1 for
 * simple user) and a list of the devices they can access (for simple users).  
 * @author geost
 *
 */
@Entity
public class User {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer userID;
    @Column(name="email")
    private String email;
    @Column(columnDefinition = "char")
    private String password;
    @Column(name="enabled")
    private int enabled;
    @Column(name="register_date")
    private Timestamp registerDate;
    @OneToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userid"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "roleid"))
    private Set<Role> user_roles;
    
    public User() {}
    
    public User(String email, String password, int enabled, Timestamp registerDate) {
    	this.email = email;
    	this.password = password;
    	this.enabled = enabled;
    	this.registerDate = registerDate;
    }

	public Set<Role> getUserRoles() {
		return user_roles;
	}

	public void setUserRoles(Set<Role> user_roles) {
		this.user_roles = user_roles;
	}

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
	
	@Override
	public String toString() {
		return new StringBuffer(" User ID : ").append(this.userID)
				.append(" User's Email : ").append(this.email)
				.append(" User's Password : ").append(this.password)
		
				.toString();
	}
    
}
