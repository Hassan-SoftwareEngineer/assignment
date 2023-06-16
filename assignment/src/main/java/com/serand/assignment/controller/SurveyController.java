package com.serand.assignment.controller;


import com.serand.assignment.model.Survey;
import com.serand.assignment.service.SurveyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Responsible for all user related endpoints.
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/surveys")
public class SurveyController {


	private final SurveyService surveyService;

	public SurveyController(SurveyService surveyService) {
		this.surveyService = surveyService;
	}

//	@GetMapping("/company/{companyId}")
//	public List<Survey> getSurveysByCompanyId(@PathVariable("companyId") String companyId) {
//		return surveyRepository.findByCompanyId(companyId);
//	}

	@PostMapping("/")
	public ResponseEntity<?> addSurvey(@RequestBody Survey survey) {
		return new ResponseEntity(surveyService.createSurvey(survey), HttpStatus.CREATED);
	}

	@DeleteMapping("/{surveyId}")
	public ResponseEntity<?> deleteSurvey(@PathVariable("surveyId") String surveyId) {
		return new ResponseEntity<>("", HttpStatus.ACCEPTED);
	}

	@GetMapping("/{surveyId}")
	public ResponseEntity<?> getSurvey(@PathVariable("surveyId") String surveyId) {
		return new ResponseEntity<>(surveyService.getSurvey(surveyId), HttpStatus.OK);
	}
}