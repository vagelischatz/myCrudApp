package gr.cosmart.interview.domain;

//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.resource.rest.View;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roleid")
	private Integer roleid;
	@Column(name = "title")
	private String title;
	
//	@OneToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "roleid"))
//	private Set<UserRole> user_roles;
	
	public Role() {
	}

	public Role(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

/*	public Set<UserRole> getUser_roles() {
		return user_roles;
	}

	public void setUser_roles(Set<UserRole> user_roles) {
		this.user_roles = user_roles;
	}*/
	
	@Override
	public String toString() {
		return new StringBuffer(" Role ID : ").append(this.roleid)
				.append(" Role's Title : ").append(this.title)
		
				.toString();
	}


}
