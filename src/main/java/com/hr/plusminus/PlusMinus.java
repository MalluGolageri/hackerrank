package com.hr.plusminus;

import java.util.Scanner;

/**
 * Created by golagem on 7/10/17.
 */
public class PlusMinus {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double negativeNumbers=0.0,positiveNumbers=0.0,zeros=0.0;
        for(int i=0;i<length;i++){
            int num = sc.nextInt();
            if(num<0){
                negativeNumbers++;
            }else if(num>0){
                positiveNumbers++;
            }else{
                zeros++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",positiveNumbers/length,negativeNumbers/length,zeros/length);
    }
}
