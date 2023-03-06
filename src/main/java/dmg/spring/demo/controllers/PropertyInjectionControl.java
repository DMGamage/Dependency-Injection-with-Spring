package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessage;

public class PropertyInjectionControl {

    public GreetingMessage greetingMessage;

    public String getGreeting(){
        return greetingMessage.greeting();
    }
}
