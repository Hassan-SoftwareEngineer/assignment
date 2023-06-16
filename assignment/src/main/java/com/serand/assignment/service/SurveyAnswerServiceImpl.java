package com.serand.assignment.service;

import com.serand.assignment.model.Survey;
import com.serand.assignment.model.SurveyAnswer;
import com.serand.assignment.repository.SurveyAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyAnswerServiceImpl implements SurveyAnswerService {

    private final SurveyService surveyService;
    private final SurveyAnswerRepository surveyAnswerRepository;

    public SurveyAnswerServiceImpl(SurveyService surveyService, SurveyAnswerRepository surveyAnswerRepository) {
        this.surveyService = surveyService;
        this.surveyAnswerRepository = surveyAnswerRepository;
    }

    @Override
    public SurveyAnswer saveSurveyAnswer(SurveyAnswer surveyAnswer) {
        Optional<Survey> optionalSurvey = surveyService.getSurvey(surveyAnswer.getSurveyId());
        if (optionalSurvey.isPresent()) {
            Survey survey = optionalSurvey.get();
            int points = 0;
            List<String> surveyAnswers = surveyAnswer.getAnswers();
            for (int i = 0; i < surveyAnswers.size(); i++) {
                if (i < survey.getQuestions().size()) {
                    if (surveyAnswers.get(i).equals(survey.getQuestions().get(i).getCorrectOptions())) {
                        points += survey.getQuestions().get(i).getPoint();
                    } else {
                        points += survey.getQuestions().get(i).getDefaultPoints();
                    }
                }
            }
            surveyAnswer.setTotalPoints(points);
        }
        return surveyAnswerRepository.save(surveyAnswer);
    }
}
