package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessage;

public class SetterInjectionControl {
    public GreetingMessage greetingMessage;

    public void setGreetingMessage(GreetingMessage greetingMessage){
        this.greetingMessage = greetingMessage;

    }

    public String getGreeting(){
        return greetingMessage.greeting();
    }

}
