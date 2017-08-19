package com.hr.minimax;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by golagem on 7/12/17.
 */
public class MiniMax {
    public static void main(String... a){
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        long sum = 0;

        for (int i = 0 ; i < array.length ; i++){
            int temp = in.nextInt();
            array[i] = temp;
            sum += temp;
        }

        Arrays.sort(array);
        System.out.println((sum - array[array.length-1]) + " " + (sum - array[0]));
    }
}
