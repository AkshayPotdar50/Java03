package com.java.sprint6;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original matrix");
        printMatrix(matrix);

        int[][] transpose= transposeMatrix(matrix);
        System.out.println("Transpose matrix");
        printMatrix(transpose);

    }
    public static int[][] transposeMatrix(int[][] matrix){
        int rows= matrix.length;
        int cols= matrix[0].length;

        int[][] transpose= new int[cols][rows];

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row :matrix){
            for(int element :row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
