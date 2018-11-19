package Assignment2.Question1;

import java.util.*;

public class ArrayWithMemoryTest {

    public static Random iterationGenerator = new Random();
    public static Random indexGenerator = new Random();
    public static Random valueGenerator = new Random();

    public static void main(String[] args) {

        ArrayWithMemory<Integer> AWM = new ArrayWithMemory<Integer>(10);
        /** print out array content before testing */
        AWM.printOutContent();

        /** perform a random number of writes, up to 20 */

        int numberOfTestWrites = iterationGenerator.nextInt(21);
        for (int i = 0; i < numberOfTestWrites; i++) {
            AWM.write(indexGenerator.nextInt(10), (Integer) valueGenerator.nextInt(100));
        }

        /** perform a random number of reads, up to 20 */

        int numberOfTestReads = iterationGenerator.nextInt(21);
        Integer temp;
        for (int i = 0; i < numberOfTestReads; i++) {
            temp = AWM.read(indexGenerator.nextInt(10));
        }

        System.out.println("number of write operations: " + AWM.numberOfWrites());
        System.out.println("number of read operations: " + AWM.numberOfReads());
        /** print out array content after testing */
        AWM.printOutContent();

    }
}
