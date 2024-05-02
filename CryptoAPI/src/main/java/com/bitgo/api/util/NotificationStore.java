package com.bitgo.api.util;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NotificationStore {

    public static Map<String, String> notificationStatus = new HashMap<>();

    public String getNotificationStatus(String messageId){
        return notificationStatus.get(messageId);
    }

    public void deleteNotification(String messageId){
        notificationStatus.remove(messageId);
    }

    public Map<String, String> listNotification(){
        return notificationStatus;
    }
}
