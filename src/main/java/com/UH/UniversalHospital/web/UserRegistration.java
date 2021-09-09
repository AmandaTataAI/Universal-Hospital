package com.UH.UniversalHospital.web;

import com.UH.UniversalHospital.service.UserService;
import com.UH.UniversalHospital.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Registration")
public class UserRegistration {

    private UserService userService;

    public UserRegistration(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm(){
        return "Registration";
    }



    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){

        userService.save(registrationDto);
        return "redirect:/Registration?success";
    }
}
