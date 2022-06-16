package com.codingdojo.controllers;

import com.codingdojo.models.Travel;
import com.codingdojo.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TravelController {
    //    connecting to service
    @Autowired
    TravelService travelService;

    @GetMapping("/dashboard")
    public String index(Model model) {

        List<Travel> expenses = travelService.allTravels();

        model.addAttribute("expensesFromController", expenses);


        return "index";
    }

    @PostMapping("/expenses")
    public String create(
            @RequestParam("expense") String expenses,
            @RequestParam("vendor") String vendor,
            @RequestParam("amount") int amount,
            @RequestParam("description") String description) {
        Travel travel = new Travel(expenses, vendor, amount, description);
        travelService.createTravel(travel);

        return "redirect:/dashboard";

    }
};





/* flash attribute redirect fix: */
/* org.springframework.validation.BindingResult.model_name */

//        public RootController(TravelService travelService) {
//            this.travelService = travelService;
//