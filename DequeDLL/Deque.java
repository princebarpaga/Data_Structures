package Assignment2.Question2;

public interface Deque<E> {

    public boolean isEmpty(); // is the deque empty

    public int size(); // return the number of items on the deque

    public void addFirst(E item); // insert the item at the front

    public void addLast(E item); // insert the item at the end

    public E removeFirst(); // delete and return the item at the front

    public E removeLast(); // delete and return the item at the end

    public E first(); // return but does not remove the first element

    public E last (); // return but does not remove the last element

    void printOutContent(); // print out the current content of deque

}
