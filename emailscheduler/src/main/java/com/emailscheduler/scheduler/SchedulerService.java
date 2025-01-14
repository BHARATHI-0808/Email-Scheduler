package com.emailscheduler.scheduler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.emailscheduler.service.EmailService;

@Component
public class SchedulerService {
    @Autowired
    private EmailService emailService;
    
    @Scheduled(cron = "0 5 * * * ?")
    public void sendScheduledEmail() {
        String to = "bharathijs2005@gmail.com";
        String subject = "Scheduled Email Notification";
        String body = "This is a scheduled email sent using Spring Boot.";
            
        emailService.sendEmail(to, subject, body);
        System.out.println("email sended successfully");
    }
}
