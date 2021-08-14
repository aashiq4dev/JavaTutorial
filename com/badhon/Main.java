package com.badhon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // While loops
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input:");
            input = scanner.next().toLowerCase().trim();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
                System.out.println(input);
        }

    }
}