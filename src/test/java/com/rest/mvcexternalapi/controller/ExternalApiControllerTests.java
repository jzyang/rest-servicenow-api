package com.rest.mvcexternalapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;

public class ExternalApiControllerTests {
    @Autowired
    private RestTemplate testRestTemplate;

    @Test
    public void getServiceItem() throws IOException {
        final String filePath = "src/test/resources/response.json";
        File jsonFile = new File(filePath);

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseItem responseItem = objectMapper.readValue(jsonFile, ResponseItem.class);
        final String expectedJson = responseItem.toString();
//        System.out.println("Expected JSON: " + expectedJson);

//        testRestTemplate.getForObject("/giphy/cat", ResponseItem.class)
//                .exchange()
//                .expectStatus().isOk()
//                .expectHeader()
//                .contentType(MediaType.APPLICATION_JSON)
//                .expectHeader()
//                .contentLength(4062)
//                .expectBody()
//                .json(expectedJson);
    }
}
