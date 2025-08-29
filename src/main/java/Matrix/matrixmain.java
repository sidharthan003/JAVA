/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matrix;

/**
 *
 * @author sidhu
 */
import java.util.Scanner;
public class matrixmain {

    /**
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        

   
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter rows and columns for first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        matrix mat1 = new matrix(r1, c1);

        
        System.out.println("Enter elements of first matrix:");
        mat1.inputMatrix(sc);

        
        System.out.print("Enter rows and columns for second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        matrix mat2 = new matrix(r2, c2);

        
        System.out.println("Enter elements of second matrix:");
        mat2.inputMatrix(sc);

        
        System.out.println("First Matrix:");
        mat1.dispalyMatrix();

        System.out.println("Second Matrix:");
        mat2.dispalyMatrix();

        
        matrix sum = mat1.add(mat2);
        if (sum != null) {
            System.out.println("Matrix Addition Result:");
            sum.dispalyMatrix();
        }

        
        matrix difference = mat1.sub(mat2);
        if (difference != null) {
            System.out.println("Matrix Subtraction Result:");
            difference.dispalyMatrix();
        }

       
        matrix product = mat1.mul(mat2);
        if (product != null) {
            System.out.println("Matrix Multiplication Result:");
            product.dispalyMatrix();
        }

        sc.close();
    }
}

    }
    

