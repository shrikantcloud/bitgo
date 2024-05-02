package com.bitgo.api.controller;

import com.bitgo.api.model.BitCoinDetails;
import com.bitgo.api.service.NotificationService;
import com.bitgo.api.util.NotificationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notify")
    public ResponseEntity<?> sendNotification(@RequestBody BitCoinDetails bitCoinDetails){
        System.out.println("Inside sendNotification Controller");
        //BitCoinDetails details = new BitCoinDetails(bitCoinDetails.getCurrentPrice(), bitCoinDetails.getDailyPercentageChange(), bitCoinDetails.getTradingVolume());
        StringBuilder message = new StringBuilder();
        message.append("Current Price of the BitCoin = ").append(bitCoinDetails.getCurrentPrice()).append("\n");
        message.append("Daily Percentage Change of the BitCoin = "+ bitCoinDetails.getDailyPercentageChange()).append("\n");
        message.append("Trading Volume of the BitCoin = "+ bitCoinDetails.getTradingVolume()).append("\n");

        NotificationStatus status = notificationService.printMessage(message.toString());

        return new ResponseEntity<>(status.toString(), HttpStatus.OK);

    }
}
