package hu.HT.harmadikbeadando;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();


        @GetMapping("/harmadikBeadando")

        public Greeting greeting(@RequestParam(value = "name", defaultValue = "Felhasznalo") String name) {
            return new Greeting(String.format(template, name));
        }
    public String getMessage(@RequestParam String name) {
        return String.format("hello %s", name);
        }


    }




