package com.arjun.spring1;

 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class MyFirstController {

    @GetMapping
    public String hellogetApi(){
        return "Hello Spring";
    }
    
}
