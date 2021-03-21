package com.example.demoS.student;

public class Student {

    private final Integer studentId;
    private final String studentName;


    public Student(Integer studentId,
                   String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public String getStudentName() {

        return studentName;
    }

}
