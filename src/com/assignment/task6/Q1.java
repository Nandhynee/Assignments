package com.assignment.task6;

public class Q1 {
    public static void main(String[] args) {
        Student student=new Student("Amay",132);
        System.out.println("Student name is "+student.getName()+" enrollment no is "+student.getEnrollmentNo());
    }
}
class Student{
    private String name;
    private int enrollmentNo;

    public Student(String name, int enrollmentNo) {
        this.name = name;
        this.enrollmentNo = enrollmentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }
}
