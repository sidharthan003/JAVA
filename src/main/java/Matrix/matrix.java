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
public class matrix {
    
   int[][] mat;
   int rows, cols;
   
   public matrix(int rows, int cols){
       this.rows = rows;
       this.cols = cols;
       mat = new int[rows][cols];
   
   }
   
public void inputMatrix(Scanner sc){
    for( int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                mat[i][j] = sc.nextInt();

            }

    }

}
    public void dispalyMatrix(){
        System.out.print("\nMatrix:");
        for(int i=0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }  
    
    public boolean isValidOperation(matrix m, String operation) {
    if (operation.equals("add") || operation.equals("subtract")) {
        if (this.rows != m.rows || this.cols != m.cols) {
            System.out.println(" not possible!");
            return false;
        }
    } else if (operation.equals("multiply")) {
        if (this.cols != m.rows) {
            System.out.println("Multiplication not possible!");
            return false;
        }
    }
    return true;
}
    public matrix add(matrix m){
         if (!isValidOperation(m, "add")) 
             return null;
    
    matrix result = new matrix(rows, cols);
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result.mat[i][j] = this.mat[i][j] + m.mat[i][j];
        }
    }
    return result;
}
    public matrix sub(matrix m){
        if(!isValidOperation(m,"sub"))
            return null;
    
        matrix result = new matrix(rows,cols);
        for(int i = 0; i< rows; i++){
            for(int j=0; j<cols; j++){
                result.mat[i][j] = this.mat[i][j] - m.mat[i][j];
            }
    }
        return result;
}
    
    public matrix mul(matrix m){
        if(!isValidOperation(m, "mul"))
            return null;
        matrix result = new matrix(this.rows, m.cols);
        
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < m.cols; j++){
                    result.mat[i][j] = 0;
                for (int k = 0; k < this.cols; k++ ){
                    result.mat[i][j] += this.mat[i][k] * m.mat [k][j];
                    
                } 
                    
            }
        }
        return result;
      };
        
        
    }
        
    
    
    
        
    
    
    

    

    
   
   
