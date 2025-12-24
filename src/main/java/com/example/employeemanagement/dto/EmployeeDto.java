package com.example.employeemanagement.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private String name;
    private String email;
    private String department;
    private double salary;
}
