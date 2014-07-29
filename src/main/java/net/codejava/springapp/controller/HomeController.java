package net.codejava.springapp.controller;

import java.util.List;

import net.codejava.springapp.model.dao.EmployeeDAO;
import net.codejava.springapp.model.pojo.Employee;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private List<Employee> employees;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView student() {
		initializeData();
		return new ModelAndView("home", "command", new Employee());
	}
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public ModelAndView addStudent(Employee newEployee, ModelMap model) {
		this.employees.add(newEployee);
		return new ModelAndView("home", "command", new Employee());
	}
	
	@RequestMapping(value = "/showEmployee", method = RequestMethod.GET)
	public String showEmployee(ModelMap model) {
		model.addAttribute("employees", this.employees);
		return "result";
	}
	
	private void initializeData()
	{
		if (this.employees == null)
		{
			this.employees = EmployeeDAO.initData();
		}
	}
	
}
