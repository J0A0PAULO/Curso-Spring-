package br.com.curso.spring.controllers;

import br.com.curso.spring.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String TEMPLATE = "hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    //http://localhost:8800/greeting?name=joao;
    @RequestMapping("/greeting")
    public Greeting greeting (
            @RequestParam(value = "name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
