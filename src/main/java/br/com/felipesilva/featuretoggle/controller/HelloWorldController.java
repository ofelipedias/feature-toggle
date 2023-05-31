package br.com.felipesilva.featuretoggle.controller;

import br.com.felipesilva.featuretoggle.annotation.Toggle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    @Toggle(name = "hello-world")
    @GetMapping
    public String helloWorld() {
        return "Hello World!!!";
    }
}
