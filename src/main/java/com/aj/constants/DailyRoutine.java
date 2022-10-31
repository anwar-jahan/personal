package com.aj.constants;

public enum DailyRoutine {
  MORNING("Good Morning") {
    public void printHours() {
      System.out.println("6am-10am");
    }
  },
  NOON("Good AfterNoon") {
    public void printHours() {
      System.out.println("11am-1pm");
    }
  },
  AFTER_NOON("Good AfterNoon") {
    public void printHours() {
      System.out.println("2pm-5pm");
    }
  },
  EVENING("Good Evening") {
    public void printHours() {
      System.out.println("5pm-9pm");
    }
  },
  NIGHT("Good Night") {
    public void printHours() {
      System.out.println("10pm-12am");
    }
  },
  MID_NIGHT("Have a Sweet Dream") {
    public void printHours() {
      System.out.println("1am-4am");
    }
  };

  public void printHours() {
    System.out.println("12am-12PM");
  }

  DailyRoutine(String greeting) {
    this.greeting = greeting;
  }

  private final String greeting;
}
