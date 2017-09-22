package com.tdkdev.edu.subdlabs.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class MainController {

  @GetMapping("/list")
  public List<String> getLaboratories(){
    return Arrays.asList("lab1", "lab2");
  }

}
