package com.allane.mobility.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    /**
     * Index endpoint to show the index page
     *
     * @param model Spring's view model
     * @return view name
     */
    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("title", "Allane Mobility");
        model.addAttribute("welcome", "Welcome to Allane mobility group");
        model.addAttribute("applicationTitle", "Leasing application");
        return "index";
    }

    @GetMapping({"/", "/contract"})
    public String contract(Model model) {
        model.addAttribute("title", "Allane Mobility");
        model.addAttribute("welcome", "Welcome to Allane mobility group");
        model.addAttribute("applicationTitle", "Leasing application");
        return "leasingContract";
    }

}
