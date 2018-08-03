package gr.cosmart.interview.resource.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.persistence.tools.profiler.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.cosmart.interview.domain.Role;
import gr.cosmart.interview.service.UserService;

@RestController
@RequestMapping("/json/role")
public class JSONRestRole {

//	@GET
//	@Path("/get")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Role getRoleInJSON() {
//
//		Role role = new Role();
//		role.setTitle("title 1");
//
//		return role;
//
//	}
//
//	@POST
//	@Path("/post")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response createRoleInJSON(Role role) {
//
//        String output = role.toString();
//		return Response.status(201).entity(output).build();
//		
//	}
//	
	
//	@Autowired
//	private UserService userService;
//	@JsonView(Profile.PublicView.class)
//	@RequestMapping(value= "/publicprofile", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<User> getAllPublicProfile() {
//		List<User> users = userService.getAllUsers();
//		return users;
//	}	
//	@JsonView(Profile.FriendsView.class)
//	@RequestMapping(value= "/friendsprofile", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<User> getAllFriendsProfile() {
//		List<User> users = userService.getAllUsers();
//		return users;
//	}	
//	@JsonView(Profile.FamilyView.class)
//	@RequestMapping(value= "/familyprofile", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<User> getAllFamilyProfile() {
//		List<User> users = userService.getAllUsers();
//		return users;
//	}		
//	@RequestMapping(value= "/completeprofile/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public User getCompleteProfileById(@PathVariable(value = "userId") String userId) {
//		User user = userService.getUserById(userId);
//		return user;
//	}
//	@RequestMapping(value="/save", method = RequestMethod.POST)
//	public ResponseEntity<String> save(@RequestBody Name name) {
//		StringBuffer output = new StringBuffer();
//		if (name.getFirstName() != null) {
//			output.append(" ").append(name.getFirstName());
//		}
//		if (name.getMiddleName() != null) {
//			output.append(" ").append(name.getMiddleName());
//		}
//		if (name.getLastName() != null) {
//			output.append(" ").append(name.getLastName());
//		}		
//		return new ResponseEntity<String>(output.toString(), HttpStatus.CREATED);
//	} 
}
