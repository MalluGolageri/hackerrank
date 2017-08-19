package com.hr.staircase;

import java.util.Scanner;

/**
 * Created by golagem on 7/11/17.
 */
public class StairCase {

    public static void main(String... a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print((i<=j?"#":" "));
            }
            System.out.println();
        }
    }

}
