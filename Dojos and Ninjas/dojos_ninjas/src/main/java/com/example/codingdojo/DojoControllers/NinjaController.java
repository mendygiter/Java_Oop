package com.example.codingdojo.DojoControllers;


import com.example.codingdojo.models.Dojo;
import com.example.codingdojo.models.Ninja;
import com.example.codingdojo.services.DojoService;
import com.example.codingdojo.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaController {
    @Autowired
    NinjaService ninjaService;

    @Autowired
    DojoService dojoService;


    @GetMapping("/ninja")
    public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        List<Dojo> allDojos = dojoService.allDojos();
        model.addAttribute("allDojos", allDojos);
        return  "ninja";
    }

    @PostMapping("/newninja")
    public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "/ninja";
        }
        else {
            ninjaService.createNinja(ninja);
            return "redirect:/ninja";
        }
    }

}
