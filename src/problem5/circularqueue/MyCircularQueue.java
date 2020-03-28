/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue
import problem5.node.Node;
import problem5.student.Student;

public class MyCircularQueue {
    Node front;
    Node rear;
    int count;

    public MyCircularQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(int roll, int backlog, int a_count) {
        Student st = new Student(roll, backlog, a_count);
        Node ns = new Node(st);
        ns.student = st;

        if (front == null) {
            front = ns;
        } else {
            rear.next = ns;
        }

        rear = ns;
        rear.next = front;
        count++;
    }
}
