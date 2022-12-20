package com.assignment.task6;

public class Q2 {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.setFirstSide(3);
        triangle.setSecondSide(4);
        triangle.setThirdSide(5);
        System.out.println("Perimeter is "+triangle.getPerimeter());
        System.out.println("Area is "+triangle.getArea());
    }
}
class Triangle{
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getArea(){
        int s= this.getPerimeter()/2;
        int temp=s*(s-firstSide)*(s-secondSide)*(s-thirdSide);
        return Math.sqrt(temp);
    }

    public int getPerimeter(){
        return firstSide+secondSide+thirdSide;
    }
}
