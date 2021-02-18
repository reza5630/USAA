package com.usaa.coding.test.part123;

import com.usaa.coding.test.domain.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Part2 {
//    public static void main(String[] args) {
//        List<Challenge> challenges = new ArrayList<>();
//
//        challenges.add(new Challenge("Question 1", "1"));
//        challenges.add(new Challenge("Question 2", "2"));
//        challenges.add(new Challenge("Question 4", "3"));
//
//        System.out.println(isPassing(challenges));
//    }

    public Object isPassing(List<Challenge> challenges) {
        if (challenges == null || challenges.size() == 0)
            return null;
        else {
            long count = challenges.stream().filter(Challenge::isCorrect).count();
            double score = count/challenges.size();
            return score > .875;
        }
    }
}
