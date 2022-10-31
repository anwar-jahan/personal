package com.aj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/webhook")
public class DemoController {

  @PostMapping
  public ResponseEntity<String> hello(@RequestBody String request) {
    System.out.println("##### Web Hook #####" + request);
    return new ResponseEntity<>(request, HttpStatus.OK);
  }
  // ##ENTRYPOINT ["java","-jar","/personal.jar"]
}
