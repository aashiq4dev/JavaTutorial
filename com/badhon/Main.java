package com.badhon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //for each loops
        String[] fuirts = { "Apple", "Mango", "Orange" };
        
        for (int i = 0; i < fuirts.length; i++) {
            System.out.println(fuirts[i]);
        }
        for (String fuit : fuirts) {
            System.out.println(fuit);
        }
    }
}