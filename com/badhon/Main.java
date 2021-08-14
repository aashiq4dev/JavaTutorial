package com.badhon;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


import jdk.jfr.Percentage;

public class Main {

    public static void main(String[] args) throws Exception {
        // conditional statements
        
          
        int income = 10_000;
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Your income: ");
        int inputIncome = scanner.nextInt();
        String className = inputIncome < income ? "Your class is Economy" : "You're a VIP";
        System.out.println(className);
        
    }

}