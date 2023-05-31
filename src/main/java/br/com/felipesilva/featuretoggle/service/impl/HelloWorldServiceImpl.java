package br.com.felipesilva.featuretoggle.service.impl;

import br.com.felipesilva.featuretoggle.annotation.Toggle;
import br.com.felipesilva.featuretoggle.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Toggle(name = "hello-world")
    @Override
    public String helloWorld() {
        return "Hello World!!!";
    }
}
