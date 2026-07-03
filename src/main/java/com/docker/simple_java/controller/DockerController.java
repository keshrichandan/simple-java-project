package com.docker.simple_java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("test/docker")
public class DockerController {

    @GetMapping("/getDt")
    public ResponseEntity<String> getTodayDate(){
        Date date = new Date();
        System.out.println("today is " + new Date());
        String date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    return new ResponseEntity<>(date1, HttpStatus.OK);
    }
}
