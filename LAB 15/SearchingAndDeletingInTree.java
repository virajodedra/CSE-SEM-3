import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SearchingAndDeletingInTree {
    static Node root;
    int max = 0;
    int min = Integer.MAX_VALUE;

    // Insert array of elements into BST
    public static void insertArrayIntoBST(int[] arr) {
        for (int value : arr) {
            root = insert(root, value);
        }
    }

    // insert operations in the tree
    private static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        } else if (root.data < val) {
            root.right = insert(root.right, val);

        } else {
            root.left = insert(root.left, val);
        }

        return root;
    }

    // Searching operations in the tree
    private static boolean search(Node root, int val) {
        if (root == null)
            return false;
        else if (root.data == val)
            return true;

        else if (root.data < val) {
            return search(root.right, val);
        } else {
            return search(root.left, val);
        }
    }

    // Deletation operations in the tree
    private static Node delete(Node root, int val) {
        if (root == null)
            return root;
        else if (root.data < val)
            return delete(root.right, val);
        else if (root.data > val)
            return delete(root.left, val);

        else {
            // Zero child
            if (root.left == null && root.right == null) {
                return root;
            }
            // One child
            else if (root.left == null) {
                return root.right;
            }
            // One child
            else if (root.right == null) {
                return root.left;
            }
            // Two child
            else if (root.right != null && root.left != null) {
                // if(root.left.data > root.right.data){
                // return root.left;
                // }
                // else{
                // return root.right;
                // }
                Node newNode = FindMinNode(root.right);
                root.data = newNode.data;
                root.right = delete(root.right, newNode.data);
            }
        }
        return root;
    }

    private static Node FindMinNode(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    private static Node FindMaxNode(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    private static void preorderTraversal(Node root) {
        if (root == null)
            return;

        System.out.println(root.data + " -> ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // private int findMax(Node root){
    // if(root == null) return max;

    // if(root.data > max) max = root.data;

    // findMax(root.left);
    // findMax(root.right);

    // return max;
    // }
    // private int findMin(Node root){
    // if(root == null) return min;

    // if(root.data < min) min = root.data;

    // findMin(root.left);
    // findMin(root.right);

    // return min;
    // }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert Array");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Preorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Size of the Array: ");
                    int n = sc.nextInt();

                    int[] arr = new int[n];

                    System.out.println("Enter Array Elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("At arr[" + i + "]: ");
                        arr[i] = sc.nextInt();
                    }

                    insertArrayIntoBST(arr);
                    System.out.println("Array elements inserted into the BST.");
                }

                case 2 -> {
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    if (search(root, value)) {
                        System.out.println("/n" + value + " found.");
                    } else {
                        System.out.println("/n" + value + " not found.");
                    }
                }

                case 3 -> {
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    root = delete(root, value);
                    System.out.println("Value deleted.");
                }

                case 4 -> {
                    System.out.println("Preorder traversal of the BST:");
                    preorderTraversal(root);
                    System.out.println();
                }

                case 5 -> {
                    System.out.println("The min Node in the tree is :");
                    Node newNode = FindMinNode(root);
                    System.out.println(newNode);
                }
                case 6 -> {
                    System.out.println("The max Node in the tree is :");
                    Node newNode = FindMaxNode(root);
                    System.out.println(newNode);
                }

                case 7 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice! Please choose again.");
            }
        } while (choice != 7);
    }
}
