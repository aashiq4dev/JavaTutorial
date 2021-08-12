package com.badhon;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] object) throws Exception {
       
        String resutl=   NumberFormat.getPercentInstance().format(.1);
       
       System.out.println(resutl);

    }

}