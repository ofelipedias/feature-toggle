package br.com.felipesilva.featuretoggle.controller;

import br.com.felipesilva.featuretoggle.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld();
    }
}