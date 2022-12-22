package com.rest.mvcexternalapi.controllers;

import com.rest.mvcexternalapi.models.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Slf4j
@RestController
@RequestMapping(path = "/serviceName",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class ServiceNowController {
    private final static String RESOURCE_URL = "https://dev122899.service-now.com/api/now/table/";
    private final static String SERVICENOW_USER = "admin";
    private final static String SERVICENOW_PASSWORD = "cSd@hKSD30$k";

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(path="/user",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public String createUser(@RequestBody User user) {
        URI requestUrl = UriComponentsBuilder.fromHttpUrl(RESOURCE_URL + "imp_user").build().toUri();
        log.info(String.format("%s: Request URL: %s", appName, requestUrl));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.setBasicAuth(SERVICENOW_USER,SERVICENOW_PASSWORD);

        log.info(String.format("%s: JSON body: %s", appName, user.toString()));

        HttpEntity<String> request = new HttpEntity<>(user.toString(), headers);
        String result = restTemplate.postForObject(requestUrl, request, String.class);
        return result;
    }

    @PostMapping(path="/incident",
        produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public String createIncident(@RequestBody Incident incident) {
        URI requestUrl = UriComponentsBuilder.fromHttpUrl(RESOURCE_URL + "incident").build().toUri();
        log.info(String.format("%s: Request URL: %s", appName, requestUrl));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.setBasicAuth(SERVICENOW_USER, SERVICENOW_PASSWORD);

        log.info(String.format("%s: JSON body: %s", appName, incident.toString()));

        HttpEntity<String> request = new HttpEntity<>(incident.toString(), headers);
        String result = restTemplate.postForObject(requestUrl, request, String.class);

        log.info(String.format("%s: Incident returned %s", appName, result));
        return result;
    }
}
