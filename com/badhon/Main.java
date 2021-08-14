package com.badhon;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("Input:");
            input = scanner.next();
           System.out.println(input);
        }
    }
}