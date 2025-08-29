/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrix;

/**
 *
 * @author sidhu
 */
import java.util.Scanner;

public class MatrixArray {
    int[][] mat;
    int rows, cols;

    public MatrixArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    public void inputMatrix(Scanner sc) {
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public MatrixArray add(MatrixArray m) {
        if (this.rows != m.rows || this.cols != m.cols) {
            System.out.println("Addition not possible!");
            return null;
        }
        MatrixArray result = new MatrixArray(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[i][j] = this.mat[i][j] + m.mat[i][j];
            }
        }
        return result;
    }

    public MatrixArray subtract(MatrixArray m) {
        if (this.rows != m.rows || this.cols != m.cols) {
            System.out.println("Subtraction not possible!");
            return null;
        }
        MatrixArray result = new MatrixArray(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[i][j] = this.mat[i][j] - m.mat[i][j];
            }
        }
        return result;
    }

    public MatrixArray multiply(MatrixArray m) {
        if (this.cols != m.rows) {
            System.out.println("Multiplication not possible!");
            return null;
        }
        MatrixArray result = new MatrixArray(this.rows, m.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                result.mat[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.mat[i][j] += this.mat[i][k] * m.mat[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns for matrices: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        MatrixArray mat1 = new MatrixArray(rows, cols);
        MatrixArray mat2 = new MatrixArray(rows, cols);
        
        System.out.println("Enter first matrix:");
        mat1.inputMatrix(sc);
        System.out.println("Enter second matrix:");
        mat2.inputMatrix(sc);

        System.out.println("First Matrix:");
        mat1.displayMatrix();
        System.out.println("Second Matrix:");
        mat2.displayMatrix();

        MatrixArray sum = mat1.add(mat2);
        if (sum != null) {
            System.out.println("Addition Result:");
            sum.displayMatrix();
        }

        MatrixArray diff = mat1.subtract(mat2);
        if (diff != null) {
            System.out.println("Subtraction Result:");
            diff.displayMatrix();
        }

        System.out.print("Enter rows and columns for second matrix for multiplication: ");
        int mulRows = sc.nextInt();
        int mulCols = sc.nextInt();
        MatrixArray mat3 = new MatrixArray(mulRows, mulCols);
        System.out.println("Enter second matrix for multiplication:");
        mat3.inputMatrix(sc);

        MatrixArray product = mat1.multiply(mat3);
        if (product != null) {
            System.out.println("Multiplication Result:");
            product.displayMatrix();
        }
        sc.close();
    }
}


