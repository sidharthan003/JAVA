/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLList;

/**
 *
 * @author sidhu
 */
public class DLList {
    Node head;

    public DLList() {
        head = new Node(); 
    }

    void createDLList(int data[]){
        Node current = head;
        for(int x:data){
            Node newnode = new Node();
            current.setNext(newnode);
            newnode.setPrev(current);
            current = newnode;
        }
        
    }
    void insertAtBeginning(int value){
        Node newnode = new Node(value);
        
    }
            
}