package com.work.crm.CRM.ui.controler;


import com.work.crm.CRM.logic.client.ClientWriteModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/client")
public class ClientControler {
    @GetMapping
    String showClients(Model model){
        model.addAttribute("klient", new ClientWriteModel());
        return "client";
    }
    
}
