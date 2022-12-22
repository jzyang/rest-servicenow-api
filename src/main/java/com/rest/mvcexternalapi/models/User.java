package com.rest.mvcexternalapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("")
@NoArgsConstructor
public class User {
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private String email;
    private String userId;
    private String firstName;

    private String lastName;

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        ObjectWriter objectWriter = OBJECT_MAPPER.writer();
        try
        {
            return objectWriter.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            log.error("Was unable to parse this JSON", e.getMessage());
        }

        return "";
    }
}
