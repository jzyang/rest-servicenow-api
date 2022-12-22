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
public class Incident {
    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private boolean active;
    private String callerId;
    private String shortDescription;
    private String incidentNumber;
    private int priority;
    private int severity;
    private int urgency;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    @JsonProperty("number")
    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public boolean isActive() {
        return active;
    }

    @JsonProperty("caller_id")
    public String getCallerId() {
        return callerId;
    }

    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
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
