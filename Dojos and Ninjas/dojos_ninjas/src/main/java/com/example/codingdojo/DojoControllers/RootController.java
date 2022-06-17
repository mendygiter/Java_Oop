package com.example.codingdojo.DojoControllers;

import com.example.codingdojo.models.Dojo;
import com.example.codingdojo.services.DojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class RootController {
    @Autowired
    DojoService dojoService;

    @GetMapping("/dojo")
    public String index() {

        return "index";
    }

    @PostMapping("/newdojo")
    public String create (
            @RequestParam("name") String name) {
        Dojo dojo = new Dojo(name);
        dojoService.createDojo(dojo);
        return "redirect:/dojo";
    }

    @RequestMapping("/show/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("oneDojo", dojoService.getOne(id));
        return "show";
    }



};