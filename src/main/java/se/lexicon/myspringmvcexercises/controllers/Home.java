package se.lexicon.myspringmvcexercises.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.lexicon.myspringmvcexercises.model.Contact;
import se.lexicon.myspringmvcexercises.model.Contacts;
import se.lexicon.myspringmvcexercises.repository.ContactRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/home")
public class Home {

    List<Contact> stringContact = new ArrayList<>();

    @Autowired
    ContactRepository contRepo;

    @GetMapping(path = {"/index"})
    public String index(){
        return "index";
    }

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

        stringContact.add(new Contact(1,"text1"));
        stringContact.add(new Contact(2, "Text2"));
        stringContact.add(new Contact(3, "text3"));

        model.addAttribute("stringContact", stringContact);
        return "contactlist";
    }

    @GetMapping(path = {"/about"})
    public String about(){
        return "about";

    }
}
