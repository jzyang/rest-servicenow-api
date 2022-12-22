package com.rest.mvcexternalapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MVCExternalApiApplication {
    private final static int DEFAULT_HTTP_TIMEOUT_MS = 1_500;

    @Value("${service.request.timeout.ms}")
    private String waitTimeoutInMs;

    @Bean
    @Lazy
    public RestTemplate getRestTemplate() {
        return new RestTemplate(getClientHttpRequestFactory());
    }

    private SimpleClientHttpRequestFactory getClientHttpRequestFactory() {
        int waitTimeout = Integer.getInteger(this.waitTimeoutInMs, DEFAULT_HTTP_TIMEOUT_MS);
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(waitTimeout);
        clientHttpRequestFactory.setReadTimeout(waitTimeout);

        return clientHttpRequestFactory;
    }

    public static void main(String[] args) {
        SpringApplication.run(MVCExternalApiApplication.class, args);
    }

}
