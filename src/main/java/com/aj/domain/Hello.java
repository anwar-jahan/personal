package com.aj.domain;

public class Hello {
  private final Event event;
  private final Contract contract;

  public Hello(Event event, Contract contract) {
    this.event = event;
    this.contract = contract;
  }

  public String toString() {
    return new com.google.gson.Gson().toJson(this);
  }
}
