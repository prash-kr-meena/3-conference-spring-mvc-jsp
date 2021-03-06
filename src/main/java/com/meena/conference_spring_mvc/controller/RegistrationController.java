package com.meena.conference_spring_mvc.controller;

import com.meena.conference_spring_mvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

  @GetMapping("registration")
  public String getRegistration(@ModelAttribute("registration") Registration registration) {
    System.out.println("HIT - GET  - registration");
    return "registration";
  }

  @PostMapping("registration")
  public String postRegistration(@ModelAttribute("registration") Registration registration) {
    System.out.println("HIT - POST  - registration" + "\t Name :" + registration.getName());
    //    return "registration";       Will not clear the form data
    return "redirect:registration";
  }
}
