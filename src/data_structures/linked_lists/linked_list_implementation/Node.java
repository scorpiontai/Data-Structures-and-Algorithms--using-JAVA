package data_structures.linked_lists.linked_list_implementation;

public class Node {

    // init value is a number
    // init next value
    int value;
    Node next;

    // the value set for constructor
    // every value set(set in constructor) next value is null
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}