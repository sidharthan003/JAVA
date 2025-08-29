/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author sidhu
 */
public class Myqueue {
    int s, f, r;
    int[] q;

public Myqueue(int size) {
        s = size;
        q = new int[s];
        f = r = -1;
}
public void enqueue(int val){
    if(r == s){
        System.out.println("QUEUE FULL!!");
    }
    else{
        if(f == -1){
            f = 0;
        }
         r = r + 1;
         q[r] = val; 
        }
    }
public void dequeue(){
    if(f == -1){
     System.out.println("QUEUE EMPTY!!");
    }
    else{
        f = f + 1;
    }
        if (f > r){
            f = r = -1;
        }
    }
public void display() {
    
    if (f == -1) {
        System.out.println("QUEUE EMPTY!!");
    } else {
        System.out.print("Queue elements: ");
        for (int i = f; i <= r; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
        System.out.println("Front pointer (f): " + f);
        System.out.println("Rear pointer  (r): " + r);

        
    }
}
}

