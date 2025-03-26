package com.smartict.videoconference.service;

import org.springframework.stereotype.Service;

@Service
public class JitsiService {

    public String generateMeetingLink(String roomName) {
        String jitsiDomain = "https://meet.smartict.com";
        return jitsiDomain + "/" + roomName;
    }
}
