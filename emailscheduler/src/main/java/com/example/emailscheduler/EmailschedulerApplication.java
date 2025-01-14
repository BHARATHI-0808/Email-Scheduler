package com.example.emailscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // Add this annotation to enable scheduling
public class EmailschedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailschedulerApplication.class, args);
    }
}
