/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor
import problem1.node.TreeNode;
class Node {
    int data;
    Node next;

    public Node(int data) {
        data = data;
        next = null;
    }
}

public class MyQueue {
    Node front;
    Node rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        node.data = data;
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public void preSuccessor(TreeNode root) {
        if (root == null) return;
        else {
            enqueue(root.data);
            preSuccessor(root.left);
            preSuccessor(root.right);
        }
    }

    public void getPreSucc() {
        Node temp = front.next;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }
}
