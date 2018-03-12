package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    //test commit




    Model model = new Model();

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user;
        user = model.getUser(username, password);
        System.out.println(user.getUsername() + " " + user.getPassword() );


        if (user != null) {
            System.out.println("succes");
            return "redirect:/HovedMenu";
        }
        return "index";
    }

    @RequestMapping(value = {"/Arnold"})
    public String Arnold() {
        return "Arnold";
    }

    @RequestMapping(value = {"HovedMenu"})
    public String HovedMenu() {
        return "HovedMenu";
    }
}