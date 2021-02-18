package com.usaa.coding.test.part123;


import com.usaa.coding.test.domain.Challenge;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Part2Tests {

    private static List<Challenge> challenges1;
    private static List<Challenge> challenges2;
    private static List<Challenge> challenges3;
    private static List<Challenge> challenges4;

    @BeforeAll
    public static void setupData(){
        challenges1 = new ArrayList<>();
        challenges1.add(new Challenge("Question 1", "1"));
        challenges1.add(new Challenge("Question 2", "2"));
        challenges1.add(new Challenge("Question 3", "3"));

        challenges2 = new ArrayList<>();
        challenges2.add(new Challenge("Question 1", "1"));
        challenges2.add(new Challenge("Question 2", "2"));
        challenges2.add(new Challenge("Question 4", "3"));

        challenges3 = new ArrayList<>();

    }

    @Test
    public void testIsPassing(){
        Part2 part2 = new Part2();
        assertEquals(part2.isPassing(challenges1), true);
        assertEquals(part2.isPassing(challenges2), false);
        assertNull(part2.isPassing(challenges3));
        assertNull(part2.isPassing(challenges4));

    }




}
