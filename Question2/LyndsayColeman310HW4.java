/* Question 2 of Assignment 4 */

package lyndsaycoleman310hw4;

class Node{ 
    int key; 
    Node left, right;   
    public Node(int item){ 
        key = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree{ 
    // Root of the Binary Tree 
    Node root; 
    BinaryTree(){ 
        root = null; 
    } 
    /* Given a binary tree, print the nodes in inorder*/
    void printInorder(Node node){ 
        if (node == null) 
            return; 
        /* first recur on left child */
        printInorder(node.left); 
        /* then print the data of node */
        System.out.print(node.key + " "); 
        /* now recur on right child */
        printInorder(node.right); 
    } 
  
    /* Given a binary tree, print the nodes in preorder*/
    void printPreorder(Node node){ 
        if (node == null) 
            return; 
        /* first print data of node */
        System.out.print(node.key + " "); 
        /* then recur on left sutree */
        printPreorder(node.left); 
        /* now recur on right subtree */
        printPreorder(node.right); 
    } 
  
    // Wrappers over the recursive functions  
    void printInorder()    {printInorder(root);} 
    void printPreorder()   {printPreorder(root);} 
}
public class LyndsayColeman310HW4 {     
    
    /* A function to print the array */
    static void printArray(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 

    }
    
}
