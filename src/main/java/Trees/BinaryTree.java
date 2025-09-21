/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trees;
import java.util.*;
/**
 *
 * @author sidhu
 */
public class BinaryTree {
    Node root;
    
    BinaryTree(){
        root = null;
    }

void inOrder(Node node){
    if (node == null) return;
    inOrder(node.left);
    System.out.print(node.data + " ");
    inOrder(node.right);
    }
void preOrder(Node node){
    if(node == null) return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
    }
void postOrder(Node node){
    if(node == null) return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " ");
    }
void levelOrder(Node root){
    if(root == null)return;
    
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    
    while (!queue.isEmpty()){
        Node current = queue.poll();
        System.out.print(current.data + " ");
        if(current.left != null) queue.add(current.left);
        if(current.right != null) queue.add(current.right);
    }
    System.out.println();
    }

}
