package com.smzgo.linuxtext.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellow")
public class HellowController {


    @GetMapping("")
    public String hellow() {
        System.out.println("ok");
        return "ok";
    }

}
