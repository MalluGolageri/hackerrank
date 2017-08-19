package com.hr.magicnumber;

import java.util.Scanner;

/**
 * Created by golagem on 8/19/17.
 */
public class MagicNumber {
    public static void main(String... s) {
        System.out.println("Enter number");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Magic Number is:" + nthNumber(num));
    }

    public static int nthNumber(int n) {
        int value = 0;
        int power = 5;
        while (n != 0) {
            if ((n & 1) != 0) {
                value += power;
            }

            power *= 5;
            n >>= 1;
        }
        return value;
    }
}

