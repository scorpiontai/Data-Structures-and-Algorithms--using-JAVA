package data_structures.linked_lists.linked_list_implementation;

import java.util.Arrays;

public class LinkedList {
    /*
     * // set head with instance
     * // set tail with instance
     * // set length with int
     * 
     * // value set in constructor
     * // set head as value in Node
     * // set tail as head
     * // set every length is one with int type data
     * 
     */
    Node head;
    Node tail;
    int length;

    public LinkedList(int value){
        this.head = new Node(value);
        this.tail = head;
        this.length +=1;
    }

    // init append with parameter of value
    // make new instance every set value in node with node instance
    // set next of tail is new instance node
    // set tail is new instance node
    // set increment for legngth value

   public void append(int value){
    Node node =  new Node(value);
    this.tail.next = node;
    this.tail = node;
    this.length+=1;
   }

    // make func for print
    // set list as a int(array) with instance length techniques (one of another best
    // practices)
    // init current as intance in beforeEach and set as a field of head value
    // init integer as 0

    /*
     * declaration loop in while, if current is not null
     * loop as set value array[index] with set value of current
     * // set current is a next value of current
     * //increment for retry loop
     */
    // return the array or data

    public int[] printList(){
        int data[] = new int[length];
        Node current = this.head;
        int i = 0;

        while(current != null){
            data[i] = current.value;
            current = current.next;
            i++;
        }
        return data;
    }

    /*
     * public void prepend(int value) {
     * Node newNode = new Node(value);
     * newNode.next = head;
     * head = newNode;
     * length++;
     * }
     * 
     * public int getLength() {
     * return length;
     * }
     * 
     * public void insert(int index, int value) {
     * if (index < 0 || index > length) {
     * System.err.println("Index Out Of Bounds For Length " + length);
     * } else if (index == 0) {
     * prepend(value);
     * } else if (index == length) {
     * append(value);
     * } else {
     * Node current = head;
     * for (int i = 0; i < index - 1; i++) {
     * current = current.next;
     * }
     * Node newNode = new Node(value);
     * newNode.next = current.next;
     * current.next = newNode;
     * length++;
     * }
     * }
     * 
     * public void remove(int index) {
     * if (index < 0 || index > length) {
     * System.err.println("Index Out Of Bounds For Length " + length);
     * } else if (index == 0) {
     * head = this.head.next;
     * length--;
     * } else {
     * Node current = head;
     * int i;
     * for (i = 0; i < index - 1; i++) {
     * current = current.next;
     * }
     * current.next = current.next.next;
     * length--;
     * if (i == length - 1) {
     * tail = current;
     * }
     * }
     * }
     * 
     * public LinkedList reverse(LinkedList linkedList) {
     * LinkedList newList = new LinkedList(linkedList.head.value);
     * Node current = linkedList.head;
     * while (current.next != null) {
     * current = current.next;
     * Node newNode = new Node(current.value);
     * newNode.next = newList.head;
     * newList.head = newNode;
     * newList.length++;
     * }
     * return newList;
     * }
     */

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(1);
        System.out.println(Arrays.toString(linkedList.printList()));
    }
}
