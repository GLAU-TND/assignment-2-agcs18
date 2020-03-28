/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class

import problem3.myqueue.MyPriorityQueue;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Aishwarya", 1);
        obj.insert("Sujal", 5);
        obj.insert("Aryan", 4);
        obj.insert("Mahesh", 1);
        obj.insert("Anuj", 2);
        obj.display();
    }
}
