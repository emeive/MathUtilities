package org.example;

public class Multiples {

    private static int firstMultipleOfRealNumber(double real){
        int i = 2;
        double result = real;
        while (true){
            result = real*i;
            double decimalPart = result - Math.floor(result);
            if (decimalPart == 0.0)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(firstMultipleOfRealNumber(2.1396));

    }
}