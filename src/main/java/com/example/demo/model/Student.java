package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="student_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String dept;
    private String fatherName;
    private String motherName;
    private String batchInfo;
    @OneToMany(mappedBy = "studentInfo",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<BillingDetails> billingDetailsList;

    public Student(String name, String dept, String fatherName, String motherName, String batchInfo) {
        this.name = name;
        this.dept = dept;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.batchInfo = batchInfo;
    }
}
