package hu.HT.harmadikbeadando;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@ResponseBody
public class MainController  {



   @GetMapping(path = "/harmadik")

  public String getMessage(@RequestParam String name) {
       if (name == null) {
           return String.format("Hello felhasznalo");
       }
            else {
               return String.format("hello %s", name);
           }
       
           
           
       }
               


   }