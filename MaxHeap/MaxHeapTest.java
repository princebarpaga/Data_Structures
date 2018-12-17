package MaxHeap;

import java.io.*;

public class MaxHeapTest {
    public static void main(String[] args) throws IOException
    {
        int value, value2;
        MaxHeap theHeap = new MaxHeap(50);  // make a Heap; max size 50
        boolean success;

        theHeap.insert(70);           // insert 10 items
        theHeap.insert(40);
        theHeap.insert(50);
        theHeap.insert(20);
        theHeap.insert(60);
        theHeap.insert(100);
        theHeap.insert(80);
        theHeap.insert(30);
        theHeap.insert(10);
        theHeap.insert(90);

        while(true)                   // until [Ctrl]-[C]
        {
            System.out.print("Commands: (s)how, (i)nsert, (r)emove, (p)rint_sorted: ");
            int choice = getChar();
            switch(choice)
            {
                case 's':                        // show
                    theHeap.displayHeap();
                    break;
                case 'i':                        // insert
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    success = theHeap.insert(value);
                    if( !success )
                        System.out.println("Can't insert; heap full");
                    break;
                case 'r':                        // remove
                    if( !theHeap.isEmpty() )
                        theHeap.remove();
                    else
                        System.out.println("Can't remove; heap empty");
                    break;
                case 'p':                        // print sorted
                    System.out.println(theHeap.printHeapSorted());
                    break;
                default:
                    System.out.println("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
    //-------------------------------------------------------------
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //-------------------------------------------------------------
    public static char getChar() throws IOException
    {
        String s = getString();
        return s.charAt(0);
    }
    //-------------------------------------------------------------
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
//-------------------------------------------------------------
}
