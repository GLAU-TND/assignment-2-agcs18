/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insertRec(20);
        obj.insertRec(30);
        obj.insertRec(40);
        obj.insertRec(57);
        obj.insertRec(63);
        obj.insertRec(7);
        obj.insertRec(80);

        MyQueue my = new MyQueue();
        my.preSuccessor(obj.root);
        my.getPreSucc();

    }
    }
