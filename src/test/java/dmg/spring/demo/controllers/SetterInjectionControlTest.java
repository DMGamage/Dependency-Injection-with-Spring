package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessageImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControlTest {
    SetterInjectionControl controller;

    @Test
    void setGreetingMessage() {
    }

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionControl();
        controller.setGreetingMessage(new GreetingMessageImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}