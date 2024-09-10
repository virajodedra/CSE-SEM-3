import java.util.*;
class TreeNode{
    int info;
    TreeNode LPTR;
    TreeNode RPTR;
    public TreeNode(int info){
        this.info = info;
        this.LPTR = null;;
        this.RPTR = null;
    }
    static TreeNode root;
    static int idx = 0;

    public static TreeNode insertNode(int[] arr){
        if (idx >= arr.length) {
            return null;
        }
        int temp = arr[idx++];
        TreeNode node = new TreeNode(temp);
       
        if (idx < arr.length) {
            if (root == null) {
                root = node;
            }
            if (temp < root.info) {
                node.LPTR = insertNode(arr);
            } else {
                node.RPTR = insertNode(arr);
            }
        }

        return node;
    }
    public static void inorderTraversal(TreeNode node){
        if(node != null){
            inorderTraversal(node.LPTR);
            System.out.print(node.info + " ");
            inorderTraversal(node.RPTR);
        }
    }
    public static void preorderTraversal(TreeNode node){
        if(node != null){
            System.out.print(node.info + " ");
            preorderTraversal(node.LPTR);
            preorderTraversal(node.RPTR);
        }
    }
    public static void postorderTraversal(TreeNode node){
        if(node != null){
            postorderTraversal(node.LPTR);
            postorderTraversal(node.RPTR);
            System.out.print(node.info + " ");
        }
    }
}
public class TreeInsertationDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  {1, 2, 3, 4, 5, -4, 45, 55, 12, -4};

        TreeNode.idx = 0;  // Reset index before starting
        TreeNode.insertNode(arr);

        System.out.println("Inorder Traversal:");
        TreeNode.inorderTraversal(TreeNode.root);
        System.out.println("\nPreorder Traversal:");
        TreeNode.preorderTraversal(TreeNode.root);
        System.out.println("\nPostorder Traversal:");
        TreeNode.postorderTraversal(TreeNode.root);

    }
}
