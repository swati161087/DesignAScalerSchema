package com.example.designscalerschema.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Module extends BaseModel{
    private String name;
    @ManyToMany
    private List<Student> enrolledStudents;
    @OneToMany(mappedBy = "module")
    private List<ModuleExam> moduleExams;
}
