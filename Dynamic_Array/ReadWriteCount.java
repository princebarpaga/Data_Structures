package Assignment2.Question1;

public interface ReadWriteCount<E> {

    /** A method that writes element e at index i of the underlying array. */
    void write(int i, E e);

    /** A method that returns the element at index i of the underlying array. */
    E read(int i);

    /** A method that keeps the count of the number of times elements were added to (i.e.,
     written into) the underlying array. */
    int numberOfWrites();

    /** A method that keeps the count of the number of times elements of the underlying
     array were accessed (i.e., read). */
    int numberOfReads();

    /** A method that resets both read and write memory back to zero. */
    void resetMemory();

    /** A method that prints out the current content of the array. */
    void printOutContent ();
}
