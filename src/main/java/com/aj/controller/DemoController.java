package com.aj.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/web/hock/")
public class DemoController {

  @PostMapping(value = "personal")
  public void hello() {
    System.out.println("Got it!");
  }
}
