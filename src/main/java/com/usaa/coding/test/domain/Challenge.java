package com.usaa.coding.test.domain;

import java.util.Hashtable;
import java.util.Objects;

public class Challenge {
    private String question;
    private String answer;
    private boolean correct;

    private static Hashtable questionSet;

    static {
        questionSet = new Hashtable();
        questionSet.put("Question 1", "1");
        questionSet.put("Question 2", "2");
        questionSet.put("Question 3", "3");
        questionSet.put("Question 4", "4");
        questionSet.put("Question 5", "5");
    }

    public Challenge(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        if (questionSet.containsKey(question))
            correct = questionSet.get(question).equals(answer);
        else
            correct = false;
        return correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return correct == challenge.correct && Objects.equals(question, challenge.question) && Objects.equals(answer, challenge.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, correct);
    }
}
