package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="billing_details")
public class BillingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String description;
    private int amount;
    private String collectedPerson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="student_id")
    private Student studentInfo;

    public BillingDetails(String description, int amount, String collectedPerson, Student studentInfo) {
        this.description = description;
        this.amount = amount;
        this.collectedPerson = collectedPerson;
        this.studentInfo = studentInfo;
    }
}
