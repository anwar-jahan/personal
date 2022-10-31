package com.aj.domain;

public class Event {
  private final String name;

  public Event(String name) {
    this.name = name;
  }

  public String toString() {
    return new com.google.gson.Gson().toJson(this);
  }
}
