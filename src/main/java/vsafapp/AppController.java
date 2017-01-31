package vsafapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vsafapp.model.Wlan;



@Controller
public class AppController {
	
	
	@RequestMapping(value = "/app", method = RequestMethod.GET)
	public ModelAndView wlan(Model model) {
		return new ModelAndView("wlanpage", "command", new Wlan());
	}
	
	@RequestMapping(value = "/app/{id}", method = RequestMethod.GET)
	public ModelAndView wlan(@PathVariable("id") int id, Model model) {
		return new ModelAndView("student", "command", new Wlan());
	}

	@RequestMapping(value = "/setapplication", method = RequestMethod.POST)
	public String addWlan(@ModelAttribute("userForm") Wlan wlan,
			ModelMap model) {
		model.addAttribute("name", wlan.getBand());
		model.addAttribute("age", wlan.getChannels());

		return "result";
	}

}
