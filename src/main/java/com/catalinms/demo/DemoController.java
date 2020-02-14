package com.catalinms.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DemoController {
    
    @GetMapping("/demo")
    public Mono<String> helloWorld() {
        return Mono.just("Hello world!");    
    }
    
}
