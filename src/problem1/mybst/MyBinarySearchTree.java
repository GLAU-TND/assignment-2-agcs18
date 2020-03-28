/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;
    int count;

    public MyBinarySearchTree() {
        root = null;
        count = 0;
    }

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    private void LeftNode(TreeNode root) {
        if (root == null) return;
        else {
            if (root.left != null) {
                System.out.println(root.left.data);
            } else count++;
            LeftNode(root.left);
            LeftNode(root.right);
        }
    }

    public void LeftNode() {
        LeftNode(root);
    }

    public void NotLeft() {
        System.out.println(count);
    }

    public void preorder(TreeNode root) {
        if (root == null) return;
        else {
            System.out.print(root.data + "\t");
            preorder(root.left);
            preorder(root.right);

        }
    }

    public void postorder(TreeNode root) {
        if (root == null) return;
        else {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + "\t");
        }
    }

   public void insertRec(int data) {
       root = insert(root, data);
   }


}
