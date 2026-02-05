
package com.hotel.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String employeeId;
    private String name;
    private String position;
    private double salary;
    private String email;
    private String phone;
    
    public Employee(String employeeId, String name, String position, double salary, String email, String phone) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
    }
    
    
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    
    public void setPosition(String position) { this.position = position; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    
    @Override
    public String toString() {
        return String.format("Employee ID: %s, Name: %s, Position: %s, Salary: $%.2f",
            employeeId, name, position, salary);
    }
}