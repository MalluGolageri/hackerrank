package com.hr.diagonalelements;

import java.util.Scanner;

public class DiagonalElements {
    private static void diagonalPrint(int[][] m) {
        int row = m.length;
        int col = m[0].length;
        for (int i = 1; i <= (row + col - 1); i++) {
            int start_col = max(0, i - row);
            int count = min(i, (col - start_col), row);
            for (int j = 0; j < count; j++)
                System.out.print(m[min(row, i) - j - 1][start_col + j] + " ");
            System.out.println();
        }
    }

    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Read M*N matrix");
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        int matrix[][] =new int[m][n];
        System.out.println("Read m*n elements");

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        print(matrix);
        diagonalPrint(matrix);
    }

}
