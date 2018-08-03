package gr.cosmart.interview.resource.nav;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import gr.cosmart.interview.domain.Category;
import gr.cosmart.interview.domain.Role;
import gr.cosmart.interview.domain.User;
import gr.cosmart.interview.service.CategoryService;
import gr.cosmart.interview.service.RoleService;
import gr.cosmart.interview.service.UserService;

@Controller
public class MVCcontroller {

//	@Autowired
//	private CategoryService CategoryService;
//
//	@Autowired
//	private RoleService RoleService;
//
//	@Autowired
//	private UserService UserService;


//	@RequestMapping("/ajax")
//	public ModelAndView helloAjaxTest() {
//		return new ModelAndView("ajax", "message", "Crunchify Spring MVC with Ajax and JQuery Demo..");
//	}
//
//	@RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
//	public @ResponseBody String getTime() {
//
//		Random rand = new Random();
//		float r = rand.nextFloat() * 100;
//		String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
//		System.out.println("Debug Message from CrunchifySpringAjaxJQuery Controller.." + new Date().toString());
//		return result;
//	}

	@RequestMapping(value = "/Category", method = RequestMethod.GET)
	public ModelAndView viewUser(@ModelAttribute("Category") Category c) {
		return new ModelAndView("Category", "Category", c);
	}
	
	@RequestMapping(value = "/Role", method = RequestMethod.GET)
	public ModelAndView viewUser(@ModelAttribute("Role") Role r) {
		return new ModelAndView("Role", "Role", r);
	}
	
	@RequestMapping(value = "/User", method = RequestMethod.GET)
	public ModelAndView viewUser(@ModelAttribute("User") User u) {
		return new ModelAndView("User", "User", u);
	}

//	@RequestMapping(value = "/User/view", method = RequestMethod.GET)
//	public ModelAndView viewUser(@ModelAttribute("User") User u) {
//		return new ModelAndView("User/view", "User", u);
//		// return "User";
//	}
//
//	@RequestMapping(value = "/User", method = RequestMethod.GET)
//	public String viewUser(Model User) {
//		// return new ModelAndView("User/view", "User", u);
//		return "User";
//	}
//
//	// @RequestMapping(value = "/User", method = RequestMethod.GET)
//	// public ModelAndView newUser() {
//	// return new ModelAndView("User/form", "User", new User());
//	// }
//
//	@RequestMapping(value = "/User", method = RequestMethod.POST)
//	public String addUser(@ModelAttribute("user") User u, BindingResult result, ModelMap model) {
//		UserService.addUser(u);
//		model.addAttribute("message", "User saved successfuly");
//		model.addAttribute("user", u);
//		return "User";
//	}
//	
//	@RequestMapping(value = "/Role", method = RequestMethod.POST)
//	public String addRole(@ModelAttribute("role") Role r, BindingResult result, ModelMap model) {
//		RoleService.addRole(r);
//		model.addAttribute("message", "Role saved successfuly");
//		model.addAttribute("role", r);
//		return "Role";
//	}
//	
//	@RequestMapping(value = "/Category", method = RequestMethod.POST)
//	public String addCategory(@ModelAttribute("category") Category c, BindingResult result, ModelMap model) {
//		CategoryService.addCategory(c);
//		model.addAttribute("message", "Category saved successfuly");
//		model.addAttribute("category", c);
//		return "Category";
//	}
//
//	@RequestMapping(value = "/Category/view", method = RequestMethod.GET)
//	public ModelAndView viewCategory(@ModelAttribute("Category") Category c) {
//		return new ModelAndView("Category/view", "Category", c);
//	}
//
//	@RequestMapping(value = "/Category", method = RequestMethod.GET)
//	public ModelAndView newCategory() {
//		return new ModelAndView("Category/form", "Category", new Category());
//	}
//
//	@RequestMapping(value = "/Category", method = RequestMethod.POST)
//	public String addCategory(@ModelAttribute("category") Category c, BindingResult result, ModelMap model) {
//		// if (!p.getEmail().contains("@")) {
//		// result.rejectValue("email", "invalid", "Person email value is invalid!");
//		// }
//		//
//		// if (result.hasErrors()) {
//		// return "error/person";
//		// }
//		CategoryService.addCategory(c);
//		model.addAttribute("message", "Category saved successfuly");
//		model.addAttribute("category", c);
//		return "category/view";
//	}
//
//	@RequestMapping(value = "/Role/view", method = RequestMethod.GET)
//	public ModelAndView viewRole(@ModelAttribute("Role") Role r) {
//		return new ModelAndView("Role/view", "Role", r);
//	}
//
//	@RequestMapping(value = "/Role", method = RequestMethod.GET)
//	public ModelAndView newRole() {
//		return new ModelAndView("Role/view", "Role", new Role());
//	}
//
//	@RequestMapping(value = "/Role", method = RequestMethod.POST)
//	public String addRole(@ModelAttribute("Role") Role r, BindingResult result, ModelMap model) {
//		// if (!p.getEmail().contains("@")) {
//		// result.rejectValue("email", "invalid", "Person email value is invalid!");
//		// }
//		//
//		// if (result.hasErrors()) {
//		// return "error/person";
//		// }
//		RoleService.addRole(r);
//		model.addAttribute("message", "Role saved successfuly");
//		model.addAttribute("role", r);
//		return "role/view";
//	}

}
