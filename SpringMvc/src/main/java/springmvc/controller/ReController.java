package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	/* using redirect prefix */
	//@RequestMapping("/one")
	//public String one() {
		//return "redirect:/enjoy";
	//}
	
	/* using RedirectView */
	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}

	@RequestMapping("/enjoy")
	public String enjoy() {
		return "enjoy";
	}
}
