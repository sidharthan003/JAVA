/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trees;

/**
 *
 * @author sidhu
 */
public class TreeMain {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.print("\nBinaryTree Levelorder:");
        tree.levelOrder(tree.root);
        
        System.out.print("\nInorder Traversal:");
        tree.inOrder(tree.root);
        
        System.out.print("\nPreorder Traversal:");
        tree.preOrder(tree.root);
        
        System.out.print("\nPostorder Traversal:");
        tree.postOrder(tree.root);               
    }
}
