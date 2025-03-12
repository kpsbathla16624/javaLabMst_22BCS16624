package com.example.labmst.Models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private int age;
    private String email;

}
