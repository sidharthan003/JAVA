/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedList;

/**
 *
 * @author sidhu
 */
public class LListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int data[]={1,2,3,4};
        LList mylist=new LList();
        mylist.createLList(data);
        mylist.traverse();
        mylist.insertAtBeginning(10);
        mylist.insertAtBeginning(14);
        mylist.insertAtBeginning(8);
        mylist.traverse();
        mylist.deleteAtBeginning();
        mylist.insertAtEnd(7);
        mylist.insertAtEnd(10);
        mylist.traverse();
        mylist.deleteFromEnd();
        mylist.traverse();
        mylist.deleteAtPosition(-4);
        mylist.deleteAtPosition(4);
        mylist.traverse();
        mylist.insertAfterKey(3, 25);
        mylist.traverse();
        mylist.insertBeforeKey(1, 17);
        mylist.traverse();
        mylist.reverseTraverse();
    
    }  
    
}
