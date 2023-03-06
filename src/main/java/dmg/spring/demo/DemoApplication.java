package dmg.spring.demo;

import dmg.spring.demo.controllers.ConstructorInjectorController;
import dmg.spring.demo.controllers.MyController;
import dmg.spring.demo.controllers.PropertyInjectionControl;
import dmg.spring.demo.controllers.SetterInjectionControl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
         String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("---------Property injection");
        PropertyInjectionControl propertyInjectionControl = (PropertyInjectionControl) ctx.getBean("propertyInjectionControl");
        System.out.println(propertyInjectionControl.getGreeting());
        System.out.println("============Setter");
        SetterInjectionControl setterInjectionControl = (SetterInjectionControl) ctx.getBean("setterInjectionControl");
        System.out.println(setterInjectionControl.getGreeting());

        System.out.println("============Constructor");

        ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
        System.out.println(constructorInjectorController.getGreeting());

    }

}
