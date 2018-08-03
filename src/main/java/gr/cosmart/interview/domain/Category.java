package gr.cosmart.interview.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.domain.User;
import gr.cosmart.interview.resource.rest.View;

@Entity
public class Category {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryid")
	private Integer categoryid;
	@Column(name = "title")
	private String title;
	@Column(name = "category_type")
	private int categoryType;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
	private User user;
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(" Category ID : ").append(this.categoryid)
				.append(" Category's Customer ID : ").append(this.user.getUserID())
				.append(" Category Type : ").append(this.categoryType)
		
				.toString();
	}
    
    

}
