package com.hr.matrix;

import java.util.Scanner;

/**
 * Created by golagem on 7/10/17.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //  System.out.println("enter value of n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println("enter matrix values of n");
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();

            }
        }
        //System.out.println("Matrix entries are:");
        //displayMatrix(matrix, n);

        System.out.println(getDiagonalMatrixDifference(matrix, n));

    }

    private static int getDiagonalMatrixDifference(int[][] matrix, int n) {

        int primaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) primaryDiagonal += matrix[i][j];
            }
        }
        //System.out.println("primaryDiagonal:" + primaryDiagonal);

        int secondaryDiagonal = 0;
        int temp = n;
        for (int i = 0; i < n; i++) {
            for (int j = temp - 1; j >= 0; ) {
                secondaryDiagonal += matrix[i][j];
                temp--;
                break;
            }
        }
        //System.out.println("secondaryDiagonal:" + secondaryDiagonal);

        return getDifference(primaryDiagonal, secondaryDiagonal);
    }
//
//    private static void displayMatrix(int[][] matrix, int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    private static int getDifference(int primaryDiagonal, int secondaryDiagonal) {
        int diff = primaryDiagonal - secondaryDiagonal;
        return (diff < 0) ? -diff : diff;
    }

}
