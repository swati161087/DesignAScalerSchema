package com.example.designscalerschema.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class ModuleExam extends BaseModel{
    @ManyToOne
    Module module; // cardinality between moduleExam and Module. because ModuleExam has Module
                    // ModuleExam     Module
                    //      1           1           1 ModuleExam has only one 1 Module
                    //      m           1           1 Module can be part of many ModuleExam so relantion is many to one
    @ManyToOne
    Exam exam;
    private Date dateOfExam;
}
