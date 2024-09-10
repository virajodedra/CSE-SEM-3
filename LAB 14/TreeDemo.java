import java.util.*;

class ListNode {
    int data;
    ListNode next;
    
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;
    
    public LinkedList() {
        this.head = null;
    }
  
    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class TreeNode {
    int info;
    TreeNode LPTR;
    TreeNode RPTR;
    
    public TreeNode(int info) {
        this.info = info;
        this.LPTR = null;
        this.RPTR = null;
    }
    
    public static TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.info) {
            root.LPTR = insertNode(root.LPTR, value);
        } else {
            root.RPTR = insertNode(root.RPTR, value);
        }
        return root;
    }
    
    public static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.LPTR);
            System.out.print(node.info + " ");
            inorderTraversal(node.RPTR);
        }
    }
    
    public static void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.info + " ");
            preorderTraversal(node.LPTR);
            preorderTraversal(node.RPTR);
        }
    }
    
    public static void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.LPTR);
            postorderTraversal(node.RPTR);
            System.out.print(node.info + " ");
        }
    }
}

public class TreeInsertionDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] arr = {1, 2, 3, 4, 5, -4, 45, 55, 12, -4};
        
        for (int value : arr) {
            linkedList.add(value);
        }
        
        System.out.println("Linked List:");
        linkedList.printList();
        

        TreeNode root = null;
        ListNode current = linkedList.head;
        
        while (current != null) {
            root = TreeNode.insertNode(root, current.data);
            current = current.next;
        }
        
        // Print tree traversals
        System.out.println("Inorder Traversal:");
        TreeNode.inorderTraversal(root);
        System.out.println("\nPreorder Traversal:");
        TreeNode.preorderTraversal(root);
        System.out.println("\nPostorder Traversal:");
        TreeNode.postorderTraversal(root);
    }
}
