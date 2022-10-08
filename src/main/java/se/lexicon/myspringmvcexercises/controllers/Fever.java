package se.lexicon.myspringmvcexercises.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.lexicon.myspringmvcexercises.model.FeverStatus;
import se.lexicon.myspringmvcexercises.repository.FiverRepositpry;

@RequestMapping("/home")
public class Fever {

    @Autowired
    FiverRepositpry fiveRepo;

    @GetMapping(path = {"/fever"})
    public String contact1(Model model){

        FeverStatus aFeverSt = new FeverStatus();
        model.addAttribute("fever1", aFeverSt);
        return "fever";
    }

    @PostMapping("/save")
    public String createContact(FeverStatus feverStatus, Model model) {
        fiveRepo.save(feverStatus);

        return "redirect:/home/fever";

    }




}
