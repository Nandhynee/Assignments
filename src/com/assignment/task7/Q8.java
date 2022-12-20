package com.assignment.task7;

import java.util.Arrays;

public class Q8 {
    static int largest(int []arr,
                       int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }
    static public void main (String[] args)
    {
        int []arr = {510, 13234, 465,
                790, 97808};
        int n = arr.length;
        System.out.println(largest(arr, n));
    }
}
