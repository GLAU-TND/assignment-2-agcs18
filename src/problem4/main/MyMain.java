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
        obj.insertRec(10);
        obj.insertRec(3);
        obj.insertRec(30);
        obj.insertRec(37);
        obj.insertRec(13);
        obj.insertRec(1);
        obj.insertRec(7);

        MyQueue my = new MyQueue();
        my.preSuccessor(obj.root);
        my.getPreSucc();


    }
