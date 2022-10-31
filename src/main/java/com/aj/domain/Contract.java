package com.aj.domain;

public class Contract {
  private final String name;

  public Contract(String name) {
    this.name = name;
  }

  public String toString() {
    return new com.google.gson.Gson().toJson(this);
  }
}
