/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
    public TreeNode left;
    public int data;
    public TreeNode right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}
