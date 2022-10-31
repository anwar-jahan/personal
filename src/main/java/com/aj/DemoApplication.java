package com.aj;

import com.aj.domain.Contract;
import com.aj.domain.Event;
import com.aj.domain.Hello;
import com.aj.domain.MyTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) throws IOException {

    SpringApplication.run(DemoApplication.class, args);
    //    Console console = System.console();
    //    if (console == null) {
    //      throw new RuntimeException("Console not available!");
    //    } else {
    //      console.writer().println("How excited are you about your trip today? ");
    //      console.flush();
    //      String excitementAnswer = console.readLine();
    //      String name = console.readLine("Please enter your name: ");
    //
    //      Integer age = null;
    //      console.writer().print("what is your age? ");
    //      console.flush();
    //
    //      BufferedReader reader = new BufferedReader(console.reader());
    //      String value = reader.readLine();
    //      age = Integer.valueOf(value);
    //      console.writer().println();
    //
    //      console.format("Your name is " + name);
    //      console.writer().println();
    //      console.format("Your age is" + age);
    //      console.printf("Your excitement level is: " + excitementAnswer);
    //    }
  }
}
