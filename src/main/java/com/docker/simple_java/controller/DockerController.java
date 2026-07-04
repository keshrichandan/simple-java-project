package com.docker.simple_java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RestController
@RequestMapping("test/docker")
public class DockerController {

    @GetMapping("/getDt")
    public ResponseEntity<String> getTodayDate(){
        Date date = new Date();
        System.out.println("today's system datetime: " + new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String istDATE = sdf.format(date);
        System.out.println("today's IST datetime: " + istDATE);
    return new ResponseEntity<>(istDATE, HttpStatus.OK);
    }
}
