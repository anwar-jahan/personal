package com.aj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/aj")
public class HelloController {

  @GetMapping(value = "/hello")
  public String hello() {
    return "Hello World";
  }
}
