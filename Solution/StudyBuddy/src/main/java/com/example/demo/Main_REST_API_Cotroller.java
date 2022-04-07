package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Main_REST_API_Cotroller {

    @GetMapping("/account")
    public String home(@RequestParam(name="locale", required=false, defaultValue="EN") String locale, Model model) {
        model.addAttribute("Locale", locale);
        return "account";
    }


}
