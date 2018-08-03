package gr.cosmart.interview.dto;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.resource.rest.View;

public class CategoryDTO {
	
	@JsonView(View.Summary.class)
	private String title;
	@JsonView(View.Summary.class)
	private int categoryType;	

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
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	
}
