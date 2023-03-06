package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessageImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControlTest {

    public PropertyInjectionControl propertyInjectionControl;

    @BeforeEach
    void setUp() {
        propertyInjectionControl = new PropertyInjectionControl();

        propertyInjectionControl.greetingMessage=new GreetingMessageImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectionControl.greetingMessage);
    }
}