package com.bitgo.api.service;

import com.bitgo.api.util.NotificationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

//    @Autowired
//    private JavaMailSender mailSender;

    public void sendEmail(String[] to, String subject, String body){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);

        try{
           // mailSender.send(simpleMailMessage);
        } catch(Exception e ){
            e.printStackTrace();
        }
    }

    public NotificationStatus printMessage(String message){
        System.out.println("Message:= "+message);
        return NotificationStatus.SENT;
    }


}
