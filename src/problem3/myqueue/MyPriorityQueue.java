/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node head;

    public MyPriorityQueue() {
        head = null;
    }

    public void insert(String name, int roll) {
        Node ns = new Node(name, roll);
        ns.name = name;
        ns.roll = roll;
        Node temp = head;
        if (head == null) {
            head = ns;
        } else {
            if (head.roll > roll) {
                ns.next = head;
                head = temp;
            } else {
                while (temp.next != null && temp.next.roll < roll) {
                    temp = temp.next;
                }
                ns.next = temp.next;
                temp.next = ns;
            }
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name + "\t" + temp.roll);
            temp = temp.next;
        }
    }
}
