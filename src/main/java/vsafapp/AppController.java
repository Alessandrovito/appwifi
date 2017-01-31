package vsafapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vsafapp.model.ConfigurationApp;
import vsafapp.model.Wlan;



@Controller
public class AppController {
	
	
	@RequestMapping(value = "/application", method = RequestMethod.GET)
	public ModelAndView viewAppMain(Model model) {
		ConfigurationApp confForm = new  ConfigurationApp();
		
		confForm.setFtp_password("");
		confForm.setFtp_server("192.168.1.10");
		confForm.setTime_schedule(6000);
		
		model.addAttribute("confForm", confForm);
		
		model.addAttribute("ftpserver", confForm.getFtp_server());
		model.addAttribute("timeduration", confForm.getTime_duration());
		
		// Return to appmain.jsp per inserire le info
		return new ModelAndView("appmain", "command", confForm);
	}
	
	
//	Come from Form
	@RequestMapping(value = "/application", method = RequestMethod.POST)
	public String addWlan(@ModelAttribute("confForm") ConfigurationApp conf,
			ModelMap model) {
		
		// implement your own registration logic here...
		
		  System.out.println("Ftp_server: " + conf.getFtp_server());
	      System.out.println("Time_duration: " + conf.getTime_duration());
	      System.out.println("Time_schedule	: " + conf.getTime_schedule());
	   // Return to wlanpage.jsp per visualizzare i settaggi e per partire Start della App
		return "wlanpage";
	}

	
	@RequestMapping(value = "/app/{id}", method = RequestMethod.GET)
	public ModelAndView wlan(@PathVariable("id") int id, Model model) {
		return new ModelAndView("student", "command", new Wlan());
	}


}
