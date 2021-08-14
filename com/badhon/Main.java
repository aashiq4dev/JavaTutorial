package com.badhon;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import jdk.jfr.Percentage;

public class Main {

    public static void main(String[] args) throws Exception {
        // FizzBuzz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();
        if (number % 5 == 0 ) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if(number%5==0&& number%3==0){
            System.out.println("FizzBuzz");
        }
         else 
            System.err.println(number);

    }

}