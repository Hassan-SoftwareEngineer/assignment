package com.serand.assignment.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "job")
public class Job {
    private String companyId;
    private String name;
    private String jobDescription;
    @DBRef
    private List<Candidate> candidate;
}
