package com.example.java23webservices_gritacademyapicarlsundberg;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootTest
class Java23WebServicesGritAcademyApiCarlSundbergApplicationTests {

    @Test
    void contextLoads() {
    }
@GetMapping
    public String Hello() {
        List.of("Hello, World");
        return null;
    }

}
