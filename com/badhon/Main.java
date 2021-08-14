package com.badhon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // While loops
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input:");
            input = scanner.next().toLowerCase().trim();
            System.out.println(input);
        }
        //do while loops
        do{
            System.out.print("Input:");
            input = scanner.next().toLowerCase().trim();
            System.out.println(input);
        } while (input.equals("quit"));
    }
}