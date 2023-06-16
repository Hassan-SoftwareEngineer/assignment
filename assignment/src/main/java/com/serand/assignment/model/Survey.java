package com.serand.assignment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "surveys")
@Data
public class Survey {
    @Id
    private String id;
    private String name;
    private boolean isSurveyCompleted;
    List<Questions> questions;

}
