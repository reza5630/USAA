package com.usaa.coding.test.service;


import com.usaa.coding.test.domain.Challenge;
import com.usaa.coding.test.interfaces.InterviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImp implements InterviewService {
    @Override
    public List<Challenge> getInterview(String id) {
        return null;
    }
}
