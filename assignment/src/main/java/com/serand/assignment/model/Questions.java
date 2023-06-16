package com.serand.assignment.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Questions {
    private String id;
    private String name;
    private List<QuestionOptions> options;
    private String correctOptions;
    private int point;
    private int defaultPoints;
}
