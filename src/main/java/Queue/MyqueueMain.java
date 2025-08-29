/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author sidhu
 */
public class MyqueueMain {
    public static void main(String[] args){
        Myqueue q = new Myqueue(10);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("After enqueue:");
        q.display();

        q.dequeue();
        System.out.println("After dequeue:");
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        System.out.println("After enqueue:");
        q.display();
    }
}
