package com.assignment.task6;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        Employee e1=new Employee("Robert",1994,0,"64C-Walls Street");
        Employee e2=new Employee("Sam",2000,0,"68D-Walls Street");
        Employee e3=new Employee("John",1999,0,"26B-Walls Street");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println("Name\t\tYear of Joining\t\tAddress");
        for(Employee e:employeeList){
            System.out.println(e.getName()+"\t\t"+e.getYearOfJoining()+"\t\t"+e.getAddress());
        }

    }
}
class Employee{
    private String name;
    private int yearOfJoining;
    private int salary;
    private String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}