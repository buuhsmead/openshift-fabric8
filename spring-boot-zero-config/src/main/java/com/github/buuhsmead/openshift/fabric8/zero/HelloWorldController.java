package com.github.buuhsmead.openshift.fabric8.zero;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
