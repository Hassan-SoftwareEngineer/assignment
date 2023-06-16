package com.serand.assignment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Document(collection = "survey_answers")
public class SurveyAnswer {
    @Id
    private String id;
    private String surveyId;
    private String candidateId;
    List<String> answers;
    private int totalPoints;
}
