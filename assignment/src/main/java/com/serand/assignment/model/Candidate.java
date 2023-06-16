package com.serand.assignment.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "candidates")
@Data
public class Candidate {
    @Id
    private String id;
    private String name;
    private String candidates;
    @DBRef
    private List<Job> appliedJobs;
}
