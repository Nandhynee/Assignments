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
            bill = 60*0.30 +(eunits-60)*0.75;
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);

        }
        else if(eunits>90 && eunits <=120)
        {
            bill = 60*0.30 +30*0.75+(eunits-90)*1.10;
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);
        }
        else if(eunits>120)
        {
            bill = 60*0.30 +30*0.75+30*1.10+(eunits-120 )*1.10;
            surcharge = bill * 20 / 100;
            bill = bill + surcharge;
            System.out.println("your final bill is " + bill);
        }

    }
}