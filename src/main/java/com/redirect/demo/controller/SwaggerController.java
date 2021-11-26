package com.redirect.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class SwaggerController {

  @GetMapping
  public String swagger(){
    return "Aqui é o Swagger!!";
  }

}
