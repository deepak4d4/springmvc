package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		List<String> friends = new ArrayList<String>();
		friends.add("vishal");
		friends.add("surya");
		friends.add("rathod");
		model.addAttribute("name","Deepak Yadav");
		model.addAttribute("id",123);
		model.addAttribute("f",friends);
		System.out.println("index.jsp runs");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about.jsp");
		return "about";
	}
	@RequestMapping("/services")
	public String service() {
		System.out.println("this is services.jsp");
		return "services";
	}
	
	//ModelAndView object for sending data from controller to view
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","Deepak");
		mav.addObject("id",123);
		LocalDateTime now =LocalDateTime.now();
 		List<String> no =new ArrayList<String>();
		no.add("11");
		no.add("12");
		no.add("13");
		mav.addObject("time",now);
		mav.addObject("list",no);
		mav.setViewName("help");
		return mav;
	}
}