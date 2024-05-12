package com.riaz.ktest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Ping {

    private static String pongString;

    {
        Random random = new Random();
        pongString =  "PONG: " + Math.abs(random.nextInt()%100);
    }

    @GetMapping("/ping")
    public String ping() {
        return pongString;
    }

}
