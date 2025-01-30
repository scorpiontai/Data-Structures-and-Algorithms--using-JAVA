package data_structures.linked_lists.linked_list_implementation;

public class Node {

    // init value is a number
    // init next value
    int value;
    Node next;

    // the value set for constructor  parameter
    // every value set(set in constructor) next value is null
    public Node(int data){
        this.value = data;
        this.next = null;
    }
}