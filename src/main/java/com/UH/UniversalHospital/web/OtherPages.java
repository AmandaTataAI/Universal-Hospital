package com.UH.UniversalHospital.web;

import org.springframework.web.bind.annotation.RequestMapping;

public class OtherPages {

    @RequestMapping("/index6")
    public String index6() {
        return "index6";
    }

    @RequestMapping("/index4")
    public String index4() {
        return "index4";
    }
}
