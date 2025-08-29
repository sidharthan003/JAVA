/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author sidhu
 */
public class ArrayMain {
    
    public static void main(String[] args) {
        
        Array ob=new Array(25);
        ob.traverse();
        ob.insertAtEnd(5);
        ob.traverse();
        ob.insertAtEnd(6);
        ob.insertAtEnd(9);
        ob.insertAtEnd(7);
        ob.insertAtEnd(3);
        ob.insertAtEnd(8);
        ob.insertAtEnd(12);
        ob.traverse();
        ob.deleteFromEnd();
        ob.traverse();
        ob.deleteFromFront();
        ob.traverse();
        ob.insertAtPosition(5,3);
        ob.traverse();
        ob.deleteAtPosition(2);
        ob.search(12);
        ob.countElements();
        ob.traverse();
        ob.selectionSort();
        System.out.println("\nArray after selelction sort : ");
        ob.traverse();
        ob.BubbleSort();
        System.out.println("\nArray after bubble sort : ");
        ob.traverse();
        ob.insertAtEnd(2);
        ob.insertAtEnd(2);
        ob.insertAtEnd(7);
        ob.insertAtEnd(10);
        ob.insertAtEnd(10);
        ob.traverse();
        ob.insertionSort();
        System.out.println("\nArray after insertion sort : ");
        ob.traverse();
        ob.insertAtEnd(9);
        ob.insertAtEnd(0);
        ob.insertAtEnd(14);
        ob.insertAtEnd(24);
        ob.insertAtEnd(16);
        ob.insertAtEnd(4);
        ob.insertAtEnd(1);
        
        ob.traverse();
        //ob.QuickSort();
        //ob.mergeSort();
        
        System.out.println("\nHeap Sort");
      
        ob.heapSort();
        ob.traverse();
        ob.printDistinctElements();
        Array dob=ob.getDistinctElements();
        ob.traverse();
        ob.printFrequencyTable();
        int m = ob.maxElement();
        System.out.println("\nMax : "+m);
        
        
       
        
    
    }
        
}
    

