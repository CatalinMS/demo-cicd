package com.catalinms.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DemoController {

    private static final Logger LOG  = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/demo")
    public Mono<String> helloWorld() {
        LOG.info("/demo endpoint called");

        return Mono.just("Hello world!");
    }
    
}
