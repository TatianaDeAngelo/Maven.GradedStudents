package io.zipcoder;

import java.util.*;

public class Classroom {

    int maxNumberOfStudents;
    Student[] students;

    public Classroom (int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom (Student[] Student) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(Student[] students) {
        double total = 0.0;
        for (Student avg : students) {
            total += avg.getAverageExamScore();
        }

        return total / students.length;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
            
        }
    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> remStudent = new ArrayList<Student> (Arrays.asList(students));

        for (int i = 0; i < remStudent.size(); i++) {
            Student student = remStudent.get(i);
            if(student == null) {
                continue;
            } else if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                remStudent.remove(student);
                remStudent.add(null);
            }
        }
        this.students = remStudent.toArray(new Student[0]);
    }

    public Student[] getStudentsByScore() {
        Comparator<Student> sortByScores = Comparator.comparing(Student::getAverageExamScore).thenComparing(Student::getFirstName);
        List<Student> studentsSorted = new ArrayList<>(Arrays.asList(this.students));
        Collections.sort(studentsSorted, sortByScores);

        Student[] studentsByScore = new Student[studentsSorted.size()];
        studentsByScore = studentsSorted.toArray(studentsByScore);

        return studentsByScore;
    }

    public HashMap getGradeBook() {
        Student[] studentsByScore = this.getStudentsByScore();
        HashMap<Student, String> gradebook = new HashMap<>();

        double percentile;
        for (int i = 0; i < studentsByScore.length; i++) {
            percentile = (double) (1 + ( (i + 1) / studentsByScore.length )) * 100;
            if (percentile > 90) {
                gradebook.put(studentsByScore[i], "A");
            } else if (percentile > 80) {
                gradebook.put(studentsByScore[i], "B");
            } else if (percentile > 70) {
                gradebook.put(studentsByScore[i], "C");
            } else if (percentile > 60) {
                gradebook.put(studentsByScore[i], "D");
            } else {
                gradebook.put(studentsByScore[i], "F");
            }
        }

        return gradebook;

    }
}
