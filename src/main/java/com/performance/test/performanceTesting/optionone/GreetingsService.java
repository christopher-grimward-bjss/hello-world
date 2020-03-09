package com.performance.test.performanceTesting.optionone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    private final GreetingsRepository repository;

    @Autowired
    public GreetingsService(GreetingsRepository repository) {
        this.repository = repository;
    }

    public Greeting getGreetingByLanguage(String language) throws GreetingNotFoundException{
        return repository.findGreetingByLanguage(language)
                .orElseThrow(() -> new GreetingNotFoundException(language, "Greeting not found"));
    }
}
