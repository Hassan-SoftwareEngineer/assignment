package com.serand.assignment.controller;


import com.serand.assignment.model.Candidate;
import com.serand.assignment.model.SurveyAnswer;
import com.serand.assignment.service.CandidateService;
import com.serand.assignment.service.SurveyAnswerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Responsible for all user related endpoints.
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/candidates")
public class CandidateController {

    private final CandidateService candidateService;
    private final SurveyAnswerService surveyAnswerService;

    public CandidateController(CandidateService candidateService, SurveyAnswerService surveyAnswerService) {
        this.candidateService = candidateService;
        this.surveyAnswerService = surveyAnswerService;
    }

    @PostMapping
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate) {
        Candidate savedCandidate = candidateService.addCandidate(candidate);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCandidate);
    }

    @PostMapping("/{candidateId}/survey/{surveyId}")
    public ResponseEntity<?> fillSurvey(@RequestBody SurveyAnswer surveyAnswer, @PathVariable String candidateId, @PathVariable String surveyId) {
        surveyAnswer.setCandidateId(candidateId);
        surveyAnswer.setSurveyId(surveyId);
        return ResponseEntity.status(HttpStatus.CREATED).body(surveyAnswerService.saveSurveyAnswer(surveyAnswer));
    }

}