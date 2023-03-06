package dmg.spring.demo.services;

public class GreetingMessageImpl implements GreetingMessage {
    @Override
    public String greeting() {
        return "My Greeting";
    }
}
