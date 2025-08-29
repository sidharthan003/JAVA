/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author sidhu
 */
public class Stackmain {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Pushing elements:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Pushing: " + i);
            stack.push(i);
        }

        System.out.println("\nPopping elements:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Popped element: " + stack.peek());
            stack.pop();
        }
         stack.display();

        
        System.out.println("\nTop element after popping: " + stack.peek());

  
        System.out.println("\nFilling stack to full:");
        for (int i = 6; i <= 11; i++) {
            stack.push(i);
        }
        stack.display();
        
        System.out.println("\nEmptying the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.peek());
            stack.pop();
        }

        System.out.println("\nTrying to pop from an empty stack:");
        stack.pop();
        stack.display();
    }
}
