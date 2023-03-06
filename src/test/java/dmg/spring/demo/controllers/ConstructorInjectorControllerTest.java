package dmg.spring.demo.controllers;

import dmg.spring.demo.services.GreetingMessageImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectorControllerTest {

    public ConstructorInjectorController constructorInjectorController;


    @BeforeEach
    void setUp() {
        constructorInjectorController = new ConstructorInjectorController(new GreetingMessageImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectorController.getGreeting());
    }
}