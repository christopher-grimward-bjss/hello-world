package com.performance.test.performanceTesting.optionone;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GreetingsRepository {

    private List<Greeting> greetings;

    public GreetingsRepository() {
        greetings = List.of( new Greeting("Hello World", "English"),
                new Greeting("Hallo Welt", "German"),
                new Greeting("नमस्ते दुनिया", "Hindi"),
                new Greeting("Привет, мир", "Russian"),
                new Greeting("Hàlo a Shaoghail", "Scottish Gaelic"));
    }


    public Optional<Greeting> findGreetingByLanguage(String language) {
        return greetings.stream().filter(g -> g.getLanguage().equalsIgnoreCase(language)).findFirst();
    }
}
