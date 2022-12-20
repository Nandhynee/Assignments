package com.assignment.task2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int eunits;
        double bill=0,surcharge=0;
        System.out.println("Enter the units");
        Scanner s=new Scanner(System.in);
        eunits=s.nextInt();
        if(eunits<=60) {
            bill = (0.30 * eunits);
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);

        }
        else if(eunits>60 && eunits<=90)
        {
            bill = (0.75 * eunits);
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);

        }
        else if(eunits>90 && eunits <=120)
        {
            bill = (1.10 * eunits);
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);
        }
        else if(eunits>=300)
        {
            bill = (2.50 * eunits);
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);
        }

    }
}