package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
    * Main program:  The entry point of the program. The local time will be printed first,
    *      Then it will create two binary variables, perform bitwise OR, bitwise AND, and multiplication operations, and print the results.
    *
    * @param args: not used
    */
    public static void main( String[] args )
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        // Create two Binary objects
        Binary binary1 = new Binary("00010001000");
        System.out.println("First binary number is " + binary1.getValue());

        Binary binary2 = new Binary("111000");
        System.out.println("Second binary number is " + binary2.getValue());

        // Perform bitwise OR
        Binary resultOR = binary1.bitwiseOR(binary2);
        System.out.println("Bitwise OR Result: " + resultOR.getValue());

        // Perform bitwise AND
        Binary resultAND = binary1.bitwiseAND(binary2);
        System.out.println("Bitwise AND Result: " + resultAND.getValue());

        // Perform multiplication
        Binary resultMultiply = binary1.multiply(binary2);
        System.out.println("Multiplication Result: " + resultMultiply.getValue());
    }
}