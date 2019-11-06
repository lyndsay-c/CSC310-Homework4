/* Question 1 of Assignment 4 */

package lyndsaycoleman310hwq1;

class InsertionSort{    
    /*Function to sort array using insertion sort*/
    void iSort(int arr[]){ 
        int n = arr.length; 
        for (int i = 1; i < n; ++i){ 
            int key = arr[i]; 
            int j = i - 1; 
            /* Move elements that are greater than key, to one spot ahead of current position */
            while (j >= 0 && arr[j] > key){ 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    }
}

public class LyndsayColeman310HWQ1 {
    // Node  
    static class Node {  
       int data;  
       // Lower values indicate higher priority  
       int priority;  
       Node next;  
    } 
    static Node node = new Node(); 
    // Function to Create A Node  
    static Node newNode(int d, int p){  
        Node temp = new Node();  
        temp.data = d;  
        temp.priority = p;  
        temp.next = null;  
        return temp;  
    }  
   // Return the value at head  
    static int peek(Node head){  
        return (head).data;  
    }  
    // Removes the first element 
    static Node pop(Node head){  
        Node temp = head;  
        (head)  = (head).next;  
        return head; 
    }    
    // Push according to priority  
    static Node push(Node head, int d, int p){  
        Node start = (head);  
        // Create new Node  
        Node temp = newNode(d, p);  
        // Special Case: The head of list has less priority than the new one. 
        // Insert new node before head node and change it to head node.  
        if ((head).priority > p) {  
            // Insert New Node before head  
            temp.next = head;  
            (head) = temp;  
        }  
        else {  
            // Traverse the list and find position to insert the node  
            while (start.next != null &&  
                   start.next.priority < p) {  
                start = start.next;  
            }  
            // Either at the end of the list or at a required position  
            temp.next = start.next;  
            start.next = temp;  
        }  
        return head; 
    }  
    // Function to check if the list is empty  
    static int isEmpty(Node head){  
        return ((head) == null)?1:0;  
    }  
    public static void main(String[] args) {
        Node pQueue = newNode(1, 0);  
        pQueue = push(pQueue, 2, 1);  
        pQueue = push(pQueue, 3, 2);  
        pQueue = push(pQueue, 4, 3);  

        while (isEmpty(pQueue)==0) {  
            System.out.printf("%d ", peek(pQueue));  
            pQueue=pop(pQueue);  
        }  
        System.out.println();
    }  
}
