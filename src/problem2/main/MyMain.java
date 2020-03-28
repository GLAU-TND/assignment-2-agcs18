/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insertRec(2);
        obj.insertRec(8);
        obj.insertRec(1);
        obj.insertRec(5);
        obj.insertRec(55);
        obj.insertRec(30);
        obj.insertRec(20);
        obj.previouspost();
    }
}
