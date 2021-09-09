package com.UH.UniversalHospital.web;

import com.UH.UniversalHospital.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @GetMapping("/Login")
    public String Login(){
        return "login";
    }


    @GetMapping("/DoctorHome")
    public String dhome(){
        return "dhome";
    }

    @GetMapping("/choice")
    public String choice(){
        return "choice";
    }


    @GetMapping("/PatientHome")
    public String phome(){
        return "phome";
    }


    @GetMapping("/DoctorPatients")
    public String dPatients(){
        return "index17";
    }


    @GetMapping("/DoctorPharmacy")
    public String dPharmacy(){
        return "index18";
    }


    @GetMapping("/DoctorAppointments")
    public String dAppointments(){
        return "index19";
    }


    @GetMapping("/DoctorAccount")
    public String dAccount(){
        return "index21";
    }



    @GetMapping("/DoctorMessages")
    public String dMessages(){
        return "index23";
    }

    @GetMapping("/DoctorNotifications")
    public String dNotifications(){
        return "index24";
    }


    @GetMapping("/PatientDoctors")
    public String pDoctors(){
        return "index7";
    }


    @GetMapping("/PatientAppointments")
    public String pAppointments(){
        return "index8";
    }


    @GetMapping("/PatientPharmacy")
    public String pPharmacy(){
        return "index9";
    }
    @GetMapping("/PatientPrescriptions")
    public String pPrescriptions(){
        return "index10";
    }
    @GetMapping("/PatientEducation")
    public String pEducation(){
        return "index11";
    }





    @GetMapping("/PatientAccount")
    public String pAccount(){
        return "index13";
    }



    @GetMapping("/PatientMessages")
    public String pMessages(){
        return "index15";
    }

    @GetMapping("/PatientNotifications")
    public String pNotifications(){
        return "index16";
    }


}
