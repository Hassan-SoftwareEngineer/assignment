package com.serand.assignment.repository;

import com.serand.assignment.model.SurveyAnswer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurveyAnswerRepository extends MongoRepository<SurveyAnswer, String> {
}
