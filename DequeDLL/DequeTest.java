package Assignment2.Question2;

import java.util.*;

public class DequeTest {

    /** A method that prints the explanation of what the program does. */
    public static void directions() {
        String msg =
            "\nThis program stores first N integers in a deque, where N is provided by the user.\n" +
                "It removes integers one at a time until only one integer is left - the winner.\n" +
                "However, removing an integer is a bit complicated.\n" +
                "An integer is removed from the remaining list as follows:\n" +
                "\t1) move the number at the front of the list to the end of the list;\n" +
                "\t2) move the next number to the end of the list;\n" +
                "\t3) now remove the integer at the front of the list and discard it." +
                "\nWhen only one integer remains, it is declared the winner.\n";
        System.out.println(msg); }

        public static void main(String[] args) {

            DequeDLL<Integer> dq = new DequeDLL<Integer>();
            directions();
            Scanner in = new Scanner(System.in);
            System.out.printf("Enter N: ");
            int n = in.nextInt();

            /** add elements to deque */
            for(int i = 1; i <= n; i++) { dq.addLast(i); };
            /** print out deque content before test */
            dq.printOutContent();

            System.out.printf("Rotate twice & delete the front number until only one number remains\n");
            while(dq.size() > 1) {
                dq.addLast(dq.removeFirst());
                dq.addLast(dq.removeFirst());
                int x = dq.removeFirst();
                System.out.println("After 2 rotations the following element is removed :" + x);
                System.out.println("New deque content is: ");
                dq.printOutContent();
        }

        System.out.printf("\nThe winner is %d\n", dq.removeFirst());
    }

}
