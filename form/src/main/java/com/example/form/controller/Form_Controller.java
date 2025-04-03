package com.example.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.form.entity.Forms;
import com.example.form.service.Formservice;

@Controller
public class Form_Controller {

    @Autowired
    private Formservice service;

    @GetMapping("/")
    public String orderPage(Model model)
    {
    	List<Forms> listforms = service.retrive();
    	model.addAttribute("listformss", listforms);
        return "index";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("form", new Forms());
        return "Formss"; // Ensure this matches your Thymeleaf file name
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("form") Forms form) {
        service.saveform(form); // Save form data
        return "redirect:/"; // Redirect to home page after submission
    }
    
    @RequestMapping("edit/{formid}")
    public ModelAndView editform(@PathVariable(name="formid")int id)
	{
		ModelAndView mv = new ModelAndView("Formss");
		Forms f = service.update(id);
		mv.addObject("form", f);
		return mv;
		
	}
    @RequestMapping("delete/{formid}")
	public String deleteform(@PathVariable(name="formid")int id){
		service.deleteform(id);
		return "redirect:/";
		
	}
}
