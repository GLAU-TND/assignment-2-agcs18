/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
import problem5.student.Student;

// to define node properties
public class Node {
    public Student student;
    public Node next;

    public Node(Student student) {
        student = student;
        next = null;
    }
}
