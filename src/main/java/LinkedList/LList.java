/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author sidhu
 */
public class LList {

    Node head;
    public LList() {
        head=new Node();
        head.setData(0);
        head.setLink(null);
        
    }
    void createLList(int data[])
    {
        
        Node current=head;
        for(int x:data)
        {
            Node newnode=new Node();
            newnode.setData(x);
            current.setLink(newnode);
            current=newnode;
        }
    }
    void insertAtBeginning(int value){
        Node newnode = new Node(value);
        newnode.setLink(head.getLink());
        head.setLink(newnode); 
    }   
    void deleteAtBeginning(){
        Node temp = head.getLink();
        head.setLink(temp.getLink());
        temp = null;
        
    }
    void insertAtEnd(int value){
       Node ptr = head;
       while(ptr.getLink()!= null){
           ptr = ptr.getLink();          
       }
      Node newnode = new Node(value);
      ptr.setLink(newnode);
        
    }
    void deleteFromEnd(){
        Node ptr = head.getLink();
        Node pptr = head;
        while(ptr.getLink()!= null){
            pptr = ptr;
            ptr = ptr.getLink();    
        }
        pptr.setLink(null);
        ptr = null;             
    }
    void deleteAtPosition(int pos) {
    if (pos < 1) {
        System.out.println("\nInvalid position");
        return;
    }
    Node ptr = head;

    for (int i = 1; i < pos && ptr.getLink() != null; i++) {
        ptr = ptr.getLink();
    }

    if (ptr.getLink() != null) {
        Node temp = ptr.getLink();
        ptr.setLink(temp.getLink());
        temp = null;
    } 
    else {
        System.out.println("\nInvalid position");
        }
    }
    void insertAtPosition(int pos, int value) {
    if (pos < 1) {
        System.out.println("\nInvalid position");
        return;
    }

    Node ptr = head;
    for (int i = 1; i < pos && ptr != null; i++) {
        ptr = ptr.getLink();
    }

    if (ptr == null) {
        System.out.println("\nInvalid position");
        return;
    }

    Node newnode = new Node(value);
    newnode.setLink(ptr.getLink());
    ptr.setLink(newnode);
}
    void insertBeforeKey(int key, int value) {
        Node ptr = head;

        while (ptr.getLink() != null && ptr.getLink().getData() != key) {
            ptr = ptr.getLink();
        }

        if (ptr.getLink() == null) {
            System.out.println("\nKey " + key + " not found.");
            return;
        }

        Node newnode = new Node(value);
        newnode.setLink(ptr.getLink());
        ptr.setLink(newnode);
    }
    void insertAfterKey(int key, int value) {
        Node ptr = head.getLink(); 
        while (ptr != null && ptr.getData() != key) {
            ptr = ptr.getLink();
        }

        if (ptr.getLink() == null) {
            System.out.println("\nKey " + key + " not found.");
            return;
        }

        Node newnode = new Node(value);
        newnode.setLink(ptr.getLink());
        ptr.setLink(newnode);
    }
    void reverseTraverse()
    {
         System.out.print("\nReverse List : ");
         revTraverse(head.getLink());
    }
    private void revTraverse(Node ptr)
    {
        if(ptr!=null)
        {
            revTraverse(ptr.getLink());
             
        }
    }
    void traverse()
    {
        System.out.print("\nCurrent List : ");
        Node ptr=head.getLink();
        while(ptr!=null)
        {
            System.out.print(ptr.getData()+" ");
            ptr=ptr.getLink();
        }
    }
}
