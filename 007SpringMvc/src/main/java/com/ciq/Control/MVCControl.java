package com.ciq.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.model.Employee;
import com.ciq.service.EmpService;
import com.ciq.service.ServiceImpli;

@Controller
@RequestMapping("/MVC")
public class MVCControl {
	@Autowired
	EmpService serviceImpli;
	@RequestMapping(value = "/wel",method = RequestMethod.GET)
	public String welcme()
	{
		return "Welcome";
		
	}
	@RequestMapping(value = "/regi",method = RequestMethod.GET)
	public String RegisterPage()
	{
		return "Register";
	}
	
	@RequestMapping(value = "/save",method =RequestMethod.POST)
	
public String save(Employee employee)
{
		serviceImpli.insert(employee);
		//service method
	return "redirect:/getAllData";
		
}
	@RequestMapping(value="/getAllData",method = RequestMethod.GET)
	public ModelAndView getDetails()
	{
		//service logic
		//System.out.println(serviceImpli.getAllEmp());
		
		return new ModelAndView("Details", "allData", serviceImpli.getAllEmp());
		
	}
	
//	@RequestMapping(value="/getAll",method = RequestMethod.GET)
//	public @ResponseBody List<Employee> getEmpAll()
//	{
//		return serviceImpli.getAllEmp();
//		
//	}
	//@GetMapping("/update")
	@RequestMapping(value = "update",method = RequestMethod.GET)
	public String update(@RequestParam Integer id,Model model)
	
	{
		Employee emp=serviceImpli.getById(id);
		model.addAttribute("employee", emp);
		return "Update";
		
	}
	//@PostMapping("/modify")
	@RequestMapping(value = "/modify",method = RequestMethod.POST)
	public String getModify(Employee employee)
	{
		serviceImpli.update(employee);
		return "redirect:/getAllData";
		
	}
	
}
