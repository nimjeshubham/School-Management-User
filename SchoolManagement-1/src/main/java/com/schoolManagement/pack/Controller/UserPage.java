package com.schoolManagement.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.client.RestTemplate;

import com.schoolManagement.pack.Model.Contact;
import com.schoolManagement.pack.Model.Student;
import com.schoolManagement.pack.Model.Teacher;
import com.schoolManagement.pack.Repositories.MarksheetRepo;
import com.schoolManagement.pack.Repositories.StudentRepo;
import com.schoolManagement.pack.Services.ContactDao;
import com.schoolManagement.pack.Services.StudentDao;
import com.schoolManagement.pack.Services.TeacherDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class UserPage {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	TeacherDao teacherDao;
	
	@Autowired
	ContactDao cDao;
	
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		try {
			String selector =req.getParameter("selector");
			if (selector.contains("student")) {
				Student student = studentDao.get(req.getParameter("userID"));
				String pass = student.getPassword();
				if(pass.contentEquals(req.getParameter( "pass"))) {
					mv.setViewName("studentOperation");
					mv.addObject("student", student);
				}else
					mv.setViewName("somethingWrongEnter1");
				
			}
			else if(selector.contains("teacher")) {
				Teacher teacher = teacherDao.get(Integer.parseInt(req.getParameter("userID")));
				String pass = teacher.getPassword();
				if(pass.contentEquals(req.getParameter( "pass"))){
					mv.setViewName("teacherOperations");
					mv.addObject("teacher", teacher);
				}else
					mv.setViewName("somethingWrongEnter1");
			}else
				mv.setViewName("somethingWrongEnter1");
				
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return mv;
	}
	
	@RequestMapping("/adminLogin")
	public RedirectView adminLogin(HttpServletRequest req, HttpServletResponse res) {
		RedirectView rv= new RedirectView();
		try {
		
		String url = "http://localhost:8080/SchoolManagement/";
		rv.setUrl(url);
		}catch (Exception e) {
			
		}
		
		
		return rv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Contact contact = new Contact();
		contact.setName(req.getParameter("name"));
		contact.setEmail(req.getParameter("email"));
		contact.setMassage(req.getParameter("massage"));
		cDao.insert(contact);
		mv.setViewName("index");
		return mv;
		
	}
	
	
	
	
		
	

	
	

}
