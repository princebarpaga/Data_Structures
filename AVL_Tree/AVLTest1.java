package Assignment3.Question1;

import java.io.*;

public class AVLTest1 {
    public static void main(String[] args) throws IOException {

        int key;
        String value;
        AVLTree tree = new AVLTree();

        tree.insert(5, "man");
        tree.insert(4, "dog");
        tree.insert(3, "cat");
        tree.insert(2, "tiger");
        tree.insert(1, "horse");
        tree.insert(6, "ape");
        tree.insert(7, "cow");
        tree.insert(8, "donkey");
        tree.insert(9, "lion");
        tree.insert(10, "elephant");
        tree.insert(11, "goat");
        tree.insert(0, "zebra");
        tree.print();

        System.out.println(tree.inOrder());

    }// main(String[])
}// AVLTest1
