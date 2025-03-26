package com.smartict.videoconference.controller;

import com.smartict.videoconference.service.JitsiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/video")
public class JitsiController {

    private final JitsiService jitsiService;

    public JitsiController(JitsiService jitsiService) {
        this.jitsiService = jitsiService;
    }

    @GetMapping("/join")
    public String joinMeeting(@RequestParam String roomName) {
        return jitsiService.generateMeetingLink(roomName);
    }
}
