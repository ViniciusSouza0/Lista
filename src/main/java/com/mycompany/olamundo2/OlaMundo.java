package com.mycompany.olamundo2;

import java.util.Locale;

public class OlaMundo {
    public static void main(String[] args) {
        double x = 10.356547; 
        System.out.println(x);
        System.out.printf("%.2f\n",x);
        System.out.printf("%.4f\n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n",x);       
    }
}