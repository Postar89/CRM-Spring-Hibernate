package com.work.crm.CRM.ui.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/client")
public class ClientControler {
    @GetMapping
    String showClients(){
        //model.addAttribute("client", )
        return "client";
    }
    
}
