package com.rest.mvcexternalapi.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class OutputJsonTest {
    @Test
    public void DefaultResponseItemJsonStr() {
        String expectedJsonStr = "{}";

        ResponseItem responseItem = new ResponseItem();

        assertThat(responseItem.toString()).isEqualTo(expectedJsonStr);
    }

    @Test
    public void DefaultServiceItemJsonStr() {
        String expectedJsonStr = "{}";

        ServiceItem serviceItem = new ServiceItem();

        assertThat(serviceItem.toString()).isEqualTo(expectedJsonStr);
    }

    @Test
    public void ResponseItemJsonStr() {
        final String expectedJsonStr = "{\"list\":[{\"id\":\"123\",\"name\":\"Test\",\"links\":[]}]}";

        ResponseItem responseItem = new ResponseItem();
        responseItem.setList(List.of(new ServiceItemResource(new ServiceItem("123", "Test"))));

        assertThat(responseItem.toString()).isEqualTo(expectedJsonStr);
        assertThat(responseItem.toString()).contains("\"list\":");
        assertThat(responseItem.toString()).contains("123");
        assertThat(responseItem.toString()).contains("Test");
    }

    @Test
    public void ServiceItemJsonStr() {
        final String expectedJsonStr = "{\"id\":\"123\",\"name\":\"Test\",\"links\":[]}";

        ServiceItemResource serviceItem = new ServiceItemResource(new ServiceItem("123", "Test"));

        assertThat(serviceItem.toString()).isEqualTo(expectedJsonStr);
        assertThat(serviceItem.toString()).contains("\"id\":");
        assertThat(serviceItem.toString()).contains("123");
        assertThat(serviceItem.toString()).contains("\"name\":");
        assertThat(serviceItem.toString()).contains("Test");
    }
}
