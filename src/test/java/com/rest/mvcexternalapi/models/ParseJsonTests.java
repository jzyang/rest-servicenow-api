package com.rest.mvcexternalapi.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
public class ParseJsonTests {
    @Test
    public void parseDefaultResponseItem() throws IOException {
        final String defaultResponse = "{}";

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseItem responseItem = objectMapper.readValue(defaultResponse, ResponseItem.class);

        System.out.printf("Result: %s%n", responseItem.toString());
        assertThat(responseItem.toString()).isEqualTo(defaultResponse);
    }

    @Test
    public void parseDefaultServiceItem() throws JsonProcessingException {
        final String defaultServiceItem = "{\"id\":\"0\", \"links\":[]}";

        ObjectMapper objectMapper = new ObjectMapper();
        ServiceItem serviceItem = objectMapper.readValue(defaultServiceItem, ServiceItem.class);

        System.out.printf("Result: %s%n", serviceItem.toString());
        assertThat(serviceItem.toString()).isEqualTo(defaultServiceItem);
    }

    @Test
    public void parseResponseItem() throws IOException {
        final String expectedJson = "{}";

        String filePath = "src/test/resources/responseItem.json";
        File jsonFile = new File(filePath);
        System.out.printf("File path: %s%n", jsonFile.getAbsolutePath());

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseItem responseItem = objectMapper.readValue(jsonFile, ResponseItem.class);

        System.out.printf("Result: %s%n", responseItem.toString());
        assertThat(responseItem.toString()).isEqualTo(expectedJson);
    }

    @Test
    public void parseServiceItem() throws IOException {
        final String expectedJson = "{\"id\":\"0\", \"links\":[]}";

        String filePath = "src/test/resources/serviceItem.json";
        File jsonFile = new File(filePath);
        System.out.printf("File path: %s%n", jsonFile.getAbsolutePath());

        ObjectMapper objectMapper = new ObjectMapper();
        ServiceItem serviceItem = objectMapper.readValue(jsonFile, ServiceItem.class);

        System.out.printf("Result: %s%n", serviceItem.toString());
        assertThat(serviceItem.toString()).isEqualTo(expectedJson);
    }
}
