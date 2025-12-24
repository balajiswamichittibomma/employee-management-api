package com.example.employeemanagement.entity;
import jakarta.persistence.*;
import lombok.*;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "employees")
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private String department;
        private double salary;
    }


