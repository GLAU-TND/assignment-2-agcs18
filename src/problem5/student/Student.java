/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    public int roll;
    public int a_count;
    public int backlog;

    public Student(int roll, int a_count, int backlog) {
        this.roll = roll;
        this.a_count = a_count;
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", a_count=" + a_count +
                ", backlog=" + backlog +
                '}';
    }
}
