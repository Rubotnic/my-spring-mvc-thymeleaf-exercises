package se.lexicon.myspringmvcexercises.controllers;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.lexicon.myspringmvcexercises.model.Contacts;
import se.lexicon.myspringmvcexercises.repository.ContactRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/home")
public class Home {

    @Autowired
    ContactRepository contRepo;


    @GetMapping(path = {"/index"})
    public String index(){
        return "index";
    }


// linked to contact.html
   @GetMapping(path = {"/contact"})
    public String contact1(Model model){

        Contacts aContacts = new Contacts();
        model.addAttribute("contact1", aContacts);
        return "contact";
    }

    @PostMapping("/save")
   public String createContact(Contacts contacts, Model model) {

        contRepo.save(contacts);

       return "redirect:/home/contact";
    }


    @GetMapping(path = {"/contactlist"})
    public String contactList(Model model){

        List<String> listTexts = Arrays.asList("text");

        model.addAttribute("listText", listTexts);
        return "contactlist";
    }

    @GetMapping(path = {"/about"})
    public String about(){

        return "about";

    }
}
