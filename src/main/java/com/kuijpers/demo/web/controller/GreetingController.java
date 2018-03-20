package com.kuijpers.demo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    // Inject via application.yml
    // Value("${welcome.message}")
    private String message = "Hello World";

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        
        model.addAttribute("name", name);
        
        return "greeting";
        
    }

}
