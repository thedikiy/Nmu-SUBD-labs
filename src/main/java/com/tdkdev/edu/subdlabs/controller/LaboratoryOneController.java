package com.tdkdev.edu.subdlabs.controller;

import com.tdkdev.edu.subdlabs.service.LaboratoryOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class LaboratoryOneController {

  @Autowired
  private LaboratoryOneService service;


  @GetMapping(value = "/lab1")
  public String getHelloWorldMessage(@RequestParam("name") String name){
    return service.getHelloWorldMessage(name);
  }

}
