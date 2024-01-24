package com.schoolManagement.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolManagement.pack.Repositories.MarksheetRepo;
import com.schoolManagement.pack.Repositories.StudentRepo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class UserPage {
	
	@ResponseBody
	@RequestMapping("/register-user/{suser}/{spassword}/{semail}")
	public String register (HttpServletRequest req , HttpServletResponse res , @PathVariable("suser") String suser,@PathVariable("spassword")  String spassword,@PathVariable("semail") String semail) {
		
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
		
		return "yetToComplete";
		
		
	}

	
	

}
