package com.performance.test.performanceTesting.optionone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")
public class GreetingsController {

    private static final Logger LOG = LoggerFactory.getLogger(GreetingsController.class);
    private final GreetingsService service;

    @Autowired
    public GreetingsController(GreetingsService service) {
        this.service = service;
    }

    @GetMapping("/{language}")
    public ResponseEntity<Greeting> getGreetingByLanguage(@PathVariable("language") String language) throws GreetingNotFoundException {
        Greeting foundGreeting =  service.getGreetingByLanguage(language);
        return ResponseEntity.ok(foundGreeting);
    }
}
