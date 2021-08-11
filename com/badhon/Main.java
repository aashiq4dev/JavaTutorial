package com.badhon;

import java.awt.*;



public class Main {
   

    public static void main(String[] args) throws Exception {
       int x = 1;
        int y = 1;
       
        Point point1 = new Point(x,y);
        Point point2 = point1; //they are "x","y" not indepentent
        point1.x = 5;
        System.out.println(point2);
    }
}