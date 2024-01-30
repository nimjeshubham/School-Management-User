package com.schoolManagement.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.client.RestTemplate;

import com.schoolManagement.pack.Repositories.MarksheetRepo;
import com.schoolManagement.pack.Repositories.StudentRepo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class UserPage {
	
	
	@RequestMapping("/SchoolManagement-1/{userID}/{password}/{selector}")
	public ModelAndView register (HttpServletRequest req , HttpServletResponse res , @PathVariable("userID") String userID,@PathVariable("password")  String password,@PathVariable("selector") String selector) {
		ModelAndView mv = new ModelAndView();
		try {
			
			if(selector.contentEquals("student")) {
				mv.setViewName("studentOperation");
			}
			else if (selector.contentEquals("teacher")) {
				mv.setViewName("teacherOperations");
			}
			else
				mv.setViewName("failed");
			
		}catch (Exception e) {
			mv.setViewName("failed");
		}
	/*Student s = new Student();
	s.setSuser(suser);
	s.setSpassword(spassword);
	s.setSemail(semail);
	
	log.info("value set");
	
	Student ss = repo.save(s);
	
	if(ss!=null) {
		
		log.info("register done");
		return "Register done";  
	}
	else {
		
		log.info("register failed");
		return "Register Failed";
	}*/
		
		
		return mv;
		
	}
	
	

	
	

}
