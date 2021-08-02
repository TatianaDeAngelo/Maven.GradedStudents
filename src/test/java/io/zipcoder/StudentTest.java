package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void setFirstNameTest() {
        //Given
        String firstName = "Emily";
        String lastName = "Zimmerman";
        Double [] examScores = {59.67, 73.4, 87.9};
        Student newStudent = new Student(firstName, lastName, examScores);

        //When
        String actual = newStudent.getFirstName();

        //Then
        Assert.assertEquals(firstName, actual);
    }

    @Test
    public void setLastNameTest() {
        //Given
        String firstName = "Emily";
        String lastName = "Zimmerman";
        Double [] examScores = {59.67, 73.4, 87.9};
        Student newStudent = new Student(firstName, lastName, examScores);

        //When
        String actual = newStudent.getLastName();

        //Then
        Assert.assertEquals(lastName, actual);
    }

    @Test
    public void getExamScoresTest() {
    // : Given
    String firstName = "Leon";
    String lastName = "Hunter";
    Double[] examScores = {100.0, 95.0, 123.0, 96.0};
    Student student = new Student(firstName, lastName, examScores);

    // When
    String expected = "100.0, 95.0, 123.0, 96.0";
    String actual = student.getExamScores();


    // Then
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAverageExamScoreTest() {
        //Given
        String firstName = "Emily";
        String lastName = "Zimmerman";
        Double [] examScores = {59.67, 73.4, 87.9};
        Student newStudent = new Student(firstName, lastName, examScores);

        //When
        double expected = 73.65;
        double actual = newStudent.getAverageExamScore();


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestToString() {
        //Given
        String firstName = "Emily";
        String lastName = "Zimmerman";
        Double [] examScores = {59.67, 73.4, 87.9};
        Student newStudent = new Student(firstName, lastName, examScores);

        //When
        String expected = "Student Name: Emily Zimmerman\n Class Average: 73.65\n Exam Scores: 59.67, 73.4, 87.9";
        String actual = newStudent.toString();

        //Then
        Assert.assertEquals(expected, actual);
    }








}


