package BinaryTree;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // You can perform various operations on this binary tree, such as traversal, searching, etc.
        // For example, you can perform an inorder traversal like this:
        System.out.println("Inorder traversal:");
        BinaryTree.inorderTraversal(root);
    }
}
