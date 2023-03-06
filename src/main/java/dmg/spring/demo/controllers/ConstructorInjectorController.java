package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessage;

public class ConstructorInjectorController {

    private final GreetingMessage greetingMessage;

    public ConstructorInjectorController(GreetingMessage greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String getGreeting(){
        return greetingMessage.greeting();
    }
}
