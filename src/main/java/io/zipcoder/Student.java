package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>(); //initially said examScores but then continued to refer to it as testScores, so I changed it
    //Double [] testScores;


    public Student (String firstName, String lastName, Double [] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder exams = new StringBuilder();
        exams.append("Exam Scores: \n");

        double score = 0;
        for (int i = 0; i < examScores.size(); i++) {
             score = examScores.get(i);
             exams.append(String.format("Exam \n", " ", i, score));

        }
        return String.valueOf(exams);
    }


    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber - 1, newScore);
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
             sum += examScores.get(i);
             average = sum / examScores.size();
        }

        return average;
    }

    @Override
    public String toString() {
        return String.format("Student Name: %s %s\n" +
                "Class Average: %2.0f\n" + "Exam Scores: %s",
                firstName, lastName, getAverageExamScore(), getExamScores());
    }
}
