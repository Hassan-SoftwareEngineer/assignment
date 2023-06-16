package com.serand.assignment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "companies")
@Data
public class Company {
    @Id
    private String id;
    private String name;
    private Job[] jobs;
}
