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

    public void insert(int data) {
        TreeNode ns = new TreeNode(data);

        if (root == null) {
            root = ns;
        } else {
            TreeNode current = root;
            while (true) {
                if (data > current.data()) {
                    if (current.right() == null) {
                        current.right() = ns;
                        break;
                    } else {
                        current = current.right();
                    }
                } else {
                    if (current.left() == null) {
                        current.left(ns);
                        break;
                    } else {
                        current = current.left();
                    }
                }
            }
        }
    }

    private void LeftNode(TreeNode root) {
        if (root == null) return;
        else {
            if (root.left() != null) System.out.println(root.left().getdata());
            else count++;
            LeftNode(root.left());
            LeftNode(root.right());
        }
    }


}
