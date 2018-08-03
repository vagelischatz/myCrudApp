package gr.cosmart.interview.dto;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.resource.rest.View;

public class RoleDTO {

	@JsonView(View.Summary.class)
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
