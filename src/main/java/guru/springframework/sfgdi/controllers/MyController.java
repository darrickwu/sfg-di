package guru.springframework.sfgdi.controllers;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Helo world");
        return "Hi FOlks";
    }
}
