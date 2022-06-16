package com.codingdojo.controllers;

import com.codingdojo.models.Travel;
import com.codingdojo.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/edit/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Travel expense = travelService.findTravelById(id);
        model.addAttribute("expense", expense);
        return "edit";
    }

    @PutMapping("/edit/{id}")
    public String update(
            @PathVariable("id") Long id,
            Model model,
            @Valid @ModelAttribute("expense") Travel travel,
            BindingResult result) {
        if(result.hasErrors()) {
            return "redirect:/edit" + id;
        }else {
            travelService.updateTravel(travel);
            return "redirect:/dashboard";
        }
    }

    @RequestMapping(value="/dashboard/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        travelService.deleteTravel(id);

        return "redirect:/dashboard";
    }

    @GetMapping("/show/{id}")
    public String get(@PathVariable("id") Long id, Model model) {
        Travel expense = travelService.findTravelById(id);
        model.addAttribute("expense", expense);
        return "show";
    }



//    @RequestMapping("/travel/{id}")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        Travel travel = travelService.findTravelById(id);
//        model.addAttribute("travel", travel);
//        return "edit";
//    }
//
//    @RequestMapping(value="/edit/{id}", method= RequestMethod.PUT)
//    public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/edit";
//        } else {
//            travelService.updateTravel(travel);
//            return "redirect:/edit";
//        }
//
//    }
};





/* flash attribute redirect fix: */
/* org.springframework.validation.BindingResult.model_name */

//        public RootController(TravelService travelService) {
//            this.travelService = travelService;
//