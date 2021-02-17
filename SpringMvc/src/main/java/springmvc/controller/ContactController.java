package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@RequestMapping("/contact")
	public String showView() {
		return "contact";
	}

	@ModelAttribute
	public void commonDataForAll(Model m) {
		m.addAttribute("Header", "this is header");
	}

	/*
	 * this can be used to fetch the data
	 * 
	 * @RequestMapping("/processform") public String handleView(HttpServletRequest
	 * request) { return ""; }
	 */

	/*
	 * @RequestMapping(path = "/processform" , method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String email,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("password") String password,Model model) {
	 * System.out.println("email is"+email);
	 * System.out.println("userName is"+userName);
	 * System.out.println("password is"+password);
	 * model.addAttribute("name",userName); model.addAttribute("password",password);
	 * model.addAttribute("email",email); return "show"; }
	 */
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model m) {

		System.out.println("running");
		System.out.println(user);
		if (user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		// m.addAttribute("user",user);
		int id = (Integer) this.userService.createUser(user);
		return "show";
	}

}