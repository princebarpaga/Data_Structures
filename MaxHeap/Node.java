package MaxHeap;

public class Node {

    private int data;             // data item == key

    // constructor -------------------------------------------------
    public Node(int key) {
        data = key;
    }

    // retrieve the key value --------------------------------------
    public int getKey() {
        return data;
    }

    // change the key value ----------------------------------------
    public void setKey(int id) {
        data = id;
    }
// -------------------------------------------------------------
}
