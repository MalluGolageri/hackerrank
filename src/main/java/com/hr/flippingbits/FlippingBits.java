package com.hr.flippingbits;

import java.util.Scanner;

/**
 * Created by golagem on 9/26/17.
 */
public class FlippingBits {
    public static void main(String... args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long[] numbers=new long[n];
        long[] result=new long[n];
        for(int i=0;i<n;i++){
            numbers[i]=scanner.nextLong();
        }
        for (int i=0;i<numbers.length;i++){
            String unsignedBits=getUnsignedBitsAsString(numbers[i]);
            String flippedBits=getFlippedBits(unsignedBits);

            long longValue=Long.parseLong(flippedBits, 2);
            result[i]=longValue;
            System.out.println(result[i]);
        }
    }

    private static String getFlippedBits(String unsignedBits){
        String flippedBits="";
        for (int i=0;i<unsignedBits.length();i++){
            if(unsignedBits.charAt(i)=='0'){
                flippedBits+="1";
            }else {
                flippedBits+="0";
            }
        }
        return flippedBits;
    }

    private static String getUnsignedBitsAsString(long number){
        return Long.toBinaryString( number | 0x100000000L ).substring(1);
    }
}

