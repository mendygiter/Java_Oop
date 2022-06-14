package com.codingdojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class RootController
{
    /* flash attribute redirect fix: */
    /* org.springframework.validation.BindingResult.model_name */

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @PostMapping("omikuji")
    public String proccess(HttpSession session,
                           @RequestParam("city") String city,
                           @RequestParam("person") String person,
                           @RequestParam("hobby") String hobby,
                           @RequestParam("thing") String thing,
                           @RequestParam("message") String message) {

            session.setAttribute("person", person);
            session.setAttribute("city", city);
            session.setAttribute("hobby", hobby);
            session.setAttribute("thing", thing);
            session.setAttribute("message", message);

                    return "redirect:/show";
    }

    @GetMapping ("/show")
    public String showPage() {

        return "/show";


    }
};