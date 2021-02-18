package com.usaa.coding.test.interfaces;

import com.usaa.coding.test.domain.Challenge;

import java.util.List;

public interface InterviewService {
    /**

     * Looks up all [Challenge] associated with

     * an interview identified by id and returns

     * as a List.

     */

    List<Challenge> getInterview(String id);
}
