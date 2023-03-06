package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class SetterInjectionControl {
    public GreetingMessage greetingMessage;
    @Autowired

    public void setGreetingMessage(GreetingMessage greetingMessage){
        this.greetingMessage = greetingMessage;

    }

    public String getGreeting(){
        return greetingMessage.greeting();
    }

}
