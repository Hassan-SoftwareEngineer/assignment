package com.serand.assignment.service;

import com.serand.assignment.model.Survey;
import com.serand.assignment.repository.SurveyRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface SurveyService {

    Survey createSurvey(Survey survey);
    void deleteSurvey(String id);

    Optional<Survey> getSurvey(String surveyId);
}
