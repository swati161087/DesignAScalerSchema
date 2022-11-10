package com.example.designscalerschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student extends BaseModel{
    private String name;
    private String address;
    private String email;
   @ManyToMany(mappedBy = "enrolledStudents")
   List<Module> enrolledModules;
    // we shold add list only on one side, as it will create 2 tables then.

}
