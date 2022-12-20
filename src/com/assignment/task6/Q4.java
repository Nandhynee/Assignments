package com.assignment.task6;

public class Q4 {
    public static void main(String[] args) {
        Q4Student student1=new Q4Student();
        System.out.println("First student name is "+student1.getName());
        Q4Student student2=new Q4Student("Nandhini");
        System.out.println("Second student name is "+student2.getName());
    }
}
class Q4Student{
    private String name;

    public Q4Student(){
        this.name="Unknown";
    }
    public Q4Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}