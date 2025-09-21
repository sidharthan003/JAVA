/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trees;

/**
 *
 * @author sidhu
 */
public class BSTMain {
    public static void main(String[] args){
        BST tree = new BST();
        
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 80);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 90);
        
        System.out.print("Inorder Traversal: ");
        tree.inOrder(tree.root);
        System.out.println();
        
        System.out.println("Searching 40: " + tree.search(tree.root, 40));
        System.out.println("Searching 100: " + tree.search(tree.root, 100));
        
        System.out.print("deleting 20!");
        tree.root = tree.delete(tree.root, 20);
        System.out.print("\nBST: ");
        tree.inOrder(tree.root);
        
        System.out.print("\ndeleting 80!");
        tree.root = tree.delete(tree.root, 80);
        System.out.print("\nBST: ");
        tree.inOrder(tree.root);
        System.out.println();
        
        
    }
    
}
