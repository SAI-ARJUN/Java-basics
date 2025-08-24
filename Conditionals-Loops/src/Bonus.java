package com.arjun;

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        int new_salary;
        if(salary>10000){
            new_salary = salary+2000;
        }
        else{
            new_salary = salary+1000;
        }
        System.out.println("The updated new salary is : "+ 1new_salary);
    }
    
}
