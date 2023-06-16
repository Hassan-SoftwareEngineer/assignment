package com.serand.assignment.sample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serand.assignment.model.Survey;
import com.serand.assignment.service.SurveyService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoData {
    private final SurveyService surveyService;

    public DemoData(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @EventListener
    public void appReady(ApplicationReadyEvent event) throws JsonProcessingException {
        String survey1 = "{\n" +
                "    \"name\": \"developer survey\",\n" +
                "    \"questions\": [\n" +
                "        {\n" +
                "            \"name\": \"What is your name?\",\n" +
                "            \"point\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"What is your favourite color?\",\n" +
                "            \"correctOptions\": \"red\",\n" +
                "            \"point\": 2\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"What is the color of Ocean and Grass?\",\n" +
                "            \"options\": [\n" +
                "                {\n" +
                "                    \"option\": \"blue\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"option\": \"red\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"option\": \"green\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"correctOptions\": \"blue, green\",\n" +
                "            \"point\": 2\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        String strSurvey2  = "{\n" +
                "    \"name\": \"Devops survey\",\n" +
                "    \"questions\": [\n" +
                "        {\n" +
                "            \"name\": \"What is your name?\",\n" +
                "            \"point\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"What is your favourite color?\",\n" +
                "            \"correctOptions\": \"red\",\n" +
                "            \"point\": 2\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"Which cloud do you use?\",\n" +
                "            \"options\": [\n" +
                "                {\n" +
                "                    \"option\": \"AWS\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"option\": \"Gcloud\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"option\": \"Azure\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"correctOptions\": \"Azure\",\n" +
                "            \"point\": 2\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        String strSurvey3 = "{\n" +
                "    \"name\": \"Sample survey\",\n" +
                "    \"questions\": [\n" +
                "        {\n" +
                "            \"name\": \"What is your name?\",\n" +
                "            \"point\": 1\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        Survey survey = mapper.readValue(survey1, Survey.class);
        Survey survey2 = mapper.readValue(strSurvey2, Survey.class);
        Survey survey3 = mapper.readValue(strSurvey3, Survey.class);

        surveyService.createSurvey(survey);
        surveyService.createSurvey(survey2);
        surveyService.createSurvey(survey3);
    }
}
