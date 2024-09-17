package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // Define a private field for dependency

    private Coach mycoach;

    //Define a constructor for dependency injection
    @Autowired
    public DemoController(Coach thecoach){
        mycoach = thecoach;

    }

     @GetMapping("/getdailyworkout")
    public String getDailyWorkout(){
        return mycoach.getDailyWorkout();
     }

}
