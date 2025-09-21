/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trees;

/**
 *
 * @author sidhu
 */
public class BST {
    Node root;

Node insert(Node node, int value){
    if (node == null) return new Node(value);
    
    if(value < node.data){
        node.left = insert(node.left, value);
    }else if(value > node.data){
        node.right = insert(node.right, value);
    }
    return node;
}
boolean search(Node node, int key){
    if(node == null) return false;
    if(key == node.data) return true;
    if(key < node.data) return search(node.left, key);
    else return search(node.right, key);
}
void inOrder(Node node){
 if(node == null)return;
 inOrder(node.left);
 System.out.print(node.data + " ");
 inOrder(node.right);
    }
Node delete(Node root, int key){
    if(root == null) return null;
    
    if(key < root.data)root.left = delete(root.left, key);
    else if (key > root.data) root.right = delete(root.right, key);
     
    else{
        if(root.left == null)return root.right; 
        else if (root.right == null) return root.left;
        
        Node successor = minValueNode(root.right);
        root.data = successor.data;
        root.right = delete(root.right, successor.data);
    }
    return root;
   }
Node minValueNode(Node node){
    Node current = node;
    while(current.left != null) current =  current.left;
    return current;
    }
}
