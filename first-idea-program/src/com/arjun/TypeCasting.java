package com.arjun;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        //int num = input.nextFloat(); this cannot be done becoz float value is smaller than int
//        System.out.println(num);

        int num = (int)(259.81f); //type casting
        System.out.println(num);

        //automatic type promotion in expressions
        byte b = (byte)(num);
        System.out.println(b);
    }
}

// Output: 56 (i.e the whole number of the float value converting a big number into a small number explicitly)