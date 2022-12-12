package GoGetters.jenkinsproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String main() {
        System.out.println("Hello jenkins");
        return "Hello";
    }
}
