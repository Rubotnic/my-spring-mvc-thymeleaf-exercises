package se.lexicon.myspringmvcexercises.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.lexicon.myspringmvcexercises.model.FeverReg;
import se.lexicon.myspringmvcexercises.repository.FeverRepository;

import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/home2")
public class Fever {

    @Autowired
    FeverRepository feverRepo;



    @GetMapping("/create-fever")
    public String feverRegistration(Model model){

        FeverReg feverReg = new FeverReg();
        model.addAttribute("fever1", feverReg);
//
        List<String> listControll = Arrays.asList("Normal", "FEVER", "HYPERTHERMIA");
        model.addAttribute("listControll", listControll);

        List<FeverReg> feverRegs = (List<FeverReg>) feverRepo.findAll();
        model.addAttribute("feverRegs", feverRegs);

        return "create-fever";
    }

    @PostMapping("/save")
    public String createFever(@ModelAttribute("fever1") FeverReg feverReg) {

        feverRepo.save(feverReg);
        System.out.println(feverReg);
        return "/result";

    }
}
