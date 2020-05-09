package Payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  Employee() {

  }

  Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }
}