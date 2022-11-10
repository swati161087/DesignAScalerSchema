package com.example.designscalerschema.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exam extends  BaseModel{
    private int duration;
    private String name;

}
