package com.serand.assignment.service;

import com.serand.assignment.model.Survey;
import com.serand.assignment.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService {
    private final SurveyRepository surveyRepository;
    @Autowired
    public SurveyServiceImpl(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }
    @Override
    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    @Override
    public void deleteSurvey(String id) {
        surveyRepository.deleteById(id);
    }

    @Override
    public Optional<Survey> getSurvey(String surveyId) {
        return surveyRepository.findById(surveyId);
    }
}
