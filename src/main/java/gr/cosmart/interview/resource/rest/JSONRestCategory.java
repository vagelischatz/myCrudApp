package gr.cosmart.interview.resource.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import gr.cosmart.interview.domain.Category;

@RestController
@Path("/json/Category")
public class JSONRestCategory {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Category getCategoryInJSON() {

		Category category = new Category();
		category.setCategoryType(10);
		category.setTitle("cat1");

		return category;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCategoryInJSON(Category category) {

        String output = category.toString();
		return Response.status(201).entity(output).build();
		
	}
	
}
