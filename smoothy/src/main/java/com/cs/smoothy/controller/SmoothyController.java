package com.cs.smoothy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.smoothy.model.Smoothy;
import com.cs.smoothy.service.SmoothyService;

@Controller
public class SmoothyController {

	@Autowired
	private SmoothyService smoothyServiceImpl;
	
//	@Autowired
//    private InMemoryUserDetailsManager userManager;

//	@PostMapping("/login")
//	public String viewlogin(@RequestParam(value = "username") String username,
//			@RequestParam(value = "password") String password, Model model) {
//		//model.addAttribute("allemplist", employeeServiceImpl.getAllEmployee());
//		return "login";
//	}
//	
	@GetMapping("/login")
	public String viewlogin( Model model) {
		//model.addAttribute("allemplist", employeeServiceImpl.getAllEmployee());
		return "login";
	}

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("smoothies", smoothyServiceImpl.getAllSmoothies());
		return "index";
		// return smoothyServiceImpl.getAllSmoothies();
	}

//	@GetMapping("/")
//	public String main(Model model) {
//		model.addAttribute("message", "hi");
//		model.addAttribute("tasks", "hi");
//
//		return "welcome"; // view
//	}

//	@GetMapping("/addnew")
//	public String addNewEmployee(Model model) {
//		Employee employee = new Employee();
//		model.addAttribute("employee", employee);
//		return "newemployee";
//	}
//
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Smoothy smoothy) {
		smoothyServiceImpl.save(smoothy);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}/{basicdetails}")
	public String updateForm(@PathVariable(value = "id") long id,
			@PathVariable(value = "basicdetails") String basicDetails, Model model) {
		smoothyServiceImpl.updateSmoothyBasicDetailsbyId(id, basicDetails);
		model.addAttribute("smoothies", smoothyServiceImpl.getAllSmoothies());
		return "index";
	}

	@PostMapping("/edit-basicdetails")
	public String updateBasicDetails(@RequestParam(value = "id") long id,
			@RequestParam(value = "basicdetails") String basicDetails, Model model) {
		smoothyServiceImpl.updateSmoothyBasicDetailsbyId(id, basicDetails);
		model.addAttribute("smoothies", smoothyServiceImpl.getAllSmoothies());
		return "index";
	}
	
	@PostMapping("/edit-nutritionvalue")
	public String updateNutritionValue(@RequestParam(value = "id") long id,
			@RequestParam(value = "nutritionValues") String nutritionValues, Model model) {
		smoothyServiceImpl.updateSmoothyNutritionValuesbyId(id, nutritionValues);
		model.addAttribute("smoothies", smoothyServiceImpl.getAllSmoothies());
		return "index";
	}

	@GetMapping("/delete/{id}")
	public String deleteThroughId(@PathVariable(value = "id") long id) {
		smoothyServiceImpl.deleteSmoothy(id);
		return "redirect:/";

	}
}
