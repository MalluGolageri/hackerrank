package com.hr.birthdaycakecandles;

import java.util.*;

/**
 * Created by golagem on 9/25/17.
 */
public class BirthdayCakeCandles {
    private static final String TALLEST= "tallest";
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        // 3 2 1 3
        int max=ar[0];
        int tallestCount=1;
        for (int i=1;i<n;i++){
            if(ar[i] > max){
                max=ar[i];
                tallestCount=1;
            }else if(ar[i]==max){
                tallestCount++;
            }

        }
        return tallestCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
