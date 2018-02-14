package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String originalHexa;
        double convertedDecimal = 0;
        int testNumber = 1;
        int hexaLength;
        int i = 0;
        String hexDigits = "0123456789ABCDEF";

        //while (testNumber > 0 && testNumber<8){

            //System.out.println("Test " + testNumber + ":");
            System.out.println("Enter a hexadecimal number: ");
            originalHexa = scanner.nextLine();
            originalHexa = originalHexa.toUpperCase();

            if (originalHexa.length() > 2) {
                if (originalHexa.substring(0,2).equals("0X"))    {
                originalHexa = originalHexa.substring(2);

            }
            }

            hexaLength = originalHexa.length();


            i = hexaLength - 1;
            double powerOf = 0.0;

            while (i >= 0)  {
                char c = originalHexa.charAt(i);

                int number = hexDigits.indexOf(c);

                if (number == -1)    {
                    System.out.println("Invalid hexadecimal number.");
                    System.exit (0);
                }

                convertedDecimal = convertedDecimal + Math.pow(16.0,powerOf)*number;
                powerOf ++;
                i--;

            }

            testNumber = testNumber + 1;

            long finalAnswer = (long) convertedDecimal;

            System.out.println("Your number is " + finalAnswer + " in decimal");
            System.out.println();
            convertedDecimal = 0;
        }

    //}
}
