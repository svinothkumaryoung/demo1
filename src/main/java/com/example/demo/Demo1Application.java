package com.example.demo;

import com.example.demo.model.BillingDetails;
import com.example.demo.model.Student;
import com.example.demo.repository.BillingRepo;
import com.example.demo.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    private String description;
    private int amount;
    private String collectedPerson;
    @Bean
    public CommandLineRunner commandLineRunner(BillingRepo billingRepo, StudentRepo studentRepo){
        return args -> {
            Student student=new Student("Vinothkumar Selvaarasan","CSE","Selvaarasan","Nagalakshmi","2009-2010");
            studentRepo.save(student);
            BillingDetails billingDetails=new BillingDetails("1st Semester Amount",50000,"Krishnamoorthy",student);
            BillingDetails billingDetails1=new BillingDetails("2nd Semester Amount",60000,"Lavanya",student);
            billingRepo.save(billingDetails);
            billingRepo.save(billingDetails1);
        };
}


}
