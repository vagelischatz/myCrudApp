package gr.cosmart.interview.resource.rest;

import java.util.Set;

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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import gr.cosmart.interview.domain.User;
import gr.cosmart.interview.service.UserService;

@RestController
@RequestMapping("/json/User")
public class JSONRestUser {

//	@GET
//	@Path("/get")
//	@Produces(MediaType.APPLICATION_JSON)
//	public User getUserInJSON() {
//
//		User user = new User();
//		user.setEmail("v.chatzitzanos@gmail.com");
//
//		return user;
//
//	}
//
//	@POST
//	@Path("/post")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response createUserInJSON(User user) {
//
//        String output = user.toString();
//		return Response.status(201).entity(output).build();
//		
//	}
	
	@Autowired
	private UserService userService;
	
	@GET
	@Path("/get")
	@JsonView(View.Summary.class)
	@RequestMapping(value= "/getUsers", produces = MediaType.APPLICATION_JSON)
	public String getUsers(Model model) {
    	model.addAttribute("users", userService.getAllUsers());
        return "User";
    }
	
	@GET
	@Path("/get")
	@JsonView(View.Summary.class)
	@RequestMapping(value= "/getUserById", produces = MediaType.APPLICATION_JSON)
	public String getUserById(Model model, @PathVariable(value = "userId") Integer userId) {
    	model.addAttribute("users", userService.getByUserId(userId));
			return "User";
    }
    
	
//    @RequestMapping(value = {"/admin", "/admin/manageusers"}, method = RequestMethod.GET)
//    public String manageUsers(Model model) {
//    	model.addAttribute("users", userService.findAll());
//    	model.addAttribute("userViewDevices", new User());
//        return "manageusers";
//    }
//    
//    
//	@JsonView(Profile.FriendsView.class)
//	@RequestMapping(value= "/friendsprofile", produces = MediaType.APPLICATION_JSON)
//	public List<User> getAllFriendsProfile() {
//		List<User> users = userService.getAllUsers();
//		return users;
//	}	
//	@JsonView(Profile.FamilyView.class)
//	@RequestMapping(value= "/familyprofile", produces = MediaType.APPLICATION_JSON)
//	public List<User> getAllFamilyProfile() {
//		List<User> users = userService.getAllUsers();
//		return users;
//	}		
//	@RequestMapping(value= "/completeprofile/{userId}", produces = MediaType.APPLICATION_JSON)
//	public User getCompleteProfileById(@PathVariable(value = "userId") String userId) {
//		User user = userService.getUserById(userId);
//		return user;
//	}
	
	@POST
	@Path("/post")
	@RequestMapping(value="/save", method = RequestMethod.POST)
		public Response createUserInJSON(User user) {
		
		        String output = user.toString();
				return Response.status(201).entity(output).build();
				
			}
	
    @RequestMapping(value = {"/addUser"}, method = RequestMethod.POST)
    public String addUser(@ModelAttribute("User") User user, Model model) {
    	//Password is not correctly encrypted, do not uncomment.
    	//loggedUser.setPassword(passwordEncoder.encode(loggedUser.getPassword()));
//    	loggedUser.setPassword(userService.getLoggedUser().getPassword());
//    	loggedUser.setRole(userService.getLoggedUser().getRole());
//    	loggedUser.setUserID(userService.getLoggedUser().getUserID());
//    	userService.setLoggedUser(loggedUser);
    	userService.addUser(user);
        return "redirect:/User";
    }
    
	
}
