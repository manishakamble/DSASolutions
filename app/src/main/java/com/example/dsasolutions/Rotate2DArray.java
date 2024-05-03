package com.example.dsasolutions;

public class Rotate2DArray {
    //Transpose of a matrix is obtained by changing rows to columns and columns to rows.
    // In other words, transpose of A[N][M] is obtained by changing A[i][j] to A[j][i].

    //Problem - Inplace rotate square matrix by 90 degrees
    // i.e. Given a square matrix, turn it by 90 degrees in an anti-clockwise direction without using any extra space


    public static void reverseMatrix(int i, int mat[][], int N) {
        int start = 0;
        int end = N - 1;
        while (start < end) {
            int temp = mat[i][start];
            mat[i][start] = mat[i][end];
            mat[i][end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateMatrix(int N, int mat[][]) {

        // reverse the row
        for (int i = 0; i < N; i++) {
            reverseMatrix(i, mat, N);
        }
        // Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void displayMatrix(int N, int mat[][]) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("  " + mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String arr[]) {
        int N = 4;
        int matrixArray[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotateMatrix(N, matrixArray);
        displayMatrix(N, matrixArray);

    }
    //time complexity O(N2) + O(N2)  where N is the size of the array. space O(1)
}
