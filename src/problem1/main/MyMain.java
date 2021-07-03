/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insertRec(4);
        obj.insertRec(2);
        obj.insertRec(8);
        obj.insertRec(3);
        obj.insertRec(5);
        System.out.println("Left Nodes");
        obj.LeftNode();
        System.out.println("no. of Nodes not having left node");
        obj.NotLeft();
    }

}
