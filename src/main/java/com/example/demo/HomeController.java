package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @RequestMapping("/studentForm")
    public String home(Model model){
        model.addAttribute("studentInfo", new StudentInfo());
        return "studentForm";
    }
    @PostMapping("/studentConfirm")
    public String confirm(@Valid StudentInfo studentInfo, BindingResult result){
        if(result.hasErrors()){
            return "studentForm";
        }
        return "studentConfirm";
    }

}
