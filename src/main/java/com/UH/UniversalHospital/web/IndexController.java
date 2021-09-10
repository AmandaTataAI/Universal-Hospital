package com.UH.UniversalHospital.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class IndexController {
        @RequestMapping("/home")
        String Index(){
            return "index";
        }
    }


