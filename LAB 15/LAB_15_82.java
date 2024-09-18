import java.util.*;
public class LAB_15_82{
    static int preIndex;

    static class Node {
        int data;
        Node left, right;
    
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static Node construct(int[] pre, int[] post,  int l, int h, int size){
        if(preIndex >= size || l > h) return null;
        
        Node root = new Node(pre[preIndex]);
        preIndex += 1;

        if(l == h || preIndex >= size) return null;

        int i;
        for (i = l; i <= h; i++) {
            if(post[i] == pre[preIndex])    break;
        }
        if(l <= h){
            root.left = construct(pre, post, l, i, size);
            root.right = construct(pre, post, i + 1, h - 1, size);
        }
        return root;
    }
    private static Node constructTree(int[] pre, int[] post, int size){
        preIndex = 0;
        return construct(pre, post, 0, size - 1, size);
    }

    private static void printInorder(Node root){
        if(root == null) return;

        printInorder(root.left);       
        System.out.println(root.data);
        printInorder(root.right);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();

        int[] pre = new int[n];
        int[] post = new int[n];

        System.out.println("Enter the preorder traversal :");
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }
        System.out.println("Enter the post order traversal : ");
        for (int i = 0; i < n; i++) {
            post[i] = sc.nextInt();
        }

        Node root = constructTree(pre, post, n);
        printInorder(root);
    }
}
