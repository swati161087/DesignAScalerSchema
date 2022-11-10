package com.example.designscalerschema.models;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class StudentModuleExam extends BaseModel{
    @ManyToOne
    private Student student;
    @ManyToOne
    private ModuleExam moduleExam;
    private int marks;
}
