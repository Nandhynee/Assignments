package com.assignment.task2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, result = 0;
        char op;
          System.out.println("Enter the first num");
            a = s.nextInt();
            System.out.println("Enter the second num");
            b = s.nextInt();
            System.out.println("Enter the operator(+,-,*,/,%) or press any other character to exit");
            op = s.next().charAt(0);
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                case '%':
                    result = a % b;
                    break;
                default:
                   System.exit(0);
            }
            System.out.println("the result is " + result);
        }
    }

