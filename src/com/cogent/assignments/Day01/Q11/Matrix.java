package com.cogent.assignments.Day01.Q11;

public class Matrix {
    int[][] matrix = new int[10][10];
    int rows;
    int columns;

    private Matrix() {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                matrix[i][j] = 0;
    }

    Matrix(int rows, int columns) {
        this();
        this.rows = rows;
        this.columns = columns;
    }

    void setElement(int r, int c, int value) {
        if(value > 0 && r < rows && c < columns)
            this.matrix[r][c] = value;
    }

    Matrix transpose() {
        Matrix matrix = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matrix.setElement(j, i, this.matrix[i][j]);
        return matrix;
    }
    
    void printMatrix() {
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
        }
    }
}
