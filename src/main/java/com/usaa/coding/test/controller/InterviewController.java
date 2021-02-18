package com.usaa.coding.test.controller;

import com.usaa.coding.test.domain.Challenge;
import com.usaa.coding.test.interfaces.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InterviewController {

    @Autowired
    InterviewService interviewService;

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/interviews/{interviewId}")
    public List<Challenge> getInterviewChallenges(@PathVariable String interviewId) {
        return interviewService.getInterview(interviewId);
    }
}
