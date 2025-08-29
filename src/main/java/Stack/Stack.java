package Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidhu
 */
public class Stack {
    
    private int[] S;
    private int TOP;
    private int SIZE;
    
    public Stack() { 
        SIZE = 10;
        TOP = -1;
        S = new int[SIZE];
    }
    
    public boolean isEmpty() {
        return TOP == -1;
    }

    public boolean isFull() {
        return TOP == SIZE - 1;
    }

    public void push(int element) {
        if (!isFull()) {
            S[++TOP] = element;
        } else {
            System.out.println("Stack Overflow!!");
        }
    }
    public void pop(){
        if(!isEmpty()){
            TOP--;}
        else{
            System.out.println("Stack Underflow!!");
                  
        }    
    }
    public int peek(){
        if(!isEmpty()){
            return S[TOP];
        }
        else{
            System.out.println("EMPTY STACK!!");
        }
        return -1;
    }
    public void display(){
        if (!isEmpty()) {
            System.out.println("Stack elements :");
            for (int i = TOP; i >= 0; i--) {
                System.out.println(S[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }
}


    


