package com.cvalcoding.java_structure.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "employee")
@Entity
@Getter
@Setter
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String email;

  public Employee() {}

  public Employee(String name, String email) {
    this.name = name;
    this.email = email;
  }
}
