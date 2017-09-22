package com.tdkdev.edu.subdlabs.service.impl;

import com.tdkdev.edu.subdlabs.service.LaboratoryOneService;
import org.springframework.stereotype.Service;

@Service
public class LaboratoryOneServiceImpl implements LaboratoryOneService {

  public String getHelloWorldMessage(String name) {
    return "My name is " + name;
  }

}
