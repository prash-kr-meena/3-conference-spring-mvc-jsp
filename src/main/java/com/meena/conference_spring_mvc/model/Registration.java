package com.meena.conference_spring_mvc.model;

public class Registration {
  private String name;

  public String getName() {
    System.out.println("GETTER - name - Registration");
    return name;
  }

  public void setName(String name) {
    System.out.println("SETTER - name - Registration");
    this.name = name;
  }
}
