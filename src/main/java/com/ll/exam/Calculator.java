package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        String[] a = s.split(" ");
        int A = Integer.parseInt(a[0]);
        String operator = a[1];
        int B = Integer.parseInt(a[2]);

        switch (operator){
            case "+":
                return A+B;
            case "-":
                return A-B;
            case "*":
                return A*B;
        }
        return A+B;
    }
}
