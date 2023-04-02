package com.springboot.demo.mycoolapp.rest;

import com.springboot.demo.mycoolapp.entities.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//@Controller
//@ResponseBody
@RestController
//@RequestMapping("/test")
public class FunRestController {

    //inject properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfor() {
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }


    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World, Spring Boot App.";
    }

    //expose new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "My lucky day";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
