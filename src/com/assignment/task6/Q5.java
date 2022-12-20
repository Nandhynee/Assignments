package com.assignment.task6;

public class Q5 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(3);
        Rectangle r3=new Rectangle(3,4);
        System.out.println("First rectangle area is "+r1.getArea());
        System.out.println("Second rectangle area is "+r2.getArea());
        System.out.println("Third rectangle area is "+r3.getArea());
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length=0;
        this.breadth=0;
    }

    public Rectangle(int length) {
        this.length = length;
        this.breadth = length;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return this.length*this.breadth;
    }
}
